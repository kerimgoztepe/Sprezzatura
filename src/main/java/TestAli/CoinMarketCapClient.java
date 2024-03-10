package TestAli;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;

import java.io.IOException;

public class CoinMarketCapClient {

    private static final String API_KEY = "cd368"; // Replace with your actual API key
    private static final String BASE_URL = "https://pro-api.coinmarketcap.com/v1";
    private final OkHttpClient client;
    private final Gson gson;

    public CoinMarketCapClient() {
        this.client = new OkHttpClient();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public String getLatestCryptocurrencies(int start, int limit, String convert) throws IOException {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("pro-api.coinmarketcap.com")
                .addPathSegment(BASE_URL)
                .addPathSegment("cryptocurrency")
                .addPathSegment("listings")
                .addPathSegment("latest")
                .addQueryParameter("start", String.valueOf(start))
                .addQueryParameter("limit", String.valueOf(limit))
                .addQueryParameter("convert", convert)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-CMC_PRO_API_KEY", API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            String jsonResponse = response.body().string();
            return jsonResponse;
        }
    }

    // Add other methods for various API endpoints as needed

    public static void main(String[] args) throws IOException {
        CoinMarketCapClient client = new CoinMarketCapClient();
        String response = client.getLatestCryptocurrencies(1, 10, "USD");
        System.out.println(response);
    }
}




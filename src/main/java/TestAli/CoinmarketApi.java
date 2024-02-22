package TestAli;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;

import java.io.IOException;

public class CoinmarketApi {



        private static final String API_KEY = "cd361ad3-fd49-41d6-892e-df0d594545c8"; // Replace with your actual API key
        private static final String BASE_URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";

        public static void main(String[] args) throws IOException {

            OkHttpClient client = new OkHttpClient();

            HttpUrl url = new HttpUrl.Builder()
                    .scheme("https")
                    .host("pro-api.coinmarketcap.com")
                    .addPathSegment("v1")
                    .addPathSegment("cryptocurrency")
                    .addPathSegment("listings")
                    .addPathSegment("latest")
                    .addQueryParameter("start", "1")
                    .addQueryParameter("limit", "10")
                    .addQueryParameter("convert", "USD")
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
                System.out.println(jsonResponse);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Object parsedResponse = gson.fromJson(jsonResponse, Object.class);
                String prettyJson = gson.toJson(parsedResponse);

                System.out.println(prettyJson);
            }
        }
    }



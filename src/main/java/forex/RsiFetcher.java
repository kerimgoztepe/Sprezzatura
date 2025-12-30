package forex;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Basit bir komut satırı aracı: En çok işlem gören 10 paritenin (ör. XAUUSD, EURUSD)
 * saatlik, 4 saatlik, günlük ve haftalık RSI (14) değerlerini Yahoo Finance üzerinden çeker
 * ve yazdırır. Gerçek zamanlıya en yakın veriler için canlı fiyat akışını değil, Yahoo'nun
 * sağladığı son kapanış değerlerini kullanır.
 */
public class RsiFetcher {

    private static final OkHttpClient CLIENT = new OkHttpClient();
    private static final Gson GSON = new Gson();
    private static final int RSI_PERIOD = 14;

    private static final Map<String, String> SYMBOLS = new LinkedHashMap<>();

    static {
        SYMBOLS.put("XAUUSD", "XAUUSD=X");
        SYMBOLS.put("EURUSD", "EURUSD=X");
        SYMBOLS.put("USDCHF", "USDCHF=X");
        SYMBOLS.put("GBPUSD", "GBPUSD=X");
        SYMBOLS.put("USDJPY", "USDJPY=X");
        SYMBOLS.put("AUDUSD", "AUDUSD=X");
        SYMBOLS.put("USDCAD", "CAD=X");
        SYMBOLS.put("NZDUSD", "NZDUSD=X");
        SYMBOLS.put("EURJPY", "EURJPY=X");
        SYMBOLS.put("GBPJPY", "GBPJPY=X");
    }

    public static void main(String[] args) {
        List<IntervalConfig> intervals = Arrays.asList(
                new IntervalConfig("1h", "1h", "1mo"),
                new IntervalConfig("4h", "4h", "2mo"),
                new IntervalConfig("1d", "1d", "6mo"),
                new IntervalConfig("1wk", "1wk", "2y")
        );

        System.out.printf("%-8s %-6s %-10s%n", "Parite", "Periyot", "RSI(14)");
        SYMBOLS.forEach((label, symbol) -> {
            intervals.forEach(interval -> {
                try {
                    double rsi = fetchLatestRsi(symbol, interval);
                    System.out.printf("%-8s %-6s %-10.2f%n", label, interval.name, rsi);
                } catch (Exception e) {
                    System.out.printf("%-8s %-6s %-10s%n", label, interval.name, "n/a");
                }
            });
        });
    }

    private static double fetchLatestRsi(String symbol, IntervalConfig interval) throws IOException {
        List<Double> closes = fetchClosingPrices(symbol, interval);
        return calculateRsi(closes, RSI_PERIOD);
    }

    private static List<Double> fetchClosingPrices(String symbol, IntervalConfig interval) throws IOException {
        String url = String.format(
                "https://query1.finance.yahoo.com/v8/finance/chart/%s?interval=%s&range=%s",
                symbol, interval.queryInterval, interval.range);

        Request request = new Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0")
                .build();

        try (Response response = CLIENT.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("HTTP error: " + response.code());
            }

            String body = response.body() != null ? response.body().string() : "";
            JsonObject root = GSON.fromJson(body, JsonObject.class);
            JsonArray results = root
                    .getAsJsonObject("chart")
                    .getAsJsonArray("result");

            if (results == null || results.size() == 0) {
                throw new IOException("Empty result for " + symbol);
            }

            JsonObject firstResult = results.get(0).getAsJsonObject();
            JsonArray closeArray = firstResult
                    .getAsJsonObject("indicators")
                    .getAsJsonArray("quote")
                    .get(0)
                    .getAsJsonObject()
                    .getAsJsonArray("close");

            List<Double> closes = new ArrayList<>();
            for (JsonElement element : closeArray) {
                if (!element.isJsonNull()) {
                    closes.add(element.getAsDouble());
                }
            }

            if (closes.size() <= RSI_PERIOD) {
                throw new IOException("Yetersiz veri: " + closes.size());
            }

            return closes;
        }
    }

    private static double calculateRsi(List<Double> closes, int period) {
        double gainSum = 0.0;
        double lossSum = 0.0;

        for (int i = 1; i <= period; i++) {
            double change = closes.get(i) - closes.get(i - 1);
            if (change >= 0) {
                gainSum += change;
            } else {
                lossSum += -change;
            }
        }

        double avgGain = gainSum / period;
        double avgLoss = lossSum / period;

        for (int i = period + 1; i < closes.size(); i++) {
            double change = closes.get(i) - closes.get(i - 1);
            double gain = Math.max(change, 0);
            double loss = Math.max(-change, 0);
            avgGain = ((avgGain * (period - 1)) + gain) / period;
            avgLoss = ((avgLoss * (period - 1)) + loss) / period;
        }

        if (avgLoss == 0) {
            return 100.0;
        }

        double rs = avgGain / avgLoss;
        return 100 - (100 / (1 + rs));
    }

    private record IntervalConfig(String name, String queryInterval, String range) {
    }
}


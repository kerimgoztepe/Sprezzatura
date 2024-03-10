package TestAli;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LastThirtyDaysBTC {

        public static void main(String[] args) {
            String baseUrl = "https://api.coingecko.com/api/v3";
            int days = 30;

            Response response = RestAssured.given()
                    .when()
                    .get(baseUrl + "/coins/bitcoin/market_chart?vs_currency=usd&days=" + days)
                    .then()
                    .assertThat()
                    .statusCode(200)
                    .and()
                    .contentType(ContentType.JSON)
                    .extract()
                    .response();

            // Check if "prices" is a list (preferred approach)
            if (response.path("prices") instanceof java.util.List) {
                int pricesSize = response.path("prices.size()");
                for (int i = 0; i < pricesSize; i++) {
                    double openingPrice = response.path("prices[" + i + "][1]");
                    System.out.println("Day " + (i + 1) + " Opening Price: $" + openingPrice);
                }
            } else {
                // Handle prices as an array (alternative approach)
                int pricesLength = response.path("prices.length");
                for (int i = 0; i < pricesLength; i++) {
                    double openingPrice = response.path("prices[" + i + "][1]");
                    System.out.println("Day " + (i + 1) + " Opening Price: $" + openingPrice);
                }
            }
        }
    }




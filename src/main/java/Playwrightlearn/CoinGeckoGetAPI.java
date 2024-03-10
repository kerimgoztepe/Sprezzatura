package Playwrightlearn;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class CoinGeckoGetAPI {


        public static void main(String[] args) {
            String baseUrl = "https://api.coingecko.com/api/v3";
            String apiId = ""; // Add your CoinGecko API ID if needed

            Response response = RestAssured.given()
                    .when()
                    .get(baseUrl + "/coins/bitcoin")
                    .then()
                    .assertThat()
                    .statusCode(200)
                    .and()
                    .contentType(ContentType.JSON)
                    .extract()
                    .response();

            // Parse the JSON response to get specific data
            String id = response.path("id");
            String name = response.path("name");
            String symbol = response.path("symbol");

            System.out.println("Coin ID: " + id);
            System.out.println("Coin Name: " + name);
            System.out.println("Coin Symbol: " + symbol);
        }
    }



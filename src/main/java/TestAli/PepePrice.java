package TestAli;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PepePrice {

    public static void main(String[] args) {
        String baseUrl = "https://api.coinmarketcap.com/v1/cryptocurrency/quotes/latest";
        String coinId = "pepe"; // Replace with PEPE coin ID if different

        Response response = RestAssured.given()
                .when()
                .queryParam("id", coinId)
                .get(baseUrl)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        double price = response.path("data." + coinId + ".quote.USD.price");
        System.out.println("Latest PEPE Coin Price: $" + price);
    }
}




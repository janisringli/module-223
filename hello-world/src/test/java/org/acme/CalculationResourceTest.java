package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculationResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/calculation/add/1/2")
          .then()
             .statusCode(200)
             .body(is("The result is 3.0"));
    }

}
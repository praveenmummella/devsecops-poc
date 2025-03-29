package com.example.devsecops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    @Test
    public void healthCheck() {
        given()
            .port(port)
            .when().get("/health")
            .then().statusCode(200);
    }
}

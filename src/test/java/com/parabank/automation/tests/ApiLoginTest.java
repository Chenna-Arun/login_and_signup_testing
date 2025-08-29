package com.parabank.automation.tests;



import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiLoginTest extends BaseTest {

    @Test
    void testLoginAPI() {
        try {
            RestAssured.baseURI = "https://parabank.parasoft.com/parabank/services/bank";

            var response = given()
                    .contentType("application/json")
                    .body("""
                        {
                          "username": "johndoe",
                          "password": "Password123"
                        }
                        """)
                    .when()
                    .post("/login")
                    .then()
                    .extract().response();

            boolean success = response.statusCode() == 200 && response.asString().contains("session");

            resultService.saveResult("Login_API", success ? "PASSED" : "FAILED", response.asString());
        } catch (Exception e) {
            resultService.saveResult("Login_API", "FAILED", e.getMessage());
        }
    }
}

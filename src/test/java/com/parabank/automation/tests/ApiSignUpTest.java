package com.parabank.automation.tests;



import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiSignUpTest extends BaseTest {

    @Test
    void testSignUpAPI() {
        try {
            RestAssured.baseURI = "https://parabank.parasoft.com/parabank/services/bank";

            var response = given()
                    .contentType("application/json")
                    .body("""
                        {
                          "customer": {
                            "firstName": "John",
                            "lastName": "Doe",
                            "username": "johndoe",
                            "password": "Password123"
                          }
                        }
                        """)
                    .when()
                    .post("/register")
                    .then()
                    .extract().response();

            boolean success = response.statusCode() == 200;

            resultService.saveResult("SignUp_API", success ? "PASSED" : "FAILED", response.asString());
        } catch (Exception e) {
            resultService.saveResult("SignUp_API", "FAILED", e.getMessage());
        }
    }
}

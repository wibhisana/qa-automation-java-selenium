package com.qa.automation.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void sampleApiTest() {

        Response response = RestAssured
                .given()
                .relaxedHTTPSValidation()   // ✅ INI YANG BENAR
                .header("User-Agent", "Mozilla/5.0")
                .baseUri("https://reqres.in")
                .when()
                .get("/api/users/2");

        System.out.println("Status Code = " + response.getStatusCode());
    }
}

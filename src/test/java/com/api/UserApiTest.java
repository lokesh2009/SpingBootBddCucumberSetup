package com.api;

import base.BaseApITest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserApiTest extends BaseApITest {
    @Test
    public void createUserTest() {
        String requestBody = "{ \"name\": \"John\", \"job\": \"Developer\" }";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/users");

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "John");
    }
}


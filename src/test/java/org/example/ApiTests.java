package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApiTests {
    @Test
    void loginReturn200(){
        Response response = RestAssured.given()
                .contentType("application/json")
                .header("x-api-key","reqres-free-v1")
                .body("{\"email\":\"eve.holt@reqres.in\", \"password\":\"cityslicka\"}")
                .post("https://reqres.in/api/login");
        assertEquals(200,response.statusCode(),"Return 200");

        String token = response.jsonPath().getString("token");
        assertNotNull(token,"Token is null");
        assertFalse(token.isEmpty(),"Token is empty");

        System.out.println("Recieved token: "+token);
    }
}

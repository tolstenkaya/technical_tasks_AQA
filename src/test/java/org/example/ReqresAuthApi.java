package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReqresAuthApi implements IAuthApi {
    @Override
    public Response login(){
        Response response = RestAssured.given()
                .contentType("application/json")
                .header("x-api-key","reqres-free-v1")
                .body("{\"email\":\"eve.holt@reqres.in\", \"password\":\"cityslicka\"}")
                .post("https://reqres.in/api/login");
        return response;
    }
}

package com.restapiexample.restfulinfo;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiGetTest extends TestBase {
    @Test
    public void getAllIDInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void getSingleIDInfo() {
        Response response = given()
                .basePath("/employee")
                .pathParam("id", 4)
                .when()
                .get("{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
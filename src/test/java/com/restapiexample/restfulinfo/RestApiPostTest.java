package com.restapiexample.restfulinfo;

import com.restapiexample.model.RestApiPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestApiPostTest extends TestBase {
    @Test
    public void createEmployeeTest() {
        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("Nathan Parrot");
        restApiPojo.setSalary("45000");
        restApiPojo.setAge("25");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}





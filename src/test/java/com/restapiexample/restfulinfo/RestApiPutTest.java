package com.restapiexample.restfulinfo;

import com.restapiexample.model.RestApiPojo;
import com.restapiexample.model.RestCreateUserPojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApiPutTest extends TestBase {

        @Test
        public void updateEmployeesWithPut() {

                RestCreateUserPojo restCreateUserPojo = new RestCreateUserPojo();
                restCreateUserPojo.setEmployee_name("Bianaca Patric");
                restCreateUserPojo.setEmployee_salary("65000");
                restCreateUserPojo.setEmployee_age("34");
                restCreateUserPojo.setProfile_image("http://update.jpg");

                Response response = given()
                        .header("Content-Type", "application/json")
                        .basePath("/update")
                        .pathParam("id", 2941)
                        .body(restCreateUserPojo)
                        .when()
                        .put("/{id}");

                response.prettyPrint();
                response.then().statusCode(200);
        }}


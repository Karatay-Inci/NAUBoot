package com.techproed.day05;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest05 {
    @Test
    public void test05(){
        String url="https://dummy.restapiexample.com/api/v1/employees";
        Response response=given().
                          accept("application/json").
                          when().
                          get(url);
        response.prettyPrint();

        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("data.id", hasSize(24),
                        "data.employee_name",hasItem("Doris Wilder"),
                        "data.employee_age",hasItems(21,61,23));
    }
}

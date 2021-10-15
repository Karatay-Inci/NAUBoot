package com.techproed.day04;

import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest04 {

    @Test
    public void Test04(){

        String url="https://restful-booker.herokuapp.com/booking/7";
        Response response=given().
                          accept("application/json").
                          when().
                          get(url);

        response.then().
                 assertThat().
                 contentType("application/json").
                 statusCode(200).
                 body("firstname", equalTo("Sally"),
                         "totalprice",equalTo(398),
                         "bookingdates.checkin",equalTo("2020-01-27"));
    }
}

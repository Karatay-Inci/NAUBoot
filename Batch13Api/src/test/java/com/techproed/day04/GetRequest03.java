package com.techproed.day04;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest03 {
    @Test
    public void Test03(){
        String url="https://restful-booker.herokuapp.com/booking/7";
        Response response=given().accept("application/json").
                when().get(url);
        response.prettyPrint();
        /* response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
               body("firstname", Matchers.equalTo("Susan")).
                body("lastname", Matchers.equalTo("Wilson")).
                body("totalprice", Matchers.equalTo(979)).
                body("depositpaid", Matchers.equalTo(false)).
                body("bookingdates.checkin", Matchers.equalTo("2016-05-15")).
                body("bookingdates.checkout", Matchers.equalTo("2021-08-28")).
                body("additionalneeds", Matchers.equalTo("Breakfast"));*/

        response.then().
                 assertThat().
                 statusCode(200).
                 contentType(ContentType.JSON).
                 body("firstname", equalTo("Susan"),
                        "lastname", equalTo("Jones") ,
                        "totalprice", equalTo(357),
                        "depositpaid", equalTo(true),
                        "bookingdates.checkin", equalTo("2018-10-11"),
                        "bookingdates.checkout", equalTo("2020-04-14"),
                        "additionalneeds", equalTo("Breakfast"));





    }
}

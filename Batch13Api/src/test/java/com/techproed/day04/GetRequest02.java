package com.techproed.day04;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class GetRequest02 {

     /*GetRequest02:
    * https://restful-booker.herokuapp.com/booking
    -status kodunun 200
    -Contetnt Type'nin "application/json"

    * oldugunu test edin
     */
    @Test
    public void test02(){

        String url="https://restful-booker.herokuapp.com/booking";

        Response response=given().
                          accept("application/json").
                          when().
                          get(url);
        response.prettyPrint();

        response.then().assertThat().
                          statusCode(200).
                          contentType(ContentType.JSON);
        System.out.println(response.getHeaders());
        System.out.println("------------------");
        System.out.println(response.getHeader("Connection"));
    }
    @Test
    public void test03(){
        String url="https://restful-booker.herokuapp.com/booking/1001";

        Response response=given().
                          accept("application/json").
                          when().get(url);
        response.prettyPrint();
        response.then().assertThat().statusCode(404);
        Assert.assertTrue(response.asString().contains("Not Found"));
        Assert.assertFalse(response.asString().contains("API"));        //OR use this-->Assert.assertFalse(response.toString().contains("API"));
    }

}

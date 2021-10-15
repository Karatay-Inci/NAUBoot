package com.techproed.day05;

import com.techproed.testBase.TestBaseJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest06 extends TestBaseJsonPlaceHolder {

    @Test
    public void test(){
        //url olustur
        spec01.pathParams("name","todos",
                          "id",123);
        Response response=given().
                accept("application/json").
                spec(spec01).
                when().get("/{name}/{id}");
        response.prettyPrint();

        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                header("Server",equalTo("cloudflare")).        // body nin icinde de yazabiliriz header i
                body("userId", equalTo(7),
                        "title",equalTo("esse et quis iste est earum aut impedit"),
                       "completed",equalTo(false));

       /* System.out.println(response.getHeader("Server"));
        Assert.assertEquals("cloudflare",response.getHeader("Server"));*/

    }
}

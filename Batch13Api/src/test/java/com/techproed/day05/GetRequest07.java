package com.techproed.day05;

import com.techproed.testBase.TestBaseHerokuApp;
import io.restassured.http.ContentType;
import io.restassured.internal.mapping.JsonbMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest07 extends TestBaseHerokuApp {

    @Test
    public void test(){
        spec02.pathParams("parametre1","booking",
                "parametre2",5);

        Response response=given().
                accept("application/json").
                spec(spec02).
                when().
                get("/{parametre1}/{parametre2}");
        response.prettyPrint();

/*        response.then().assertThat().statusCode(200).contentType(ContentType.JSON).
                body("firstname", equalTo("Jim"),
                        "lastname",equalTo("Jones"),
                       "totalprice",equalTo(369),"depositpaid",equalTo(true),
                        "bookingdates.checkin",equalTo("2015-05-21"),
                        "bookingdates.checkout",equalTo("2016-06-27"));*/

        //we can use Machers and json together

        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);


        JsonPath json=response.jsonPath();
        Assert.assertEquals("Mark",json.getString("firstname"));
        Assert.assertEquals("Wilson",json.getString("lastname"));
        Assert.assertEquals(183,json.getInt("totalprice"));
        Assert.assertEquals(true,json.getBoolean("depositpaid"));
        Assert.assertEquals("2019-01-02",json.getString("bookingdates.checkin"));
        Assert.assertEquals("2021-03-14",json.getString("bookingdates.checkout"));
        //Assert.assertEquals(200,response.statusCode());


    }

}

package com.techproed.day03;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {
    /*GetRequest01:
    * https://restful-booker.herokuapp.com/booking/3 adresine bir rewuest gonderildiginde donecek cvp(responce) icin
    -HTTP status kodunun 200
    -Contetnt Type'nin Json
    -Status Line'in HTTP/1.1 200 OK
    * oldugunu test edin
     */
    @Test
    public void test01() {

        //1-URL belirlenmeli

        String url = "https://restful-booker.herokuapp.com/booking/3";

        //2-Expected result olusturulur  --> body de gelen response assert etmemiz beklenmiyor.-> bu adimi uygulamadik.
        //3-request gonder

        Response response = given().
                            accept("application/json").
                            when().
                            get(url);

        response.prettyPrint();

        //4-response al(actual result)   -->body test yapmadigim icin actual result almiyor
        //5- assertion islemini yap

        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                statusLine("HTTP/1.1 200 OK");

        System.out.println("status code:  "+response.statusCode());
        System.out.println(response.statusLine());
        System.out.println(response.getHeaders());
        System.out.println(response.contentType());

    }
}

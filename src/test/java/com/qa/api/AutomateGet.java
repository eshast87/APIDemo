package com.qa.api;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Epic("When we have PMS we an track the test cases through stories")
@Feature("This is to create as many metadata so that when we have to pull a report we can standarize it")
public class AutomateGet {

    @Owner("Esha Singh")
    @Link(name="allure", type = "mylink")
    @TmsLink("12345")
    @Issue("123")
    @Description("This is a description for better logging of Test cases to enhance Reporting as MetaData")
    @Test(description = "This a Demo test with GET call")
    public void validate_status_code(){
        given().
                baseUri("https://gorest.co.in").
                //Enabled Logging
                log().all().
                when().
                get("/public/v2/posts").
                then().
                //Enabled Logging
                log().all().
                assertThat().
                statusCode(200);
    }

    @Test (description = "This is a Demo test for a Fail GET test")
    public void validate_status_code2(){
        given().
                baseUri("https://gorest.co.in").
                //Enabled Logging
                        log().all().
                when().
                get("/public/v2/posts").
                then().
                //Enabled Logging
                        log().all().
                assertThat().
                statusCode(401);
    }


}


package com.autotrader.stepDefinitions;

import com.autotrader.pages.AdvanceSearchPage;
import com.autotrader.pages.AutotraderPage;
import com.autotrader.pages.Base;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class AutotraderSteps {

    //Logger objecti olusturuyoruz.
    Logger logger = LoggerFactory.getLogger(AutotraderSteps.class);
    AdvanceSearchPage advanceSearchPage = new AdvanceSearchPage();
    AutotraderPage advancePage = new AutotraderPage();

    @Given("User is in landing page")
    public void userIsInLandingPage() {

        String actual = MyDriver.get().getTitle();
        String expected = "Used and New Car Sales, Review - Autotrader";
        Assert.assertEquals(expected, actual);
        // object i kullanarak log olusturuluyor.
        logger.info("Landing page Assertion Successful");


        /**
         * TODO To use logger in your project. add 2 dependency
         * slf4j-api and logback-classic dependencies
         * you can see the type of log details below
         */

	/*	logger.info("loggg");
		String title = "This is the title for home page";
		slf4jlogger.info("We landed- {} -to Homepage ",title);
		slf4jlogger.info("Another way of log  " +title + " fsdfsdfsd");
		slf4jlogger.info("This is without parameter.");
		slf4jlogger.warn("We are warning");
		slf4jlogger.error("This is error");
		System.out.println("This is error");*/

    }

    Base base;

    @Then("Verify that {string} is present")
    public void verifyThatIsPresent(String browser) {
        System.out.println(MyDriver.get().manage().getCookies());
        // Verify that "Browse By Make" is present

        advancePage.verification(browser);
        //base.waitForElement(3000L);


    }

    @And("Verify that search Button is present")
    public void verifyThatSearchButtonIsPresent() {
        advancePage.searchButton();

    }

    @Then("Verify that {string} and {string}")
    public void verifyThatAnd(String make, String model) {
        advancePage.verifyMake(make, model);

    }







    //Second story
    //Second user story to start
    @Given("User click Advance Search link on the home page")
    public void user_click_Advance_Search_link_on_the_home_page()  {

        advanceSearchPage.deleteCookies();
        advanceSearchPage.advanceSearchClick();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // logger.info("Advance Search Button click is Successful");

    }

    @Then("User enter {string} in the zip code text box")
    public void user_enter_in_the_text_box(String zipcode) {


        advanceSearchPage.zipCode(zipcode);
    }

    @Then("User select {string} check box under {string}")
    public void user_select_check_box_under(String string,String str2)  {


        advanceSearchPage.verifyclickCertifiedConvertible(string);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("user update Year {string} to {string}")
    public void user_update_Year_to(String fromYear, String toYear) {

        advanceSearchPage.startDateAndEndDate(fromYear,toYear);
    }

    @Then("user select {string} car from Make,Model and Trim section")
    public void user_select_car_from_Make_Model_and_Trim_section(String car) {

        advanceSearchPage.selectVehicle(car);
    }

    @Then("User clicks Search button")
    public void user_clicks_button()  {

        advanceSearchPage.clickSearchButton();
    }

    @Then("User verifies that he is in result page")
    public void user_verifies_that_he_is_in_result_page() {


    }

    @Then("User verifies that he sees only {string} cars in listing")
    public void user_verifies_that_he_sees_only_cars_in_listing(String car) {



    }

    @Then("Display in console, the number of cars listed in result page")
    public void display_in_console_the_number_of_cars_listed_in_result_page() {


    }

    @Given("choose make as {string}")
    public void choose_make_as(String make) {

        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        advanceSearchPage.multiplechoice(make);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

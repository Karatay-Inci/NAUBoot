package stepdefinitions;

import cucumber.api.java.en.Given;
import pages.GmiBankPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GmiBankStepDefinitions {

    @Given ("user go to {string}")
    public void user_go_to(String homepage) {
        Driver.getDriver().get(homepage);

    }


}

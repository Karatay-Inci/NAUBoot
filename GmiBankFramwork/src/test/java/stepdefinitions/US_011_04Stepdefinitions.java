package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.CommonPageElements;
import pages.aaaaPages;

public class US_011_04Stepdefinitions {
    CommonPageElements userS=new CommonPageElements();
    aaaaPages userS1= new aaaaPages();

   /* @Given ("user go to {string}")
    public void user_go_to(String string){

    }*/

    @Given("user go to sign in")
    public void user_go_to_sign_in() {
        userS.homePageSignIn.click();
        userS.signInButton.click();
    }

    @Given("use valid employee user name")
    public void use_valid_employee_user_name() {
        userS.userName.sendKeys("gerardo.schuppe");

    }

    @Then ("use valid employee user password")
    public void use_valid_employee_user_password() {
        userS.password.sendKeys("$Qc@4wVWbl2A*0", Keys.ENTER);

    }

    @Then("select My Operations Menu")
    public void select_My_Operations_Menu() {
        userS1.myOpera.click();
    }

    @Then("click Management Customers")
    public void click_Management_Customers() {
        userS1.manCustomer.click();
    }

    @When ("click Create New Customer")
    public void click_Create_New_Customer() {
        userS1.createCustomer.click();
    }

    @When("Fill out valid SSN")
    public void fill_out_valid_SSN() {

    }

    @When("Fill out valid middle initial")
    public void fill_out_valid_middle_initial() {

    }

    @When("Fill out valid phone number")
    public void fill_out_valid_phone_number() {

    }

    @When("Fill out valid zip code")
    public void fill_out_valid_zip_code() {

    }

    @When("Fill out valid city")
    public void fill_out_valid_city() {

    }

    @When("choose an account")
    public void choose_an_account() {

    }

    @Then("save it")
    public void save_it() {

    }

}

package stepDefinition2;

import PageFactory4.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSteps2 {

    WebDriver driver;
    LoginPage loginPage;
    // for under the every method --> write code here that turns the phrase above into concrete actions

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        //loginPage = new LoginPage(driver);
        loginPage.enterCredentials(email,password);


       /* driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);

        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);*/
    }

    @When("User clicks on login")
    public void user_clicks_on_login() throws InterruptedException {
        loginPage.clickLogin();
      //  loginPage = new LoginPage(driver);
        Thread.sleep(3000);


        // driver.findElement(By.xpath("//input[@value='Log in']")).click();

    }

    @Then("Page title should be {string}")
    public void Page_title_should_be(String title) throws InterruptedException {
        String expectedTitle = title;
        String ActualTitle = driver.getTitle();
        Assert.assertEquals("not equal", expectedTitle,ActualTitle);

/*
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }
        else{
            Assert.assertEquals(expectedTitle,actualTitle);
        }*/
        Thread.sleep(3000);
    }

    @When("User clicks on logout link")
    public void user_clicks_on_logout_link() throws InterruptedException {
       // loginPage = new LoginPage(driver);
        loginPage.clickLogout();
        Thread.sleep(3000);


        // driver.findElement(By.linkText("Logout")).click();

    }

    @Then("Close the browser")
    public void close_the_browser() {
      //  loginPage = new LoginPage(driver);

        driver.quit();

    }

}

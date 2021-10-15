package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class CheckBoxPageTest {
    CheckBoxPage checkBoxPage=new CheckBoxPage();
     @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCheckBox"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Driver.getDriver().findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();
    }

    /*
    From this URL: https://www.seleniumeasy.com/test/basic-first-form-demo.html
                1. Set the value of id user-message to "QA assessment trial #1"
                2. Click 'Show Message'
                3. Assert that "Your Message" matches "QA assessment trial #1"
*/
    @Test
    public void shoudHaveCorrectMessage() {
        WebElement txtfield = Driver.getDriver().findElement(By.id("user-message"));
        WebElement button = Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Show Message')]"));
        WebElement yourMessage = Driver.getDriver().findElement(By.xpath("//span[@id='display']"));
        txtfield.sendKeys("QA assessment trial #1");
        button.click();
        Assert.assertEquals(yourMessage.getText(), "QA assessment trial #1");
    }

    @AfterMethod
    public void tearDown(){
        Driver.getDriver().close();
    }
}

package Main.java.testNGclasses;

import Main.java.listeners.C_1CustomITestListener1;
import Main.java.listeners.C_2CustomListener1;
import Main.java.listeners.C_3CustomSuiteListener1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({C_2CustomListener1.class, C_1CustomITestListener1.class, C_3CustomSuiteListener1.class})
public class A15_TNG_Extent__ {

    WebDriver driver;
    String baseUrl;

    @BeforeSuite
    public void setup(){

        baseUrl = "https://jqueryui.com/";
        System.setProperty("webdriver.chrome.driver", "/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void  tearDown(){
        driver.quit();
    }
    @AfterTest    //Why did he write aftertest instead of aftermethod

    public void navBack(){
        driver.navigate().back();
    }

    @Parameters({"linknm"})
    @Test
    public void eventsTest(String linknm){
        WebElement desiredLink = driver.findElement(By.linkText("Events"));
        desiredLink.click();
        String currUrl = driver.getCurrentUrl();
        if(linknm.equals("Events"))
            Assert.assertEquals(currUrl, "https://openjsf.org/");
        else
            Assert.assertEquals(currUrl,"https://plugins.jquery.com/");
    }

    @Parameters({"Linknm"})
    @Test
    public void insideValidations(String clickLink){
        WebElement logo, headerText;
        if (clickLink.equals("Events")){
            logo   = driver.findElement(By.xpath("//img[@alt='OpenJS Foundation']/parent::a"));
        }
        else {
            logo = driver.findElement(By.linkText("jQuery Plugin Registry"));
        }
        logo.click();

        if (clickLink.equals("Events")) {
            headerText = driver.findElement(By.xpath("//div[contains(@class, 'instance-1')]//div[@class='nectar-gradient-text']h3"));
            Assert.assertTrue(headerText.getText().equals("Welcome Electron!"));
        } else{
            headerText = driver.findElement(By.cssSelector("#banner-secondary>h1"));
            Assert.assertTrue(headerText.getText().equals("The jQuery Plugin Registry"));
        }
    }
}

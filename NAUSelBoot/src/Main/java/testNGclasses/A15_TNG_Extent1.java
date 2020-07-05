package Main.java.testNGclasses;

import Main.java.Utils.RandomString1;
import Main.java.listeners.C_1CustomITestListener1;
import Main.java.listeners.C_2CustomListener1;
import Main.java.listeners.C_3CustomSuiteListener1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

@Listeners({C_2CustomListener1.class, C_1CustomITestListener1.class, C_3CustomSuiteListener1.class})
public class A15_TNG_Extent1 {

    WebDriver driver;
    String baseUrl;
    ExtentReports report;
    ExtentTest eTest;

    @BeforeTest//@BeforeSuite
    public void setup(){
        baseUrl = "https://jqueryui.com/";
        report = new ExtentReports("/Users/incikaratay/git/NAUSelBoot/src/Main/java/reports/ereport.html");
        eTest = report.startTest("Reporter Demo");
        eTest.log(LogStatus.INFO,"Test stared...");

        System.setProperty("webdriver.chrome.driver", "/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        eTest.log(LogStatus.INFO,"Opened browser, maximized...");
    }

    @AfterTest//@AfterSuite
    public void  tearDown() throws IOException {
        RandomString1 rString = new RandomString1();
        String fileNm = System.getProperty("user.dir") + "\\src\\snippets\\" + rString.getRandom(5) + ".png";//June 3, 32. min
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(fileNm));
        String imgPath = eTest.addScreenCapture(fileNm);
        eTest.log(LogStatus.ERROR,"some error screenshot", imgPath);

        driver.quit();
        report.endTest(eTest);
        report.flush();
    }

    //@AfterTest
    public void navBack(){
        driver.navigate().back();
    }

    @Parameters({"linknm"})
    @Test
    public void eventsTest(String linknm){
        eTest.log(LogStatus.INFO,"inside eventsTest...");

        WebElement desiredLink = driver.findElement(By.linkText("Events"));
        desiredLink.click();
        String currUrl = driver.getCurrentUrl();
        if(linknm.equals("Events")) {
            Assert.assertEquals(currUrl, "https://openjsf.org/");
            eTest.log(LogStatus.PASS, "eventsTest: PASS...");
        }
            else {
            Assert.assertEquals(currUrl, "https://plugins.jquery.com/");
            eTest.log(LogStatus.PASS, "eventsTest: PASS...");
            }
        }

    @Parameters({"Linknm"})
    @Test
    public void insideValidations(String clickLink){
        eTest.log(LogStatus.INFO, "insideValidations...");
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
            eTest.log(LogStatus.PASS, "insideValidations PASS");

        } else{
            headerText = driver.findElement(By.cssSelector("#banner-secondary>h1"));
            Assert.assertTrue(headerText.getText().equals("The jQuery Plugin Registry"));
            eTest.log(LogStatus.PASS, "insideValidations PASS");

        }
    }
}

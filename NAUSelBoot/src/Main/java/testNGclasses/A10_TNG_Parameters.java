package Main.java.testNGclasses;

import Main.java.Utils.RandomString1;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class A10_TNG_Parameters {

    static WebDriver driver;
    static String baseURL;
    static Actions action;  //crate an object of type Actions class

    @Parameters({"browser","platform"})
    @BeforeClass    //similar to @BeforeAll in junit
    public void setUp(String browser, String platform) {
        System.out.println("Browser name is:"+platform);
        System.out.println("Platform name is:"+platform);
        baseURL = "https://jqueryui.com/";
        setBrowser(browser);
        action = new Actions(driver);//initializing the actions class object by passing driver to Actions class constructor
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("@BeforeClass- initiated and navigated to web page ");
    }
    private void setBrowser(String browser){
        switch (browser.toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/Users/incikaratay/Desktop/SELENIUM/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/incikaratay/Desktop/SELENIUM/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;

        }
    }
    @AfterClass //similar to @AfterAll in junit
    public void TearDown() throws IOException {
        RandomString1 rString = new RandomString1();
        String fileNm = System.getProperty("user.dir") + "\\src\\snippets\\" + rString.getRandom(5) + ".png";//June 3, 32. min
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(fileNm));
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @Test
    public void test1(String support) throws InterruptedException {
        String currUrl;
        Thread.sleep(5000);
        WebElement hovSupport = driver.findElement(By.xpath("//section//a[text()='Support']"));
        switch (support){
            case "forum":
                WebElement forums = driver.findElement(By.xpath("//a[text()='Forums']"));
                action.moveToElement(hovSupport).perform();//to hover on a given WebElement
                Thread.sleep(5000);
                action.moveToElement(forums);
                action.click();
                action.perform();//to click on a given WebElement
                Thread.sleep(5000);
                currUrl = driver.getCurrentUrl();
                Assert.assertEquals("https://forum.jquery.com/", currUrl, "url mismatch!!!");
                break;
            case "learning":
                WebElement learning = driver.findElement(By.xpath("//section//a[text()='Learning Center']"));
                action.moveToElement(hovSupport).perform();//to hover on a given WebElement
                Thread.sleep(5000);
                action.moveToElement(learning);
                action.click();
                action.perform();//to click on a given WebElement
                Thread.sleep(5000);
                currUrl = driver.getCurrentUrl();
                Assert.assertEquals("https://learn.jquery.com/", currUrl, "url mismatch!!!");
                break;
            case "commercial":
                WebElement commercial = driver.findElement(By.xpath("//a[text()='Commercial Support']"));
                action.moveToElement(hovSupport).perform();//to hover on a given WebElement
                Thread.sleep(5000);
                action.moveToElement(commercial);
                action.click();
                action.perform();//to click on a given WebElement
                Thread.sleep(5000);
                currUrl = driver.getCurrentUrl();
                Assert.assertEquals("https://jquery.org/support/", currUrl, "url mismatch!!!");
                break;
            }
    }

    @Test
    public void test2() {
        WebElement getStarted = driver.findElement(By.xpath("//a[text()='Getting Started']"));
        getStarted.click();
        System.out.println("@Test2 method");
        Assert.assertTrue(driver.getCurrentUrl().contains("getting-started"));
    }

    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Class1 - @Test3 method");
    }
}

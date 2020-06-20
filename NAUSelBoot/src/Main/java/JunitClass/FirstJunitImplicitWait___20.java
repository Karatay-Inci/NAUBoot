package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirstJunitImplicitWait___20 {

    static WebDriver driver;
    static String baseURL;
    static JavascriptExecutor jse;

    @BeforeAll
    public static void setUp(){
        baseURL = "https://www.bankofamerica.com";
        System.setProperty("webdriver.gecko.driver","/Users/incikaratay/Desktop/SELENIUM/geckodriver");
        driver = new FirefoxDriver();
        //waits for 10 seconds at driver level for webelements before throwing exceptions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        System.out.println("@BeforeAll - initiated and navigated to web page ");
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @Test
    public void test1() {
        WebElement academy = driver.findElement(By.xpath("//a[contains(@href,'khanacademy')]"));

        /*WebElement element = driver.findElement(By.id("my-id"));
        Actions actions = new Actions(driver);
        actions.moveToElement(academy);
        actions.perform();*/

        academy.click();
        System.out.println("@Test1 - executed test");
    }

    @Test
    public void test2(){
        System.out.println("@Test2 - executed test");
    }

    @Test
    public void test3(){
        System.out.println("@Test3 - executed test");
    }


}

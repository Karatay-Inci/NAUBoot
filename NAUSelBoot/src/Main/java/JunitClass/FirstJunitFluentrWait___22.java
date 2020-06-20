package Main.java.JunitClass;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstJunitFluentrWait___22 {

    static WebDriver driver;
    static String baseURL;
    static JavascriptExecutor jse;

    @BeforeAll
    public static void setUp(){
        baseURL = "https://www.bankofamerica.com";
        System.setProperty("webdriver.gecko.driver","/Users/incikaratay/Desktop/SELENIUM/geckodriver");
        driver = new FirefoxDriver();
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
      //  WebDriverWait wait = new WebDriverWait(driver, 5);
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))   // how much total wait time
                .pollingEvery(Duration.ofSeconds(2))    // how much frequency of each wait
                .ignoring(NoSuchElementException.class);  //ignore exception classes

        WebElement academy = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'khanacademy')]")));
        academy.click();
        System.out.println("@Test1 - executed test");
    }
}

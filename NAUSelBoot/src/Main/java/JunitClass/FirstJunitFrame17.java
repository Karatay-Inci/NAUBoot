package Main.java.JunitClass;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class FirstJunitFrame17 {

    static WebDriver driver;
    static String baseURL;

    @BeforeAll
    public static void setUp(){
        baseURL = "https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("@BeforeAll - initiated and navigated to web page ");
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(10000);
        driver.switchTo().frame("courses-iframe");
        List<WebElement> findCourse =driver.findElements(By.xpath("//input[@placeholder='Find a course']"));
        if (findCourse.size()>0){
            findCourse.get(0).sendKeys("my proper course");
            System.out.println("Found the element on the page");
            Thread.sleep(5000);
        }
        else{
            System.out.println("Did not find the element on the page");

        }
    }
}

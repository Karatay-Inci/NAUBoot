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
        WebElement iframeEle = driver.findElement(By.xpath("//*[contains(@src,'courses')]"));

        //driver.switchTo().frame("courses-iframe");    //by ID
        //driver.switchTo().frame("iframe-name");   //by name
       // driver.switchTo().frame(iframeEle); //by WebElement reference
       driver.switchTo().frame(0); //by zero based index position of iframe in the dom

        List<WebElement> findCourse =driver.findElements(By.xpath("//input[@placeholder='Find a course']"));
        if (findCourse.size()>0){
            findCourse.get(0).sendKeys("my proper course");
            System.out.println("Found the element on the page");
            Thread.sleep(5000);
        }
        else{
            System.out.println("Did not find the element on the page");
        }
        driver.switchTo().defaultContent(); // switch focus back to the parent page and outside of iframes
        Thread.sleep(5000);
        driver.findElement(By.id("name")).sendKeys("my name is");
        Thread.sleep(5000);
    }
}

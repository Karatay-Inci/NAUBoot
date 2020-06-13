package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstJunitActions19 {

    static WebDriver driver;
    static String baseURL;
    static Actions action;  //crate an object of type Actions class

    @BeforeAll
    public static void setUp(){
        baseURL = "https://jqueryui.com/";
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver = new ChromeDriver();
        action = new Actions(driver);//initializing the actions class object by passing driver to Actions class.....
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
        Thread.sleep(5000);
        WebElement hovSupport = driver.findElement(By.xpath("//section//a[text()='Support']"));
        WebElement forums = driver.findElement(By.xpath("//a[text()='Forums']"));
        action.moveToElement(hovSupport).perform();//to hover on a given WebElement
        Thread.sleep(5000);
        action.moveToElement(forums).click().perform();//to click on a given WebElement
        Thread.sleep(5000);
        String currUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://forum.jquery.com/",currUrl,"url mismatch.Actual url is:"+currUrl);
        System.out.println("@Test1 - executed test");
    }

    @Test
    public void bDoubleClick_ContextClick42(){
        System.out.println("@Test2 - executed test");
    }

    @Test
    public void test3(){
        System.out.println("@Test3 - executed test");
    }


}

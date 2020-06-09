package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitNavigation7 {

    static WebDriver driver;
    static String baseURL;
    static String currentURL;
    static String pageTitle;

    @BeforeAll
    public static void setUp(){
        baseURL="https://letskodeit.teachable.com/";
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("@BeforeAll - initiated and navigated to web page ");
        getTitleUrl(" - BeforeAll");
    }

    @AfterAll
    public  static void tearDown(){
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @BeforeEach
    public void init()throws InterruptedException {
        driver.navigate().refresh();
        System.out.println("@BeforeEach - refresh the page");
        Thread.sleep(5000);
        getTitleUrl(" - BeforeEach");
    }

    @AfterEach
    public void done()throws InterruptedException {
        driver.navigate().refresh();
        System.out.println("@AfterEach - refresh the page");
        Thread.sleep(5000);
        getTitleUrl(" - AfterEach");
    }

    @Test
    public void  browserNavigated() throws InterruptedException {
        getTitleUrl("@browserNavigated - before clicking practice:");
        driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
        System.out.println("@browserNavigated - clicking directly on practice button ");
        Thread.sleep(5000);
        getTitleUrl("@browserNavigated - after clicking practice:");
        driver.navigate().back();
        System.out.println("@browserNavigated - navigated back to homepage ");
        Thread.sleep(5000);
        getTitleUrl("@browserNavigated - after navigating back:");
        driver.navigate().forward();
        System.out.println("@browserNavigated - navigated forward from homepage to practice page ");
        Thread.sleep(5000);
        getTitleUrl("@browserNavigated - after navigating forward:");

    }
        private static  void getTitleUrl(String whereRU){
            currentURL = driver.getCurrentUrl();
            System.out.println("Current URL:"+whereRU+currentURL);
            pageTitle =driver.getTitle();
            System.out.println("page title"+whereRU+pageTitle);
        }
}

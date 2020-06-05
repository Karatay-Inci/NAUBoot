package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitNavigation {

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
        currentURL = driver.getCurrentUrl();
        System.out.println("BeforeAll - Current URL:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@BeforeAll - page title"+pageTitle);
    }

    @AfterAll
    public  static void tearDown(){
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @BeforeEach
    public void init(){
        driver.navigate().refresh();
        System.out.println("@BeforeEach - refresh the page");
        currentURL = driver.getCurrentUrl();
        System.out.println("@BeforeEach - Current URL:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@BeforeEach - page title"+pageTitle);
    }

    @AfterEach
    public void done(){
        driver.navigate().refresh();
        System.out.println("@AfterEach - refresh the page");
        currentURL = driver.getCurrentUrl();
        System.out.println("@AfterEach - Current URL:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@AfterEach - page title"+pageTitle);
    }

    @Test
    public void  browserNavigated() throws InterruptedException {
        currentURL = driver.getCurrentUrl();
        System.out.println("@browserNavigated - Current URL before clicking practice:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@browserNavigated - page title before clicking practice:"+pageTitle);
        driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
        System.out.println("@browserNavigated - clicking directly on practice button ");
        Thread.sleep(5000);
        currentURL = driver.getCurrentUrl();
        System.out.println("@browserNavigated - Current URL after clicking practice:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@browserNavigated - page title after clicking practice:"+pageTitle);
        driver.navigate().back();
        System.out.println("@browserNavigated - navigated back to homepage ");
        Thread.sleep(5000);
        currentURL = driver.getCurrentUrl();
        System.out.println("@browserNavigated - Current URL after navigating back:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@browserNavigated - page title after navigating back:"+pageTitle);
        driver.navigate().forward();
        System.out.println("@browserNavigated - navigated forward from homepage to practice page ");
        Thread.sleep(5000);
        currentURL = driver.getCurrentUrl();
        System.out.println("@browserNavigated - Current URL after browser forward:"+currentURL);
        pageTitle =driver.getTitle();
        System.out.println("@browserNavigated - page title after browser forward:"+pageTitle);

    }
}

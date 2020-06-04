package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitSel {

    static WebDriver driver;
    static String baseURL;

    @BeforeAll
    public static void setUp(){
        baseURL="https://letskodeit.teachable.com/";
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("@BeforeAll - initiated and navigated to web page ");
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
    }

    @AfterEach
    public void done(){
        driver.navigate().refresh();
        System.out.println("@AfterEach - refresh the page");
    }

    @Test
    public void test1(){
        driver.findElement(By.cssSelector("a.navbar-brand.header-logo")).click();
        System.out.println("@Test1 - clicking directly");
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement logo= driver.findElement(By.cssSelector("a.navbar-brand.header-logo"));
        logo.click();
        System.out.println("@Test2 - clicking WebElement logo");
    }
}

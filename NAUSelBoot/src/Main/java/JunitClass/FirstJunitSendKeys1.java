package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitSendKeys1 {

    static WebDriver driver;
    static String baseURL;

    @BeforeAll
    public static void setUp(){
        baseURL="https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
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
        driver.findElement(By.xpath("//label[text()='Email Address']//following-sibling::div/input")).sendKeys("someeamil@amail.com");
        System.out.println("@Test1 - entered text directly on Email Address");
        driver.findElement(By.xpath("//label[text()='Password']//following-sibling::div/input")).sendKeys("UserPassword");
        System.out.println("@Test1 - entered text directly on Password");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        System.out.println("@Test1 - clicked directly on Log In button");
    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement email= driver.findElement(By.xpath("//label[text()='Email Address']//following-sibling::div/input"));
        WebElement pswrd= driver.findElement(By.xpath("//label[text()='Password']//following-sibling::div/input"));
        WebElement loginBtn= driver.findElement(By.xpath("//input[@value='Log In']"));
        email.sendKeys("someeamil@amail.com");
        pswrd.sendKeys("UserPassword");
        loginBtn.click();
        System.out.println("@Test2 - perform operation with objects");
    }
}

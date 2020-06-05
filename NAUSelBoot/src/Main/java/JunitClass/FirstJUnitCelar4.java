package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitCelar4 {
    static WebDriver driver;
    static String baseURL;

    @BeforeAll
    public static void setUp(){
        baseURL="https://letskodeit.teachable.com/p/practice";
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
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Name'] ")).clear(); //PAY ATTENTION
        System.out.println("@BeforeEach - refresh the page");
    }

    @AfterEach
    public void done(){
        //  driver.navigate().refresh();
        System.out.println("@AfterEach - refresh the page");
    }

    @Test
    public void test1(){
        driver.findElement(By.name("enter-name")).sendKeys("someeamil@amail.com");
        System.out.println("@Test1 - entered text directly on Email Address");

    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebElement nameField= driver.findElement(By.name("enter-name"));
        nameField.sendKeys("UserPassword");
        System.out.println("@Test2 - perform operation with objects");
        Thread.sleep(5000);
    }
}

package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitAttribute13 {

    static WebDriver driver;
    static String baseURL;

    @BeforeAll
    public static void setUp(){
        baseURL = "https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        System.out.println("@BeforeAll - executed once before all test methods in this class");
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
        System.out.println("@AfterAll - close browser session");
    }

    @BeforeEach
    public void init(){
        System.out.println("@BeforeEach - executed once before every test method in this class");
    }

    @AfterEach
    public void done(){
        System.out.println("@BeforeAll - executed once after every test method in this class");
    }

    @Test
    public void test1(){
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
// getAttribute method returns the value of the attribute passed in the method.
// getTagName method retunrs the tag name of the element in use.
// Refactoring the previous list example radios test to give attribute value so we know which radio the program clicks
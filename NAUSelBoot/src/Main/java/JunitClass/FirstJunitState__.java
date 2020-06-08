package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitState__ {

    static WebDriver driver;
    static String baseURL;

    @BeforeAll
    public static void setUp(){
        baseURL="https://www.expedia.com/Hotels";
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
    public void clickCheckIn(){
        driver.findElement(By.xpath("//*[@id='hotel-checkin-hlp']"));
        System.out.println("@BeforeEach - clicking on check-in");
    }

    @Test
    public void enableDate() throws InterruptedException {
        Thread.sleep(5000);
        performEnableClick("//button[(@data-day='28' and @data-month='4') or starts-with(@aria-label,''May 28)]");
        Thread.sleep(5000);
    }
    @Test
    public void disableDate() throws InterruptedException {
        Thread.sleep(5000);
        performEnableClick("//button[text()=' 5']/span[text()='June']/parent::button");
        Thread.sleep(5000);
    }
    private void performEnableClick(String locat){
        WebElement dataField = driver.findElement(By.xpath(locat));
        boolean enabl = dataField.isEnabled();
        if (enabl){
            dataField.click();
            System.out.println("disableDate - clicking on enabled date");
        }
        else{
            System.out.println("disabledDate - date field disabled");
        }
    }
}

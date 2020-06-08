package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJunitDisplay__ {

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
        driver.findElement(By.xpath("//div[@id='traveler-selector-hlp']//button[@data-gcw-component='gcw-traveler-amount-select']")).click();
        System.out.println("@BeforeEach - clicking on Travellers");
    }
    @AfterEach
    public void clickClose(){
        driver.findElement(By.xpath("//div[@id='traveler-selector-hlp']//button[@class='close btn-text']")).click();
        System.out.println("@BeforeEach - clicking on Close");
    }


    @Test
    public void disabledTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='traveler-selector-room-data']//div[@class='children-wrapper']//button[@class='uitk-step-input-button uitk-step-input-plus']")).click();
        verifyHidden("//div[@class='traveler-selector-room-data']//span[text()='Child 1 age']");
        Thread.sleep(5000);
    }

    @Test
    public void aHiddenTest() throws InterruptedException {
        Thread.sleep(5000);
        verifyHidden("//div[@class='traveler-selector-room-data']//span[text()='Child 1 age']");
        Thread.sleep(5000);
    }

    private void verifyHidden(String locat){
        WebElement childField = driver.findElement(By.xpath(locat));
        boolean displ = childField.isEnabled();
        if (displ){
            System.out.println("Element displayed");
        }
        else{
            System.out.println("Element Hidden");
        }
    }
}

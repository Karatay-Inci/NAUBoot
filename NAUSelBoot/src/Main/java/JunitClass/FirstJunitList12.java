package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstJunitList12 {

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

    @Test
    public void radios() throws InterruptedException {
      List<WebElement> listEle = driver.findElements(By.xpath("//div[@class = 'left-align']//input"));
        for (WebElement ele:listEle) {
            ele.click();
            System.out.println("radio button isSelected:"+ele.isSelected());
            Thread.sleep(5000);
        }
    }

    @Test
    public void checks() throws InterruptedException {
        List<WebElement> listEle = driver.findElements(By.xpath("//legend[text()='Checkbox Example']/following-sibling::label/input"));
        for (WebElement ele: listEle) {
            ele.click();
            System.out.println("checkbox:isSelected:"+ele.isSelected());
            Thread.sleep(5000);
        }
    }

    @Test
    public void tableEx() throws InterruptedException {
        List<WebElement> listHead = driver.findElements(By.xpath("//table[@class='table-display']//th"));
        List<WebElement> listAuthor = driver.findElements(By.xpath("//table[@class='table-display']//td[1]"));
        List<WebElement> listCourse = driver.findElements(By.xpath("//table[@class='table-display']//td[2]"));
        List<WebElement> listPrice= driver.findElements(By.xpath("//table[@class='table-display']//td[3]"));


        for (WebElement hele: listHead) {
            System.out.println("Table Header is:"+hele.getText());
        }
        for (WebElement aele: listAuthor) {
            System.out.println("Author is:"+aele.getText());
        }
        for (WebElement cele: listCourse) {
            System.out.println("Course  is:"+cele.getText());
        }
        for (WebElement pele: listPrice) {
            System.out.println("Price is:"+pele.getText());
        }
    }
}

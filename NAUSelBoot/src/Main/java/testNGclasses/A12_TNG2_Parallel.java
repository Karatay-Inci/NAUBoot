package Main.java.testNGclasses;
import Main.java.listeners.C_1CustomITestListener1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass; //you can use just this "import org.testng.annotations.*;" for 4-5-6 lines
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({C_1CustomITestListener1.class})
public class A12_TNG2_Parallel {
    WebDriver driver;
    Actions action;
    String baseURL;

    @BeforeClass
    public void setUp(){
        String baseURL ="https://jqueryui.com/";
        //create browser driver instance.
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.get(baseURL);
        driver.manage().window().maximize();
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test   //Hover on Contribute botton and click on each of the menu items
    public void test1(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        
        //hover on a given element Contribute
        WebElement hovContri = driver.findElement(By.xpath("//a[text()='Contribute']"));
        wait.until(ExpectedConditions.visibilityOf(hovContri));
        action.moveToElement(hovContri).perform();
        
        // click on the given element
        WebElement eachEle = driver.findElement(By.xpath("//a[text()='CLA']"));
        wait.until(ExpectedConditions.elementToBeClickable(eachEle)).click();

    }
    @Test   //validate landing url and page element
    public void test2(){
        String currUrl = driver.getCurrentUrl();
        Assert.assertEquals(currUrl,"https://openjsf.org/");

        String openJSAlt = driver.findElement(By.xpath("//img[@class='stnd ']")).getAttribute("alt");
        Assert.assertEquals(openJSAlt,"OpenJS Foundation");
    }
}

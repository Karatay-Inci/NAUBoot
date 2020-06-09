package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FirstJunitSelectMulti11 {

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
    public void multiaa_SelectEach() throws InterruptedException {
        System.out.println("@dropSelectEach - executed test");
        WebElement dropEle = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(dropEle);
        sel.selectByValue("orange"); //select using the value attribute of the option tag element
        Thread.sleep(5000);
        sel.selectByVisibleText("Apple");    //select using the text of the option tag element
        Thread.sleep(5000);
        sel.selectByIndex(2);   //selects Peach because its the first option at index 0
        Thread.sleep(5000);
    }

    @Test
    public void multiab_DeSelectEach() throws InterruptedException {
        System.out.println("@dropSelectEach - executed test");
        WebElement dropEle = driver.findElement(By.name("multiple-select-example"));
        Select sel = new Select(dropEle);
        sel.deselectByValue("orange"); //select using the value attribute of the option tag element
        Thread.sleep(5000);
        sel.deselectByVisibleText("Apple");    //select using the text of the option tag element
        Thread.sleep(5000);
        sel.deselectByIndex(2);   //selects Peach because its the first option at index 0
        Thread.sleep(5000);
    }

    @Test
    public void multiac_SelectAll() throws InterruptedException {
        System.out.println("@dropSelectAll - executed test");
        WebElement multiEle = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(multiEle);
        List<WebElement> opts = sel.getOptions(); //returns a list of WebElements of all the option tag inside select
        for (WebElement ele: opts) {
            System.out.println("Option is:"+ele.getText()); //get the visible text of the element
            sel.selectByVisibleText(ele.getText()); //select using the text of the option tag element
            Thread.sleep(5000);
        }
        for (WebElement ele: opts) {
            System.out.println("deselection Option is:"+ele.getText()); //get the visible text of the element
            sel.selectByVisibleText(ele.getText()); //deselect using the text of the option tag element
            Thread.sleep(5000);
        }
    }

    @Test
    public void multiac_getSelected() throws InterruptedException {
        System.out.println("@dropSelectAll - executed test");
        WebElement multiEle = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(multiEle);
        List<WebElement> opts = sel.getOptions(); //returns a list of WebElements of all the option tag inside select
        for (WebElement ele: opts) {
            System.out.println("Option is:"+ele.getText()); //get the visible text of the element
            sel.selectByVisibleText(ele.getText()); //select using the text of the option tag element
            Thread.sleep(5000);
        }

        sel.deselectByIndex(1); //de selects Orange option
        //  returns a list of WebElements of all the "selected" option tags inside select
        List<WebElement> selOpts = sel.getAllSelectedOptions();
        for (WebElement ele: selOpts) {
            System.out.println("Selected Option is:"+ele.getText()); //get the visible text of the element
        }

        sel.deselectAll();
        Thread.sleep(5000);
        selOpts = sel.getAllSelectedOptions();
        System.out.println("selected options count: "+selOpts.size());

        System.out.println("isMultiple:"+sel.isMultiple());
    }
}

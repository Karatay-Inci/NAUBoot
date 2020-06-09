package Main.java.JunitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitRadio_CheckBox6 {
    static WebDriver driver;
    static String baseURL;

    boolean benzSelected ;
    boolean bmwSelected ;
    boolean hondaSelected ;

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
    public void radioTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='benzradio']")).click();
        System.out.println("@Test1 - clicked on benz radio");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
        System.out.println("@Test1 - clicked on bmw radio");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='hondaradio']")).click();
        System.out.println("@Test1 - clicked on honda radio");
        Thread.sleep(5000);

         benzSelected = driver.findElement(By.xpath("//input[@id='benzradio']")).isSelected();
         bmwSelected = driver.findElement(By.xpath("//input[@id='bmwradio']")).isSelected();
         hondaSelected = driver.findElement(By.xpath("//input[@id='hondaradio']")).isSelected();

        System.out.println("Radio benzSelected: "+benzSelected);
        System.out.println("Radio bmwSelected: "+bmwSelected);
        System.out.println("Radio hondaSelected: "+hondaSelected);

    }
    @Test
    public void checkBoxTest() throws InterruptedException {
        WebElement bmwCheckBox= driver.findElement(By.id("bmwcheck"));  // OR use XPATH --->  By.xpath("//input[@id='bmwcheck']")
        WebElement benxCheckBox= driver.findElement(By.id("benzcheck"));
        WebElement hondaCheckBox= driver.findElement(By.id("hondacheck"));
        bmwCheckBox.click();
        Thread.sleep(5000);
        benxCheckBox.click();
        Thread.sleep(5000);
        hondaCheckBox.click();
        Thread.sleep(5000);

        boolean benzSelected = driver.findElement(By.xpath("//input[@id='benzcheck']")).isSelected();
        boolean bmwSelected = driver.findElement(By.xpath("//input[@id='bmwcheck']")).isSelected();
        boolean hondaSelected = driver.findElement(By.xpath("//input[@id='hondacheck']")).isSelected();

        System.out.println("check benzSelected: "+benzSelected);
        System.out.println("check bmwSelected: "+bmwSelected);
        System.out.println("check hondaSelected: "+hondaSelected);

        bmwCheckBox.click();
        Thread.sleep(5000);
        benxCheckBox.click();
        Thread.sleep(5000);
        hondaCheckBox.click();
        Thread.sleep(5000);

         benzSelected = driver.findElement(By.xpath("//input[@id='benzcheck']")).isSelected();
         bmwSelected = driver.findElement(By.xpath("//input[@id='bmwcheck']")).isSelected();
         hondaSelected = driver.findElement(By.xpath("//input[@id='hondacheck']")).isSelected();

        System.out.println("check benzSelected: "+benzSelected);
        System.out.println("check bmwSelected: "+bmwSelected);
        System.out.println("check hondaSelected: "+hondaSelected);
    }
}

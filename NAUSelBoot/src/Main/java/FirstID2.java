package Main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstID2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();            // hoca kendi sayfasinda olusan bi hata icin yazdi.

        driver.get("http://bankofamerica.com");

        driver.findElement(By.id("navChecking")).click();  //by= class
    }
}

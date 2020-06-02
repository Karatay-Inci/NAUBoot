package Main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCssSelector_ID8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://bankofamerica.com");

        // #idvalue
        driver.findElement(By.cssSelector("#NAV_BUSINESS_ADVANTAGE")).click();

        // tag#idvalue
        //driver.findElement(By.cssSelector("a#NAV_BUSINESS_ADVANTAGE")).click();
    }

}

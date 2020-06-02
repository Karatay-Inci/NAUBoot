package Main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCssSelector_class_Append10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bankofamerica.com");
        // tag.class1.class2.class3 and so on
           driver.findElement(By.cssSelector("span.spa-btn.spa-btn--primary.spa-btn--medium.masthead-cta-bt")).click();
    }
}

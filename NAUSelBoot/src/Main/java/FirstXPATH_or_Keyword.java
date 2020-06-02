package Main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstXPATH_or_Keyword {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.findElement(By.xpath("//span[text()='Get started'"+
                                    " or text()='Click to get stared'"+
                                    " or text()='Open'"+
                                    " or text()='See options'"+
                                    " or text()='Click to see options'"+
                                    " or text()='Learn more'"+
                                    " or text()='Continue'"+
                                    " or text()='Click to open']")).click();
    }
}

package Main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXPATH {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");

        driver.findElement(By.xpath("//*[@id='product']/tbody/tr[4]/td[3]"));//---->Copy XPath
        driver.findElement(By.xpath("//td[text()='JavaScript Programming Language']/following-sibling::td"));//-->formed using xpath features

        driver.findElement(By.xpath("//*[@id='product']/tbody/tr[4]/td[2]"));//---->from dom direct copy
        driver.findElement(By.xpath("//td[text()='25']/preceding-sibling::td[1]"));//--->formed using xpath

    }
}

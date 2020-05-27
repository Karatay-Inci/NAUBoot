package Main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSafari {
    public static void main(String[] args) {

        System.out.println("Driver location is : "+System.getProperty("webdriver.edge.driver"));

        WebDriver driver3 = new SafariDriver();

        driver3.get("http://ebay.com");

    }
}

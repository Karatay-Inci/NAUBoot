package Main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFireFox {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/Users/incikaratay/Desktop/SELENIUM/geckodriver");
        System.out.println("Driver location is : "+System.getProperty("webdriver.gecko.driver"));
        WebDriver driver1= new FirefoxDriver();
        driver1.get("http://na.edu");

    }
}

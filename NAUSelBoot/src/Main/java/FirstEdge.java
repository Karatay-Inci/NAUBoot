package Main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","/Users/incikaratay/Desktop/SELENIUM/msedgedriver");
        System.out.println("Driver location is : "+System.getProperty("webdriver.msedge.driver"));

        WebDriver driver2 = new EdgeDriver();

        driver2.get("http://ebay.com");
    }
}

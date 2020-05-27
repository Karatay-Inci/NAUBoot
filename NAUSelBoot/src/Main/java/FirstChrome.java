package Main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstChrome {
    public static void main(String[] args) {
        /*location of the driver executable
        * For mac, navigate to file location, right click and click Get Info.Grab the location value, add the filename at the end
        *      /Users/incikaratay/Desktop/SELENIUM  -->/chromedriver   */
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver");

        System.out.println("driver location is:"+System.getProperty("webdriver.chrome.driver"));

        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
    }
}

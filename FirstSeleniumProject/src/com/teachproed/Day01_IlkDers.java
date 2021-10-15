package com.teachproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("https://amazon.com/");
        //driver.close();  close current tab
        driver.quit();   //close window

    }

}

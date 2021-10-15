package com.teachproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String amazonTitle=driver.getTitle();
        if (amazonTitle.contains("Smile more")){
            System.out.println(amazonTitle + " contains Smile more");
        }else
            System.out.println(amazonTitle + " have not contains Smile more");
        driver.quit();
    }

}

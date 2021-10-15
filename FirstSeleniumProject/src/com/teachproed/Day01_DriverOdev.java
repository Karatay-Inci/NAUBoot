package com.teachproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String googleTitle=driver.getTitle();
        System.out.println("google title : "+googleTitle);

        driver.navigate().to("https://www.youtube.com");
        String youtubeTitle=driver.getTitle();
        System.out.println("youtube title : "+youtubeTitle);

        String youtubeURL=driver.getCurrentUrl();
        System.out.println("youtube URL : "+youtubeURL);

        driver.navigate().back();

        String googleURL=driver.getCurrentUrl();
        System.out.println("google URL : "+googleURL);

        driver.quit();

    }

}

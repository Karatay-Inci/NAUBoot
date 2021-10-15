package com.teachproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Review {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        String youTubeURL=driver.getCurrentUrl();
        System.out.println(youTubeURL);
        if (youTubeURL.toLowerCase().contains("youtube")){
            System.out.println(youTubeURL+" contains");
        }else {
            System.out.println(youTubeURL+"https://www.youtube.com");
        }
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        String amazonTitle=driver.getTitle();
        System.out.println("Amazon title: "+amazonTitle);
        if (amazonTitle.toLowerCase().contains("Amazon")){
            System.out.println(amazonTitle+" contains");
        }
        else {
            System.out.println("Actual Title:"+amazonTitle);
        }
        String amazonURL=driver.getCurrentUrl();
        System.out.println("amazon.com's URL: "+amazonURL);
        if (amazonURL.contains("https://www.amazon.com")){
            System.out.println(" contains ");
        }
        else {
            System.out.println("Actual address:"+amazonURL);
        }

        driver.quit();

    }
}

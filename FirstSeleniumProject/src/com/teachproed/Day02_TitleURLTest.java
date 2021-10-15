package com.teachproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitlieURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        String youTubeTitle=driver.getTitle();
        System.out.println(youTubeTitle);
        if (youTubeTitle.contains("video")){
            System.out.println(youTubeTitle+" Title: contains video");
        }else {
            System.out.println(youTubeTitle+" Title: not contains video");
        }
        driver.quit();
    }
}

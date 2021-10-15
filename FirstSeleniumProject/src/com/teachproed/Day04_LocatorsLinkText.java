package com.teachproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //for upload webpage

        driver.manage().window().maximize();
        driver.get("https://a.testaddressbook.com/");

        WebElement advance=driver.findElement(By.id("details-button"));
        advance.click();
        WebElement pro=driver.findElement(By.id("proceed-link"));
        pro.click();

        WebElement signInLink=driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        WebElement homeLink=driver.findElement(By.partialLinkText("Home"));
        homeLink.click();

        driver.quit();
    }
}

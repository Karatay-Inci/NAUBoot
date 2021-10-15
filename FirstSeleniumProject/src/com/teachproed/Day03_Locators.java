package com.teachproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //for upload webpage

        driver.manage().window().maximize();
        driver.get("https://a.testaddressbook.com");

        WebElement advance=driver.findElement(By.id("details-button"));
        advance.click();
        WebElement pro=driver.findElement(By.id("proceed-link"));
        pro.click();

        WebElement signInLink=driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement emailBox=driver.findElement(By.id("session_email"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordBox=driver.findElement(By.id("session_password"));
        passwordBox.sendKeys("Test1234!");

        WebElement signButton=driver.findElement(By.name("commit"));
        signButton.click();

        String pageTitle=driver.getTitle();
        if (pageTitle.toLowerCase().contains("address book")){
            System.out.println("This is right page");
        }else{
            System.out.println("This is wrong page");
        }

        driver.quit();


    }
}

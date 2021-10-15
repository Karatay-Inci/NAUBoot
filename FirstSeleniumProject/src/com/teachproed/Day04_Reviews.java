package com.teachproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Reviews {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //for upload webpage
        driver.manage().window().maximize();

        driver.get("https://amazon.com/");
        WebElement searchLine=driver.findElement(By.id("twotabsearchtextbox"));
        searchLine.sendKeys("computers");
        WebElement sButton=driver.findElement(By.id("nav-search-submit-button"));
        sButton.click();
        WebElement results=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div"));
        if (results.isDisplayed()){
            System.out.println("visible:       "+results.getText());
        }
        else{
            System.out.println("not visible");
        }
        driver.quit();
    }
}

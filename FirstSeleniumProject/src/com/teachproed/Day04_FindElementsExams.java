package com.teachproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElementsExams {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/incikaratay/Desktop/SELENIUM/chromedriver2");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //for upload webpage
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        WebElement searchButton=driver.findElement(By.name("q"));
        searchButton.sendKeys("city bike");
        searchButton.submit();

        WebElement viewsNumbers=driver.findElement(By.id("result-stats"));
        String views=viewsNumbers.getText();
        System.out.println("views: "+views);
        WebElement shopping=driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a"));
        shopping.click();
        driver.quit();
    }
}

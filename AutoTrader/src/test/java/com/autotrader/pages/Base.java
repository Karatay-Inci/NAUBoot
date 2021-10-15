package com.autotrader.pages;

import com.autotrader.utilities.MyDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class Base {
    //When we use @FindBy annotation in this page.
    //for initialize the @FindBy annotations
    public Base() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    //To use for certain wait time we use this method.
    public void waitForElement(Long miliSeconds)  {
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void deleteCookies(){
        MyDriver.get().manage().deleteAllCookies();
    }

    /**
     * Web site was not allowing the automation browser
     * And I saw that browser was doing it with cookies and
     * I cleaned the cookies every page navigation to make sure
     * my automation works.
     *//*

    public static void clearCookies() {

        //if you want to see cookies --> below lines
        Set<Cookie> a = MyDriver.get().manage().getCookies();
        System.out.println(a);

        //Delete all the cookies
        MyDriver.get().manage().deleteAllCookies();
    }
    public void scrollDown(WebElement link){

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)MyDriver.get();

        *//*
         * This script must scroll, until link element is visible
         * once link element visible, it will stop scrolling
         * argumnets[0] = means first webelement after comma (link)
         * argumnets it's an array of elements after comma
         * argumnets[0] =link web element, it can be any web element
         * *//*
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        javascriptExecutor.executeScript("argument[0].scrollIntoView(true)",link);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void wait2(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }*/
}

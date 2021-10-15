package com.autotrader.pages;

import com.autotrader.utilities.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AdvanceSearchPage extends Base{

    @FindBy(xpath = "//a[contains(text(),'Advanced Search')]")      /*  //a[@data-qaid='adv_srch']      */
    public WebElement clickAdvanceSearch;

    @FindBy(xpath = "//input[contains(@type,'tel')]")
    public WebElement enterZipCode;

    @FindBy(xpath = "//div[contains(text(),'Certified')]")
    public WebElement selectCertified;

    @FindBy(xpath = "//div[contains(text(),'Convertible')]")
    public WebElement selectConvertible;

    @FindBy(xpath = "//select[contains(@name,'startYear')]")
    public WebElement selectFrom;

    @FindBy(xpath = "//select[contains(@name,'endYear')]")
    public WebElement selectTo;

    @FindBy(xpath = "//select[contains(@name,'makeFilter0')]")
    public WebElement selectBMW;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//title[contains(text(),'Certified BMW Convertibles for sale')]")
    public WebElement userInPage;

    @FindBy(xpath = "//h2[contains(@data-cmp,'subheading')]")
    public WebElement onlyBMW;

    @FindBy(xpath = "//div[contains(@data-cmp,'inventoryListing')]")
    public WebElement numberOfBMW;

    /**
     * Scenario 2 starting.
     */

    public void advanceSearchClick(){
        //Trying to make sure page loaded and all the elements visible.
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //to see the process putting 3 second wait.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickAdvanceSearch.click();
    }

    /**
     * After navigating Advance Search page
     * We are filling required fields to click search button.
     */

    //Entering zipcode
    public void zipCode(String zip){

        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // clearCookies();

        enterZipCode.clear();
        enterZipCode.sendKeys(zip);
    }

    //Clicking the Certificate and Convertible checkboxes.
    public void verifyclickCertifiedConvertible(String a){

        if (a.equalsIgnoreCase(selectCertified.getText())){
            selectCertified.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            WebElement link=selectConvertible;
            //scrollDown(link);
            selectConvertible.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Choosing the "from" to "To" years range.
    public void startDateAndEndDate(String from, String to){
        MyDriver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select select = new Select(selectFrom);
        select.selectByValue(from);

        Select select1 = new Select(selectTo);
        select1.selectByValue(to);

    }
    public void selectVehicle(String car){
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(selectBMW);//??????????
        select.selectByValue(car);
    }
    //Clicking the Search button
    public void clickSearchButton(){
        WebElement link = clickSearchButton;
     //  scrollDown(link);
        clickSearchButton.click();
    }


    public void multiplechoice(String make) {
    }

    /**
     * After clicking search button
     * We are verifying that result is correct
     */

    //Verifying the title that we are in result page.
    /**/
}

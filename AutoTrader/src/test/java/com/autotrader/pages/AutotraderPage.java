package com.autotrader.pages;

//import com.autotrader.searchSteps.MyStepdefs;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;

import com.autotrader.utilities.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutotraderPage extends Base{

    Logger logger= LoggerFactory.getLogger(AutotraderPage.class);


    /**
     * Title
     * Browse By Make
     * Nrowse by Style
     * Advanced Search
     * Dropdown => Make and Model
     *
     */


    @FindBy ( xpath = "//button[@data-qaid='lnk-browseByMake']" )  //   //button[contains(@title,'Browse by Make')]    //button[contains(text(),'Browse by Make')]
    public WebElement browserByMake;

    @FindBy ( xpath = "//button[contains(@title,'Browse by Style')]" )  //    //button[contains(text(),'Browse by Style')]
    public WebElement browserByStyle;

    @FindBy ( xpath = "//a[contains(text(),'Advanced Search')]" )
    public WebElement advancedSearch;

    @FindBy ( xpath = "//button[@id='search']" )
    public WebElement searchButton;

    @FindBy ( xpath = "//select[@id='makeCode']" )
    public WebElement filterByMake;


    @FindBy ( xpath = "//select[@id='ModelCode']" )
    	public WebElement filterByModel;

    //Verifying the make,style and advance search elements visibility.
    public void verification(String expected) {

        if (expected.equalsIgnoreCase(browserByMake.getText())) {
            String actual = browserByMake.getText();
            Assert.assertEquals(expected, actual);
            logger.info("Expected result : {}",expected);    //??????????
            logger.info("Actual result : {}",actual);


        } else if (expected.equalsIgnoreCase(browserByStyle.getText())) {
            String actual = browserByStyle.getText();
            Assert.assertEquals(expected, actual);
            logger.info("Expected result : {}",expected);
            logger.info("Actual result : {}",actual);


        } else {
            String actual = advancedSearch.getText();
            Assert.assertEquals(expected, actual);
            logger.info("Expected result : {}",expected);
            logger.info("Actual result : {}",actual);

        }
    }
//Verifying the Search Button is enabled
    public void searchButton(){
        Assert.assertTrue(searchButton.isDisplayed() && searchButton.isEnabled());
        logger.info("Search button is visible and enabled ");
    }

//Verifying th Make and Model dropdowns are visible
    public void verifyMake(String make, String model){

        //By Make is Displayed and Enabled
        Assert.assertTrue(filterByMake.isDisplayed() && filterByMake.isEnabled());
        logger.info("{} is Enabled nad Visible", make);

        //By Model is dependent on Make. By Model is displayed but not enabled.
        Assert.assertTrue(filterByModel.isDisplayed() && !filterByModel.isEnabled());
        logger.info("{} is Enabled nad Visible",model);
    }

}

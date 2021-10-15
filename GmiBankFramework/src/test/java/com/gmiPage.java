package com;

import com.gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmiPage {

        public gmiPage(){

            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy (xpath = "dropdown-toggle nav-link")
        public  WebElement signUpHeader;
    }



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GmiBankPage {

    public GmiBankPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(how= How.CLASS_NAME,using = "dropdown-toggle nav-link")
    public static WebElement signUpHeader;
}

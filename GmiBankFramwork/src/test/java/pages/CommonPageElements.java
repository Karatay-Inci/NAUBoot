package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPageElements {
    public CommonPageElements(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy (id="account-menu")
    public WebElement loginModule;

    @FindBy(linkText = "Sign in")
    public  WebElement homePageSignIn;

  /*  @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public  WebElement homePageSignIn;*/
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(css="input#password")
    public WebElement password;

    @FindBy(css = "button.btn.btn-primary")
    public WebElement signInButton;

    @FindBy(linkText = "My Operations")
    public  WebElement myOperations;

    @FindBy(linkText = "Manage Accounts")
    public  WebElement manageAccounts;
}

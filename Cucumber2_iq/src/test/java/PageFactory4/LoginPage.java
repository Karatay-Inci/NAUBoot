package PageFactory4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
    public WebDriver ldriver;

    public LoginPage(WebDriver driver){
        this.ldriver =driver;
        PageFactory.initElements(ldriver,this);
    }

    @FindBy(how= How.XPATH,using="//input[@id='Email']")
    WebElement txtEmail;

    @FindBy(how=How.XPATH,using="//input[@id='Password']")
    WebElement txtPassword;

    @FindBy(how=How.XPATH,using="//input[@value='Log in']")
    WebElement loginButton;

    @FindBy(how=How.LINK_TEXT,using = "Logout")
    WebElement logoutButton;


    public void enterCredentials(String email, String password) {
        txtEmail.clear();
        txtEmail.sendKeys(email);

        txtPassword.clear();
        txtPassword.sendKeys(password);

    }
    public void clickLogin(){
        loginButton.click();
    }

    public void clickLogout(){
        logoutButton.click();
    }
}

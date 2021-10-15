package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class aaaaPages {
    public aaaaPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myOpera;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public  WebElement manCustomer;

    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public  WebElement createCustomer;


}

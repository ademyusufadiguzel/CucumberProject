package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Login']//*[name()='svg']")
    public WebElement loginHomePage;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.=' Login']")
    public WebElement loginLoginPage;

    @FindBy(id = "dropdown-basic-button")
    public WebElement profileButton;

}

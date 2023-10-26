package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



//ortak locete alınacak


    @FindBy(xpath = "//*[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement loginButton;














}

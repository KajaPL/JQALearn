package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
    @FindBy(id = "user-name")
    WebElement standardUser;
    @FindBy(id = "password")
    WebElement secretSauce;
    @FindBy(id = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void enterNameAndPassword(String standardUser, String secretSauce){
        this.standardUser.sendKeys(standardUser);
        this.secretSauce.sendKeys(secretSauce);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }
}

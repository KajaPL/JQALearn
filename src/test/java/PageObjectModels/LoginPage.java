package PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void validateURL(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void validateTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void enterUsernameAndPassword(String standardUser, String secretSauce){
        username.sendKeys(standardUser);
        password.sendKeys(secretSauce);
    }

    public void waitForLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //expected condition for wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        boolean isLoginBtnVisible = loginBtn.isDisplayed();
        Assert.assertTrue(isLoginBtnVisible);
    }
    public void clickLoginButton(){
        Actions builder = new Actions(driver);
        Action click = builder
                .click(loginBtn)
                .build();
        click.perform();
    }
}

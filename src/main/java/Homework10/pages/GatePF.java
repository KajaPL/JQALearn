package Homework10.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class GatePF {
    WebDriver driver;
    @FindBy(id = "login-btn")
    WebElement loginBtn;

    public GatePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   //click on login btn
    public void clickLoginBtn() {
        loginBtn.click();
    }
}

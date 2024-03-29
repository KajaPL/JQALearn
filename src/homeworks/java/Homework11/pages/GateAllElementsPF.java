package Homework11.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GateAllElementsPF {
    // HERE I'LL CHECK IF ALL ELEMENTS ARE VISIBLE AND/OR CLICKABLE ON THE GATE
    WebDriver driver;
    @FindBy(id = "login-btn")
    WebElement loginBtn;

    public GateAllElementsPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   //click on login btn
    public void clickLoginBtn() {
       // loginBtn.click();
        Actions builder = new Actions(driver);
        Action click = builder
                .click(loginBtn)
                .build();
        click.perform();
    }

}

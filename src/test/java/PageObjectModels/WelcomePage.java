package PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class WelcomePage {
    WebDriver driver;
    @FindBy(id = "inventory_container")
    WebElement inventoryContainer;
    public WelcomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void validateURL(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    public void productList() throws Exception{

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //expected condition for wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")));
        boolean isInventoryContainerVisible = inventoryContainer.isDisplayed();
        Assert.assertTrue(isInventoryContainerVisible);

    }
}

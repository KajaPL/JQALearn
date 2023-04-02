package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(className = "title")
    WebElement inventoryContainer;
    public WelcomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void productList() throws Exception{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        this.inventoryContainer.getText();
        System.out.println(inventoryContainer);
    }
}

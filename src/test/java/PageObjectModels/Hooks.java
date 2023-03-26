package PageObjectModels;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import supportFactory.BrowserFactory;

public class Hooks extends BrowserFactory {
    static WebDriver driver;

    @Before
    public void setUp() {
        //get browser
        driver = BrowserFactory.getBrowser("Chrome");
        //maximize window
        driver.manage().window().maximize();
        //launch site
        driver.get("https://www.saucedemo.com");
    }

    @After
    public void tearDown() {
        BrowserFactory.closeAllDriver();
    }
}

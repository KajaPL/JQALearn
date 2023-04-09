package stepDefinition;

import PageObjectModels.Hooks;
import PageObjectModels.LoginPage;
import PageObjectModels.WelcomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import supportFactory.BrowserFactory;

public class StepDefinition extends Hooks {
    static WebDriver driver;
    LoginPage loginPage;
    WelcomePage welcomePage;

    @Before
    public void before() {
        driver = BrowserFactory.getBrowser("Chrome");
        loginPage = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
    }
    @After
    public void after() {
        BrowserFactory.closeAllDriver();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver.get("https://www.saucedemo.com/");
        loginPage.validateURL("https://www.saucedemo.com/");
        loginPage.validateTitle("Swag Labs");
    }

    @When("I log in with a username and password")
    public void iLogInWithAUsernameAndPassword() {
        loginPage.waitForLoginButton();
        loginPage.enterUsernameAndPassword("standard_user", "secret_sauce");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be successfully authorized in system")
    public void iShouldBeSuccessfullyAuthorizedInSystem() throws Exception {
        welcomePage.validateURL("https://www.saucedemo.com/inventory.html");
        welcomePage.productList();
    }
}

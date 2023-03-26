package Homework11.tests;

import Homework11.library.BrowserFactory;
import Homework11.pages.GateAllElementsPF;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GateAllElementsTests extends BrowserFactory{
    static WebDriver driver;
    GateAllElementsPF objGateAllElementsPf;

    @BeforeClass
    public static void beforeClass() throws Exception{
        System.out.println("This is @BeforeClass");
        // in this way I take chrome from BrowserFactory.java
        // remember - it should be imported
        driver =  BrowserFactory.getBrowser("Chrome");
    }
    @Before
    public void before() {
        System.out.println("This is @Before");
        //maximize window
        driver.manage().window().maximize();
        //launch site
        driver.get("http://arenamody.pl");
    }

    @After
    public void after() {
        System.out.println("This is @After");
    }
    @AfterClass public static void afterClass() throws Exception{

        System.out.println("This is @AfterClass");
        BrowserFactory.closeAllDriver();
    }


    @Test
    public void verifyThatLoginBtnCanBeClicked(){
        System.out.println("This is @Test 1");
        objGateAllElementsPf = new GateAllElementsPF(driver);
        objGateAllElementsPf.clickLoginBtn();
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //expected condition for wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        //verify result with assert
        WebElement popup = driver.findElement(By.id("login"));
        boolean isPopupVisible = driver.findElement(By.id("login")).isDisplayed();
        System.out.println(isPopupVisible);
        Assert.assertTrue(isPopupVisible);
    }
 /*  @Test
    public void IlIANAverifyThatUsernameFieldCanBeClicked() {
        System.out.println("This is @Test 2");
        objGateAllElementsPf = new GateAllElementsPF(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement usernameField = driver.findElement(By.id("username"));
        boolean isUsernameField =  driver.findElement(By.id("username")).isDisplayed();
        System.out.println(isUsernameField);
        Assert.assertTrue(isUsernameField);
    }*/
    //TO DO
   // @Test
   // public void
}

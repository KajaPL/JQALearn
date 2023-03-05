package Homework10.tests;

import Homework10.library.BrowserFactory;
import Homework10.pages.GatePF;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GateTestsPF {
    static WebDriver driver;
    GatePF objGatePf;

    @BeforeClass
    public static void beforeClass() throws Exception{
        System.out.println("This is @BeforeClass");

        // in this way I take chrome from BrowserFactory.java
        // remember - it should be imported
        driver =  BrowserFactory.getBrowser("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        //driver.quit();
    }
    @AfterClass public static void afterClass() throws Exception{

        System.out.println("This is @AfterClass");
        BrowserFactory.closeAllDriver();
    }

    @Test
    public void verifyThatLoginBtnCanBeClicked(){

        System.out.println("This is @Test 1");
        objGatePf = new GatePF(driver);
        objGatePf.clickLoginBtn();
        //verify result with assert
        WebElement popup = driver.findElement(By.id("login"));
        boolean isPopupVisible = driver.findElement(By.id("login")).isDisplayed();
        System.out.println(isPopupVisible);
        Assert.assertTrue(isPopupVisible);
    }
}

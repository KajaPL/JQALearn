package Homework9;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Gate {
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is @BeforeClass");

        driver = new ChromeDriver();
    }
    @Before
    public void before() {
        System.out.println("This is @Before");
        //maximize window
        driver.manage().window().maximize();
    }
    @Test
    public void verifyThatLoginBtnCanBeClicked(){

        System.out.println("This is @Test 1");
        //launch site
        driver.get("http://arenamody.pl");
        //choose polish language
        driver.findElement(By.id("languages")).click();
        driver.findElement(By.xpath("//*[@id=\"languages\"]/ul/li[12]/span/span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //find element
        driver.findElement(By.id("login-btn")).click();
        //verify result with assert
        WebElement popup = driver.findElement(By.id("login"));
        boolean isPopupVisible = driver.findElement(By.id("login")).isDisplayed();
        System.out.println(isPopupVisible);
        Assert.assertTrue(isPopupVisible);
    }
    @Test
    public void verifyThatRegisterBtnCanBeClicked() {
        System.out.println("This is @Test 2");
        //launch site
        driver.get("http://arenamody.pl");
        //choose polish language
        //driver.findElement(By.id("languages")).click();
        //driver.findElement(By.xpath("//*[@id=\"languages\"]/ul/li[12]/span/span")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //scroll little bit down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 200)");
        //find elements
        driver.findElement(By.className("register-btn")).click();
        //verify result with assert
        boolean isPopupVisible = driver.findElement(By.id("register")).isDisplayed();
        System.out.println(isPopupVisible);
        Assert.assertTrue(isPopupVisible);
    }

    @Test
    public void verifyThatTheWholeDivOfSliderIsHere() {
        System.out.println("This is @Test 3");
        //launch site
        driver.get("http://arenamody.pl");
        //find elements
        String slider = driver.findElement(By.className("slider")).getTagName();
        System.out.println("slider");
        Assert.assertEquals("div", slider);
    }

    @After
    public void after() {
        System.out.println("This is @After");
        //driver.quit();
    }
    @AfterClass
    public static void afterClass(){

        System.out.println("This is @AfterClass");
        driver.close();
    }
}

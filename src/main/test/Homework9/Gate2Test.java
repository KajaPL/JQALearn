package Homework9;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gate2Test extends Gate2 {
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
    public void testVerifyThatLoginBtnCanBeClicked() {
        //verify result with assert
        WebElement popup = driver.findElement(By.id("login"));
        boolean isPopupVisible = driver.findElement(By.id("login")).isDisplayed();
        System.out.println(isPopupVisible);
        Assert.assertTrue(isPopupVisible);
    }
}
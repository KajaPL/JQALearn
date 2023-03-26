package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase_register {
    public static void main(String[] args) {
        //Verify that register btn - can be clicked

        //path of the browser driver
        System.setProperty("webdriver.chrome.driver", "/Users/kajam/Downloads/chromedriver_mac_arm64 2/chromedriver");
        //Webdriver instance
        ChromeDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //launch site
        driver.get("http://arenamody.pl");
        //scroll little bit down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 200)");
        //find elements
       driver.findElement(By.className("register-btn")).click();
        //verify result
        WebElement popup = driver.findElement(By.id("register"));
        popup.isDisplayed();
        if (popup.isDisplayed()) {
            System.out.println("test success");
        } else {
            System.out.println("test fail");
        }
        //close browser
        driver.close();
    }
}

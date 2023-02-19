package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase_login {
    public static void main(String[] args) {
        //Verify that login btn is working-can be clicked

        //path of the browser driver
        System.setProperty("webdriver.chrome.driver", "/Users/kajam/Downloads/chromedriver_mac_arm64 2/chromedriver");
        //Webdriver instance
        ChromeDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //launch site
        driver.get("http://arenamody.pl");
        //find elements
        driver.findElement(By.id("login-btn")).click();
        //verify result
        WebElement popup = driver.findElement(By.id("login"));
        popup.isDisplayed();
        if (popup.isDisplayed() == true) {
            System.out.println("test success");
        } else {
            System.out.println("test fail");
        }
        //close browser
        driver.close();
    }
}
/*Направете кратък тест по показаните в картите примери с помоща на web driver.
Изпълнете теста за сайта по избор от Homework 7,
използвайте методите findElement на driver на инспектираните 3 web elements от сайта по избор.
Извършете някакво действие с тези елементи с помоща на driver commands (sendKeys, click и т.н.т). Example

   // Click on the Custom Search text box and send value
driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");
  // Click on the Search button
driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();

Направете първия си test case в отделен FirstTestCase class и го качете в профила си в GitHub*/
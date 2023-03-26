package Homework9;

import org.openqa.selenium.By;

import java.time.Duration;

public class Gate2 extends BaseTestChangeLanguage{
    public void verifyThatLoginBtnCanBeClicked() {
        BaseTestChangeLanguage.changeLanguage();
        System.out.println("This is @Test 1");
        //launch site
        //driver.get("http://arenamody.pl");
        //choose polish language
       // driver.findElement(By.id("languages")).click();
       // driver.findElement(By.xpath("//*[@id=\"languages\"]/ul/li[12]/span/span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //find element
        driver.findElement(By.id("login-btn")).click();
    }
}

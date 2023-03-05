package Homework9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTestChangeLanguage extends BaseTestRunDriver {
        protected static void changeLanguage() {
        }

        public void changeLangugage() {
        //launch site
                driver.get("http://arenamody.pl");
        //choose polish language
        driver.findElement(By.id("languages")).click();
        driver.findElement(By.xpath("//*[@id=\"languages\"]/ul/li[12]/span/span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}
}

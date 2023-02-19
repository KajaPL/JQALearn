package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTestCase_slider {
    public static void main(String[] args) {
        //Verify that the whole div of slider is here

        //path of the browser driver
        System.setProperty("webdriver.chrome.driver", "/Users/kajam/Downloads/chromedriver_mac_arm64 2/chromedriver");
        //Webdriver instance
        ChromeDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //launch site
        driver.get("http://arenamody.pl");
        //find elements
        String slider = driver.findElement(By.className("slider")).getTagName();
        //verify result
       System.out.println(slider);
        if (slider.equalsIgnoreCase("div")) {
            System.out.println("test success");
        } else {
            System.out.println("test fail");
        }
        //close browser
        driver.close();
    }
}

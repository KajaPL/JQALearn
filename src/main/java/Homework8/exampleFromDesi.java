package Homework8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class exampleFromDesi {
    public static void main(String[] args) {
       /*
       Expected result: After clicking on login btn,
       page should reload and text should appear
       "The password that you've entered is incorrect. Forgotten password?"
       */

        // System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
        //path of the browser driver
        System.setProperty("webdriver.chrome.driver", "/Users/kajam/Downloads/chromedriver_mac_arm64 2/chromedriver");
        //Webdriver instance
        ChromeDriver driver = new ChromeDriver();
        //launch site
        driver.get("http://www.facebook.com/");
        //find elements
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("abc@gmail.com");
        element = driver.findElement(By.xpath("//input[@name='pass']"));
        element.sendKeys("abbaas");

        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        button.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        button = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
        button.click();
        //verify result

        //close browser
        driver.close();
    }
}

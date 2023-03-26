package Homework10.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
          /*  case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;*/
          /*  case "IE":
                driver = drivers.get("IE");
                if (driver == null) {
                    System.setProperty("webdriver.ie.driver",
                            "C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    drivers.put("IE", driver);
                }
                break;*/
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                   /*IMPORTANT
                    if you are windows user, please uncomment and put your driver
                     Then comment path for mac*/

                    // path of the browser driver on WINDOWS
                    // System.setProperty("webdriver.chrome.driver",
                    //"C:\\Users\\abc\\Desktop\\Server\\ChromeDriver.exe");

                    // path of the browser driver on MAC
                    System.setProperty("webdriver.chrome.driver", "/Users/kajam/Downloads/chromedriver_mac_arm64 2/chromedriver");

                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }

    public static void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}

package Utilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {
    private static RemoteWebDriver driver;

    public static RemoteWebDriver getDriver() {
        return driver;
    }

    public static void setDriver() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        // Here you can add any Chrome specific options you need

        URL hubUrl = new URL("http://selenium-hub:4444/wd/hub");
        driver = new RemoteWebDriver(hubUrl, options);
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package Tests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    protected static RemoteWebDriver driver;

    public static void setUp() throws MalformedURLException {
        // Define desired capabilities for Chrome browser
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName", "chrome");
        chromeOptions.setCapability("browserVersion", "latest");  // Specify the browser version if necessary

        // Define desired capabilities for Edge browser
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setCapability("browserName", "MicrosoftEdge");
        edgeOptions.setCapability("browserVersion", "latest");  // Specify the browser version if necessary

        // Define desired capabilities for Firefox browser
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("browserName", "firefox");
        firefoxOptions.setCapability("browserVersion", "latest");  // Specify the browser version if necessary

        // URL of the Selenium Hub, adjust if tests are within Docker or on the host
        URL hubUrl = new URL("http://selenium-hub:4444/wd/hub");  // Use "http://localhost:4444/wd/hub" if outside Docker

        // Set driver with Chrome options by default, can switch based on browser choice
        driver = new RemoteWebDriver(hubUrl, chromeOptions);
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

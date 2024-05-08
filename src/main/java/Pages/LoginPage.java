package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.Locators;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillCredentials(String username, String password) {
        WebElement usernameField = driver.findElement(Locators.USERNAME_FIELD);
        WebElement passwordField = driver.findElement(Locators.PASSWORD_FIELD);
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickLogIn() {
        WebElement loginButton = driver.findElement(Locators.LOGIN_BUTTON);
        loginButton.click();
    }

    public boolean isInLoginPage(){
        return wait.until(ExpectedConditions.urlContains("login"));
    }

    public boolean invalidErrorAppeared(){
        WebElement invalidLoginAlert = driver.findElement(Locators.INVALID_LOGIN_ERROR);
        return invalidLoginAlert.isDisplayed();
    }
}

package Pages;

import Utilities.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.Parameters.invalidEmail;
import static Utilities.Parameters.invalidPassword;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void goToHomePage() {
            WebElement homeButton = driver.findElement(Locators.HOME_BUTTON);
            homeButton.click();
        }

    public void openCart(){
        WebElement cartButton = driver.findElement(Locators.CART_BAR);
        cartButton.click();
    }

    public void goToCartPagefromCartBar(){
    WebElement cartbutton = wait.until(ExpectedConditions.elementToBeClickable(Locators.GO_TO_CART_BUTTON));
    cartbutton.click();
    }

    public void goToComparePage(){
        WebElement compareButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.COMPARE_PAGE));
        compareButton.click();
    }

    public void search(String query) {
        WebElement searchBox = driver.findElement(Locators.SEARCH_BOX);
        searchBox.clear();
        searchBox.sendKeys(query);
        searchBox.submit();
    }

    public boolean isLoggedIN(){
        WebElement signInButton = driver.findElement(Locators.SING_IN_BUTTON);
        return signInButton.isDisplayed();
    }

    public void fillCredentialsFromHeader(String username, String password) {
        WebElement signInButton = driver.findElement(Locators.SING_IN_BUTTON);
        signInButton.click();
        WebElement usernameField = driver.findElement(Locators.USERNAME_FIELD);
        WebElement passwordField = driver.findElement(Locators.PASSWORD_FIELD);
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickLoginButtonFromHeader(){
        WebElement loginButton = driver.findElement(Locators.LOGIN_BUTTON);
        loginButton.click();
    }

}

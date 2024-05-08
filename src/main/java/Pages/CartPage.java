package Pages;

import Utilities.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartFilled(){
        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CART_LIST));
        return cart.isDisplayed();
    }
}

package Pages;

import Utilities.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openCatalog(){
        WebElement catalog = wait.until(ExpectedConditions.elementToBeClickable(Locators.CATALOG));
        catalog.click();
    }

    public void hoverAccessories(){
        WebElement accessories = wait.until(ExpectedConditions.elementToBeClickable(Locators.ACCESSORIES_BUTTON));
        Actions actions = new Actions(driver);
        actions.moveToElement(accessories).perform();
    }

    public void chooseEarphones(){
        WebElement earphones = wait.until(ExpectedConditions.elementToBeClickable(Locators.HEADPHONES_BUTTON));
        earphones.click();
    }

    public void openFavorites(){
        WebElement favButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.FAVORITE_LIST));
        favButton.click();
    }

    public void hoverOverPrice(){
        WebElement price = wait.until(ExpectedConditions.elementToBeClickable(Locators.PRODUCT_PRICE));
        Actions action = new Actions(driver);
        action.moveToElement(price).perform();
    }

    public void addToCartFromProductInfo(){
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.ADD_TO_CART_FROM_PRODUCT));
        addButton.click();
    }

    public void addToCompareFromProductInfo(){
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.ADD_TO_COMPARE_FROM_PRODUCT));
        addButton.click();
    }

}

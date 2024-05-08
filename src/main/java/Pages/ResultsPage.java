package Pages;

import Utilities.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class ResultsPage extends BasePage {
    public ResultsPage(WebDriver driver) { super(driver); }

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

    public boolean checkForAtLeastFiveHeadphoneResults() {
        List<WebElement> headphonesElements = driver.findElements(Locators.ALL_CATEGORIES);

        int count = 0;
        for (WebElement element : headphonesElements) {
            if (element.getText().equals("Headphones")) {
                count++;
            }
        }
    return count>4;
    }
}

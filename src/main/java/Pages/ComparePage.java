package Pages;

import org.openqa.selenium.WebDriver;
import Utilities.Locators;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ComparePage extends BasePage
{
    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public int numberOfProducts(){
        List<WebElement> prices = driver.findElements(Locators.PRODUCT_PRICE);
        return prices.size();
}
}

package Utilities;

import org.openqa.selenium.By;

public class Locators
{
        public static final By HOME_BUTTON = By.className("main_logo");
        public static final By USERNAME_FIELD = By.id("email");
        public static final By PASSWORD_FIELD = By.id("pass");
        public static final By LOGIN_BUTTON = By.id("send2");

        public static final By CATALOG = By.className("catalog_btn");
        public static final By SEARCH_BOX = By.id("search");
        public static final By CART_BAR = By.className("basket_block");
        public static final By CART_PAGE = By.cssSelector(".action.primary.viewcart");
        public static final By COMPARE_PAGE = By.className("compare_block");

        public static final By ACCESSORIES_BUTTON = By.cssSelector("[class*='nav-5']");
        public static final By HEADPHONES_BUTTON = By.cssSelector(".level2.nav-5-1-1.category-item.first");
        public static final By PRODUCT_PRICE = By.className("current_price"); //many class names are not unique, but since i want any price to hover over (or other element, including the very first found one) i decided to not complicate and make it unique.
        public static final By ADD_TO_CART_FROM_PRODUCT = By.className("add_to_cart");
        public static final By GO_TO_CART_BUTTON = By.xpath("//*[@class='action primary viewcart']");
        public static final By CART_LIST = By.id("shopping-cart-table");
        public static final By SING_IN_BUTTON = By.className("sign_block");
        public static final By FAVORITE_LIST = By.className("favorite_block");
        public static final By ADD_TO_COMPARE_FROM_PRODUCT = By.className("tocompare");
        public static final By INVALID_LOGIN_ERROR = By.className("messages");
        public static final By ALL_CATEGORIES = By.xpath("//div[@class='product_category' and text()='Headphones']");

}

package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static Utilities.AssertionMessages.*;
import static Utilities.Parameters.*;

public class ZigZagTests extends TestBase {

    @BeforeMethod
    public void setUpBeforeEachTest() throws MalformedURLException {
        setUp(); }

    @Test
    public void AddingProductAppearsInCartPageAfterSearch() {
        driver.get("https://www.zigzag.am/");

        HomePage homePage = new HomePage(driver);

        homePage.search(headphoneSearch);

        ResultsPage resultsPage = new ResultsPage(driver);

        resultsPage.hoverOverPrice();

        resultsPage.addToCartFromProductInfo();

        resultsPage.openCart();

        resultsPage.goToCartPagefromCartBar();

        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.isCartFilled(), PRODUCT_ADDED_TO_CART_MESSAGE);
    }

    @Test
    public void CannotFavoriteWithoutAccountAndIsSentToLogin(){
        driver.get("https://www.zigzag.am/");
        HomePage homePage = new HomePage(driver);
        Assert.assertFalse(homePage.isLoggedIN());
        homePage.openFavorites();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isInLoginPage(), CANNOT_FAVORITE_WITHOUT_ACCOUNT_MESSAGE);
        }

    @Test
    public void cannotCompareSameItem(){
        driver.get("https://www.zigzag.am/");
        HomePage homePage = new HomePage(driver);

        homePage.hoverOverPrice();
        homePage.addToCompareFromProductInfo();

        homePage.hoverOverPrice();
        homePage.addToCompareFromProductInfo();

        homePage.goToComparePage();
        ComparePage comparePage = new ComparePage(driver);

        Assert.assertEquals(comparePage.numberOfProducts(), 1, CANNOT_COMPARE_SAME_ITEM_MESSAGE);

    }

    @Test
    public void invalidLoginFromHome(){
        driver.get("https://www.zigzag.am/");

        HomePage homePage = new HomePage(driver);
        homePage.fillCredentialsFromHeader(invalidEmail, invalidPassword);
        homePage.clickLoginButtonFromHeader();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.invalidErrorAppeared(), INVALID_LOGIN_FROM_HOME_MESSAGE);
    }

    @AfterMethod
    public void tearDownAfterEachTest() {
        tearDown();
    }

/*
    @Test
    public void searchResultsContainKeyword(){
        driver.get("https://www.zigzag.am/");
        HomePage homePage = new HomePage(driver);

        homePage.search(headphoneSearch);
        ResultsPage resultsPage = new ResultsPage(driver);

        Assert.assertTrue(resultsPage.checkForAtLeastFiveHeadphoneResults());
    }
*/
}

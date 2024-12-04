package org.mithrilgrid.bookcart;

import org.mithrilgrid.base.BaseTest;
import org.mithrilgrid.bookcart.flows.LoginFlow;
import org.mithrilgrid.bookcart.pages.BookDetailsPage;
import org.mithrilgrid.bookcart.pages.HomePage;
import org.mithrilgrid.bookcart.pages.ShoppingCartPage;
import org.mithrilgrid.bookcart.pages.commons.Header;
import org.mithrilgrid.util.LoggerUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCartTest extends BaseTest {
    @Test
    public void addProductToCartTest() throws InterruptedException {
        LoginFlow loginFlow = new LoginFlow(driver);
        HomePage homePage = new HomePage(driver);
        BookDetailsPage bookDetailsPage = new BookDetailsPage(driver);
        Header header = new Header(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

        // Act
        loginFlow.loginToBookcart(
                "johnnybravo", "Johnny@bravo1");
        LoggerUtil.info("Logged In Successfully");

        homePage.clickOnHarryPotterBook();
        bookDetailsPage.clickOnAddToCartButton();
        header.clickOnCartButton();

        // Assert
        boolean isShoppingCartDisplayed =
                shoppingCartPage.isShoppingCartHeaderDisplayed();

        Assert.assertTrue(isShoppingCartDisplayed,
                "Shopping Cart Header not Displayed");
        LoggerUtil.info("Test Passed");
    }
}

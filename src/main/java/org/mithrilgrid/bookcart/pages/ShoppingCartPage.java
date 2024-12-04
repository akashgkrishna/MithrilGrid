package org.mithrilgrid.bookcart.pages;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }

    // locators
    By shoppingCartHeader =
            By.xpath("//*[contains(text(),' Shopping cart ')]");

    //Methods
    public boolean isShoppingCartHeaderDisplayed(){
        return isDisplayed(shoppingCartHeader);
    }
}

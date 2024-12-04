package org.mithrilgrid.bookcart.pages;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookDetailsPage extends BasePage {
    // Locators
    By addToCartButton =
            By.xpath("(//span[contains(text(), ' Add to Cart')])[1]");

    public BookDetailsPage(WebDriver driver) {
        super(driver);
    }

    // Methods to interact with the elements
    public void clickOnAddToCartButton() {
        click(addToCartButton);
    }
}

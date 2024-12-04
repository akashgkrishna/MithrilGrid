package org.mithrilgrid.bookcart.pages;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    // Locators
    private final By harryPotterBook = By.xpath("//strong[contains(text(), 'Chamber of Secrets')]");

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Methods to interact with the elements
    public void clickOnHarryPotterBook() throws InterruptedException {
        click(harryPotterBook);
//        Thread.sleep(2000);
    }
}

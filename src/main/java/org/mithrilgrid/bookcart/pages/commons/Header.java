package org.mithrilgrid.bookcart.pages.commons;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage {

    //Constructor
    public Header(WebDriver driver) {
        super(driver);
    }

    // Locators
    private final By loginButton = By.xpath("//span[normalize-space()='Login']");
//    private final By username = By.xpath("//*[normalize-space(text())='johnnybravo']");
    private final By username = By.xpath("//span[@class='mdc-button__label']//span");

    public void clickOnLoginButton(){
        click(loginButton);
    }

    public String getUsername(){
        return getText(username).trim();
    }

}

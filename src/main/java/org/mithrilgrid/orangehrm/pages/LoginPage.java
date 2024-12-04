package org.mithrilgrid.orangehrm.pages;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private By usernameField = By.xpath("//input[@placeholder='Username']");
    private By passwordField = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    By invalidCredentials = By.xpath("//p[contains(@class, 'oxd-text oxd-text--p oxd-alert-content-text') and text()='Invalid credentials']"
    );
    By errorMessage = By.xpath("//span[contains(@class, 'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message') and text()='Required']"
    );

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Methods to interact with the elements
    public void enterUsername(String username) {
        sendKeys(usernameField, username);
    }

    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLogin() {
        click(loginButton);
    }
    public String getErrorMessage(){
        return getText(invalidCredentials);
    }

    public String getErrorMessageForLoginWithEmptyFields(){
        return getText(errorMessage);
    }
}

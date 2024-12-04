package org.mithrilgrid.bookcart.pages;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    // Locators
    private final By usernameTextFiled = By.xpath("//input[@placeholder='Username']");
    private final By passwordTextFiled = By.xpath("//input[@placeholder='Password']");
    private final By loginButton = By.xpath("//span[@class='mdc-button__label' and text()='Login']");

    // Methods to interact with the elements
    public void enterUsername(String username){
        sendKeys(usernameTextFiled, username);
    }

    public void enterPassword(String password){
            sendKeys(passwordTextFiled, password);
    }

    public void clickOnLoginButton(){
        click(loginButton);
    }
}

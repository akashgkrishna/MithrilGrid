package org.mithrilgrid.bookcart.flows;

import org.mithrilgrid.bookcart.pages.LoginPage;
import org.mithrilgrid.bookcart.pages.commons.Header;
import org.openqa.selenium.WebDriver;

public class LoginFlow {
    private final LoginPage loginPage;
    private final Header header;

    //Constructor
    public LoginFlow(WebDriver driver){
        this.loginPage = new LoginPage(driver);
        this.header = new Header(driver);
    }

    public void loginToBookcart(String username, String password){
        header.clickOnLoginButton();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }

    public String getUserName(){
        return header.getUsername();
    }
}

package org.mithrilgrid.orangehrm.flows;

import org.mithrilgrid.orangehrm.pages.DashboardPage;
import org.mithrilgrid.orangehrm.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {
    private final LoginPage loginPage;
    private final DashboardPage dashboardPage;

    // Constructor to pass on driver instance
    public LoginFlow(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
    }

    public void login(String username, String password)
    {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    public void loginWithEmptyFields(){
        loginPage.clickLogin();;
    }

    public String getDashboardHeader() {
        return dashboardPage.getHeader();
    }

    public String getErrorMessage(){
        return loginPage.getErrorMessage();
    }

    public String getErrorMessageForLoginWithEmptyFields(){
        return loginPage.getErrorMessageForLoginWithEmptyFields();
    }
}

package org.mithrilgrid.orangehrm;

import org.mithrilgrid.base.BaseTest;
import org.mithrilgrid.orangehrm.flows.LoginFlow;
import org.mithrilgrid.util.LoggerUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void webLoginTest() {
        // Arrange
        LoginFlow loginFlow = new LoginFlow(driver);

        String username = "Admin";
        String password = "admin123";
        String expected = "Dashboard";

        // Act
        loginFlow.login(username, password);
        LoggerUtil.info("Logged In Successfully");

        // Assert
        String actualHeader = loginFlow.getDashboardHeader();
        Assert.assertEquals(actualHeader, expected);
    }
}

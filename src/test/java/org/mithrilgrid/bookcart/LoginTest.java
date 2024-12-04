package org.mithrilgrid.bookcart;

import org.mithrilgrid.base.BaseTest;
import org.mithrilgrid.bookcart.flows.LoginFlow;
import org.mithrilgrid.util.LoggerUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void webLoginTest() {
        // Arrange
        LoginFlow loginFlow = new LoginFlow(driver);

        String username = "johnnybravo";
        String password = "Johnny@bravo1";

        // Act
        loginFlow.loginToBookcart(username, password);
        LoggerUtil.info("Logged In Successfully");

        // Assert
        String actualHeader = loginFlow.getUserName();
        Assert.assertEquals(actualHeader, username);
    }
}

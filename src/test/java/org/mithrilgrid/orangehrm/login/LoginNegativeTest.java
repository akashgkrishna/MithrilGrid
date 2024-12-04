package org.mithrilgrid.orangehrm.login;

import org.mithrilgrid.base.BaseTest;
import org.mithrilgrid.orangehrm.flows.LoginFlow;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {

    @Test(priority = 1)
    public void loginWithInvalidCredentialsTest() {
        // Arrange
        LoginFlow loginFlow = new LoginFlow(driver);

        String username = "Admin";
        String password = "admin00";
        String expected = "Invalid credentials";

        // Act
        loginFlow.login(username, password);

        // Assert
        String actualErrorMessage = loginFlow.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expected);
    }

    @Test(priority = 2)
    public void loginWithEmptyFieldsTest(){
        //Arrange
        LoginFlow loginFlow = new LoginFlow(driver);

        String expected = "Required";

        //Act
        loginFlow.loginWithEmptyFields();

        //Assert
        String actualErrorMessage = loginFlow.getErrorMessageForLoginWithEmptyFields();
        Assert.assertEquals(actualErrorMessage,expected);
    }
}

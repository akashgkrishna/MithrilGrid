package org.mithrilgrid.page;

import org.mithrilgrid.util.LoggerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Method to wait for an element to be visible
    protected void waitForElementVisibility(By locator) {
        try {
            // It checks for element if not found, keep checking in 500ms gap for 10s
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            LoggerUtil.error("Element not visible: " + locator.toString(), e);
            throw e;
        }
    }

    // Method to click on an element
    protected void click(By locator) {
        waitForElementVisibility(locator);
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            LoggerUtil.error("Failed to click on element: " + locator.toString(), e);
            throw e;
        }
    }

    // Method to send keys to an input element
    protected void sendKeys(By locator, String keysToSend) {
        waitForElementVisibility(locator);
        try {
            WebElement element = driver.findElement(locator);
            element.clear();
            element.sendKeys(keysToSend);
        } catch (Exception e) {
            LoggerUtil.error("Failed to send keys to element: " + locator.toString(), e);
            throw e;
        }
    }

    // Method to retrieve text
    protected String getText(By locator) {
        waitForElementVisibility(locator);
        try {
            return driver.findElement(locator).getText();
        } catch (Exception e) {
            LoggerUtil.error("Failed to retrieve text from element: " + locator.toString(), e);
            throw e; // Re-throw to ensure the test fails
        }
    }
}

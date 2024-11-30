package org.mithrilgrid.base;

import org.mithrilgrid.util.ConfigManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {

        ChromeOptions options = new ChromeOptions();

        // Enable headless mode if configured
        if (Boolean.parseBoolean(ConfigManager.getProperty("headless"))) {
            options.addArguments("--headless");
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        // Get the package name of the test class
        String testPackageName = this.getClass().getPackage().getName();

        // Determine the application name based on the package
        String app = testPackageName.contains("bookcart") ? "bookcart" : "orangehrm";

        // Fetch the URL from config based on the detected application
        String baseUrl = ConfigManager.getProperty(app);

        if (baseUrl == null) {
            throw new RuntimeException("Base URL for " + app + " not found in config.properties.");
        }
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}

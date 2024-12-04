package org.mithrilgrid.orangehrm.pages;

import org.mithrilgrid.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    // Locators
    private By header = By.tagName("h6");
    private By pimButton = By.xpath("//span[contains(@class, 'oxd-main-menu-item--name') and text()='PIM']");

    //Constructor
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader(){
        return getText(header);
    }

}

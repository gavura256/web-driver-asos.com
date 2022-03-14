package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutletPopUp extends BasePage {
    @FindBy(xpath = "//a[@href[substring(.,string-length(.) - string-length('outlet|shop+by+product|view+all') + 1) = 'outlet|shop+by+product|view+all']]")
    WebElement viewAllButton;

    public OutletPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public DeliveryToPopUp clickOnViewAll() {
        webDriver.switchTo().activeElement();
        viewAllButton.click();

        return new DeliveryToPopUp(webDriver);
    }
}

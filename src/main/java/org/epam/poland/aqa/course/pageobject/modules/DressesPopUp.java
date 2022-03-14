package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPopUp extends BasePage {
    @FindBy(xpath = "//a[@href[substring(.,string-length(.) - string-length('dresses|shop+by+type|view+all') + 1) = 'dresses|shop+by+type|view+all']]")
    WebElement viewAllButton;

    public DressesPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public DeliveryToPopUp clickOnViewAll() {
        webDriver.switchTo().activeElement();
        viewAllButton.click();

        return new DeliveryToPopUp(webDriver);
    }
}

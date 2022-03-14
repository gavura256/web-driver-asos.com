package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportswearPopUp extends BasePage {
    @FindBy(xpath = "//a[substring(@href, string-length(@href) \n" +
            "                          - string-length('sportswear|shop+by+product|view+all') + 1)  = 'sportswear|shop+by+product|view+all']")
    WebElement viewAllButton;

    public SportswearPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public DeliveryToPopUp clickOnViewAll() {
        webDriver.switchTo().activeElement();
        viewAllButton.click();

        return new DeliveryToPopUp(webDriver);
    }
}

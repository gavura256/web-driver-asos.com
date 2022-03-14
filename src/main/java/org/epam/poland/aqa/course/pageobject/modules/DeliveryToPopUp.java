package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.CategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryToPopUp extends BasePage {
    @FindBy(xpath = "//span[contains(text(),\"Deliver elsewhere\")]")
    WebElement deliverElsewhereButton;

    By updatePreferenceButton = By.xpath("//button[@data-testid=\"save-country-button\"]");

    protected DeliveryToPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public CategoryPage chooseDeliveryToUK() {
        deliverElsewhereButton.click();
        waitForElement(updatePreferenceButton).click();

        return new CategoryPage(webDriver);
    }
}

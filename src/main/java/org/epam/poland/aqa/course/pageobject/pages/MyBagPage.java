package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBagPage extends BasePage {
    By removeSingleItemButton = By.className("bag-item-remove");
    By emptyMyBagMessage = By.className("empty-bag-title");

    public MyBagPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MyBagPage removeSingleItem() {
        waitForElement(removeSingleItemButton).click();

        return this;
    }

    public String getEmptyMyBagMessage() {
        return waitForElement(emptyMyBagMessage).getText();
    }
}

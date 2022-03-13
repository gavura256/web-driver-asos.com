package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.CategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OutletPopUp extends BasePage {
    public OutletPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public CategoryPage clickOnViewAll() {
        webDriver.switchTo().activeElement();
        webDriver.findElement(By.xpath("//a[@href[substring(.,string-length(.) - string-length('outlet|shop+by+product|view+all') + 1) = 'outlet|shop+by+product|view+all']]")).click();

        return new CategoryPage(webDriver);
    }
}

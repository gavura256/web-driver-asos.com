package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;

public class MyBagPage extends BasePage {
    public MyBagPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MyBagPage removeSingleItem() {
        return this;
    }
}

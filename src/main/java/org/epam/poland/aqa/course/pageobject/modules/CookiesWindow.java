package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesWindow extends BasePage {
    public static final By ACCEPT_ALL_COOKIES_BUTTON = By.id("onetrust-accept-btn-handler");

    public CookiesWindow(WebDriver webDriver) {
        super(webDriver);
    }

    public void acceptAllCookies() {
        waitForElement(ACCEPT_ALL_COOKIES_BUTTON).click();
    }
}

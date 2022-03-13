package org.epam.poland.aqa.course;

import org.epam.poland.aqa.course.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {
    protected final WebDriver webDriver = new WebDriverFactory().getWebDriver();

    protected void setUpDriver() {
        webDriver.manage().window().maximize();
    }

    protected void quit() {
        webDriver.quit();
    }
}

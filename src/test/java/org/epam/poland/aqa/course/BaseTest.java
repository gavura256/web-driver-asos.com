package org.epam.poland.aqa.course;

import org.epam.poland.aqa.course.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static final WebDriver webDriver = WebDriverFactory.getInstanceOfWebDriverFactory().getWebDriver();

    public void setUpDriver() {
        webDriver.manage().window().maximize();
    }

    public void quit() {
        webDriver.quit();
    }
}

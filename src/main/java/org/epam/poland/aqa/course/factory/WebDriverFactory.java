package org.epam.poland.aqa.course.factory;

import org.epam.poland.aqa.course.enumeration.SupportedBrowsers;
import org.epam.poland.aqa.course.properties.conventors.SupportedBrowserConverter;
import org.epam.poland.aqa.course.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver(){
        String propertyValue = new PropertyHolder().readProperty("browser");
        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);

        return browser.getWebDriver();
    }
}

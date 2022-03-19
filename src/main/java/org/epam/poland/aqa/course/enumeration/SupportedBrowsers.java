package org.epam.poland.aqa.course.enumeration;

import org.epam.poland.aqa.course.invoker.WebDriverInvoker;
import org.epam.poland.aqa.course.invoker.implementation.LocalChromeInvoker;
import org.epam.poland.aqa.course.invoker.implementation.LocalFirefoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker());

    private final WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver() {

        return webDriverInvoker.invokeWebDriver();
    }
}

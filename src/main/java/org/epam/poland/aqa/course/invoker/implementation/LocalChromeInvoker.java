package org.epam.poland.aqa.course.invoker.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.poland.aqa.course.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver()
                .browserVersion("99")
                .setup();
        return new ChromeDriver();
    }
}

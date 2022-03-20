package org.epam.poland.aqa.course.invoker.implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.poland.aqa.course.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalChromeInvoker implements WebDriverInvoker {
    private static final String userAgent =
            "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:33.0) Gecko/20120101 Firefox/33.0";
    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver()
                .browserVersion("latest")
                .setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--user-agent=Mozilla/5.0 (Linux; Android 6.0; HTC One M9 Build/MRA58K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.98 Mobile Safari/537.36");

        return WebDriverManager.chromedriver()
                .capabilities(chromeOptions)
                .create();
    }
}

package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CookiesWindow extends BasePage {
    public CookiesWindow(WebDriver webDriver) {
        super(webDriver);
    }

    public void acceptAllCookies(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler"))).click();
    }
}

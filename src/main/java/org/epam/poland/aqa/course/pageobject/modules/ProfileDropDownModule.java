package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileDropDownModule extends BasePage {
    WebElement userInfo;
    public ProfileDropDownModule(WebDriver webDriver) {
        super(webDriver);
    }

    public String getUserNameInfo(){
        userInfo = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()=\"gavura256\"]")));
        return userInfo.getText();
    }
}

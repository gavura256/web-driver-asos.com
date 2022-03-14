package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.MyBagPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyBagPopUp extends BasePage {
    By miniBagItemCount = By.xpath("//span[@data-test-id=\"miniBagItemCount\"]");
    By viewBagButton = By.xpath("//a[@data-test-id=\"bag-link\"]");

    public MyBagPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public String quantityOfItemsInMyBag() {
        new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(miniBagItemCount))
                .click();

        return webDriver.findElement(miniBagItemCount)
                .getText();
    }

    public MyBagPage viewBag() {
        waitForElement(viewBagButton)
                .click();

        return new MyBagPage(webDriver);
    }
}

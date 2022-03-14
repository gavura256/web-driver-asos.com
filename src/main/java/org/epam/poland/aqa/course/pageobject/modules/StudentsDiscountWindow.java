package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StudentsDiscountWindow extends BasePage {

    public static final By CLOSE_STUDENT_DISCOUNT_WINDOW = By.id("att_lightbox_close");

    public StudentsDiscountWindow(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductPage closeStudentDiscountWindow() {
        new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(CLOSE_STUDENT_DISCOUNT_WINDOW))
                .click();

        return new ProductPage(webDriver);
    }
}

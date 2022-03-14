package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentsDiscountWindow extends BasePage {
    public static final By CLOSE_STUDENT_DISCOUNT_WINDOW = By.id("att_lightbox_close");

    public StudentsDiscountWindow(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductPage closeStudentDiscountWindow() {
        waitForElement(CLOSE_STUDENT_DISCOUNT_WINDOW).click();

        return new ProductPage(webDriver);
    }
}

package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.modules.StudentsDiscountWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {
    @FindBy(xpath = "//article[@data-auto-id=\"productTile\"][1]/a")
    WebElement firstItem;

    public CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public StudentsDiscountWindow chooseTheFirstItem() {
        firstItem.click();

        return new StudentsDiscountWindow(webDriver);
    }
}

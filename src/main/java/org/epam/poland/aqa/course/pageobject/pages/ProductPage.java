package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.modules.MyBagPopUp;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    protected ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MyBagPopUp addToMyBag() {
        return new MyBagPopUp(webDriver);
    }

    public ProductPage chooseTheSize() {
        return null;
    }
}

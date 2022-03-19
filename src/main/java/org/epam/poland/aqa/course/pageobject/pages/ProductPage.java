package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.modules.MyBagPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {
    public static final int INDEX_TO_ADD_TO_MY_BAG = 1;
    @FindBy(id = "main-size-select-0")
    WebElement colorSizeSelector;
    @FindBy(xpath = "//button[@data-test-id=\"add-button\"]")
    WebElement addToBagButton;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MyBagPopUp addToMyBag() {
        addToBagButton.click();

        return new MyBagPopUp(webDriver);
    }

    public ProductPage chooseTheSize() {
        Select dropdown = new Select(colorSizeSelector);
        dropdown.selectByIndex(INDEX_TO_ADD_TO_MY_BAG);

        return this;
    }
}

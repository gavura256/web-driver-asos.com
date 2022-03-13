package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {
    Actions actions = new Actions(webDriver);
    @FindBy(xpath = "//article[@data-auto-id=\"productTile\"][1]")
    WebElement firstItem;

    public CategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductPage chooseTheFirstItem() {
        actions.moveToElement(firstItem).perform();
        firstItem.click();

        return new ProductPage(webDriver);
    }
}

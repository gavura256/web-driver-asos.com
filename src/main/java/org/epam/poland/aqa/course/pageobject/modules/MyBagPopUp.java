package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.MyBagPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBagPopUp extends BasePage {
    By miniBagItemCount = By.xpath("//span[@data-test-id=\"miniBagItemCount\"]");
    By viewBagButton = By.xpath("//a[@data-test-id=\"bag-link\"]");

    public MyBagPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public String quantityOfItemsInMyBag() {
        return waitForElement(miniBagItemCount).getText();
    }

    public MyBagPage viewBag() {
        waitForElement(viewBagButton).click();

        return new MyBagPage(webDriver);
    }
}

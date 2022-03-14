package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.modules.OutletPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.epam.poland.aqa.course.props.Properties.ASOS_HOME_PAGE;

public class HomePage extends BasePage {
    @FindBy(id = "women-floor")
    WebElement womenCategory;
    @FindBy(xpath = "//button[@data-testid=\"primarynav-button\"]/span/span[contains(text(), \"Outlet\")]")
    WebElement outletButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage open() {
        webDriver.get(ASOS_HOME_PAGE);

        return this;
    }

    public HomePage chooseWomenCategory() {
        womenCategory.click();

        return this;
    }

    public OutletPopUp clickOnOutlet() {
        outletButton.click();

        return new OutletPopUp(webDriver);
    }
}

package org.epam.poland.aqa.course.pageobject.modules;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDropDownMenu extends BasePage {
    @FindBy(xpath = "//a[@data-testid=\"signin-link\"]")
    WebElement signInLink;
    public AccountDropDownMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage clickOnSignInLink() {
        waitForTheAppearanceOf(signInLink).click();

        return new SignInPage(webDriver);
    }
}

package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.epam.poland.aqa.course.props.Properties.ASOS_COM_LOGIN;
import static org.epam.poland.aqa.course.props.Properties.ASOS_COM_PASSWORD;

public class SignInPage extends BasePage {
    @FindBy(className = "qa-email-textbox")
    WebElement emailField;
    @FindBy(className = "qa-password-textbox")
    WebElement passwordField;
    @FindBy(id = "signin")
    WebElement signInButton;

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage fillEmailAddressFieldWithValidData() {
        emailField.sendKeys(ASOS_COM_LOGIN);

        return this;
    }

    public SignInPage fillPasswordFieldWithValidData() {
        passwordField.sendKeys(ASOS_COM_PASSWORD);
        return this;
    }

    public MyAccountPage clickOnSignInButton() {
        signInButton.click();
        return new MyAccountPage(webDriver);
    }
}

package org.epam.poland.aqa.course.pageobject.pages;

import org.epam.poland.aqa.course.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "login_field")
    WebElement loginField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(name = "commit")
    WebElement sighInButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage open(){
        webDriver.get("https://www.github.com/login");
        return this;
    }

    public HomePage login (String login, String pass){
        loginField.sendKeys(login);
        passwordField.sendKeys(pass);
        sighInButton.click();

        return new HomePage(webDriver);
    }
}

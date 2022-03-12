package org.epam.poland.aqa.course;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.epam.poland.aqa.course.pageobject.BasePage;
import org.epam.poland.aqa.course.pageobject.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.epam.poland.aqa.course.props.Properties.GIT_HUB_LOGIN;
import static org.epam.poland.aqa.course.props.Properties.GIT_HUB_PASSWORD;

public class TestClass extends BaseTest {


    @Test
    public void gitHubLoginTest() {
        LoginPage loginPage = new LoginPage(webDriver);
        String userName = loginPage.open()
                .login(GIT_HUB_LOGIN, GIT_HUB_PASSWORD)
                .openProfileDropDown()
                .getUserNameInfo();

        Assert.assertEquals(userName, "gavura256");
    }

    @DataProvider(name = "wrongData")
    public Object[][] wrongData() {
        return new Object[][]{
                {"qwerty", GIT_HUB_PASSWORD},
                {GIT_HUB_LOGIN, "qwertyui"},
                {"qwertyu", "qwer5678"}
        };
    }

    @Test(dataProvider = "wrongData")
    public void gitHubLoginNegativeTest(String login, String pass) {
        WebDriverManager.chromedriver().browserVersion("97").setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.github.com/login");

        WebElement loginField = driver.findElement(By.id("login_field"));
        loginField.sendKeys(login);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(pass);

        WebElement sighInButton = driver.findElement(By.name("commit"));
        sighInButton.click();

        WebElement errorMessage = driver.findElement(By.id("js-flash-container"));
        Assert.assertTrue(errorMessage.isDisplayed());

        driver.close();
        driver.quit();
    }
}

package org.epam.poland.aqa.course;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public class TestClass {

    @Test
    public void test() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriverManager.chromedriver().browserVersion("97").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/",
                "The current link is not as expected");

        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("laptop");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement searchResult = driver.findElement(By.xpath("//div[@class='sg-col-inner\"]//span[text()='\"laptop\"']"));
        Assert.assertTrue(searchResult.getText().contains("laptop"));

        driver.close();
        driver.quit();
    }

    @Test
    public void gitHubLoginTest() {
        WebDriverManager.chromedriver().browserVersion("97").setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.github.com/login");

        WebElement loginField = driver.findElement(By.id("login_field"));
        loginField.sendKeys(GIT_HUB_LOGIN);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(GIT_HUB_PASSWORD);

        WebElement sighInButton = driver.findElement(By.name("commit"));
        sighInButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://github.com/",
                "Actual url is not correct");

        WebElement profileDropDown = driver.findElement(By.xpath("//summary[@class=\"Header-link\"]/img"));
        profileDropDown.click();

//        WebElement userInfo = driver.findElement(By.xpath("//strong[text()=\"juliaHrabovska\"]"));
        WebElement userInfo = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()=\"juliaHrabovska\"]")));
        Assert.assertEquals(userInfo.getText(), "juliaHrabovska",
                "User name is not correct");

        driver.close();
        driver.quit();
    }

    @DataProvider(name = "wrongData")
    public Object[][] wrongData() {
        return new Object[][] {
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

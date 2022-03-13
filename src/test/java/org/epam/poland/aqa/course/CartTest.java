package org.epam.poland.aqa.course;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.poland.aqa.course.pageobject.modules.CookiesWindow;
import org.epam.poland.aqa.course.pageobject.modules.MyBagPopUp;
import org.epam.poland.aqa.course.pageobject.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CartTest extends BaseTest {
    private final HomePage homePage = new HomePage(webDriver);
    private MyBagPopUp myBagPopUp;

    @Before
    public void classSetUp(){
        webDriver.manage().window().maximize();

    }

    @Given("I am on home page")
    public HomePage iAmOnHomePage() {
        return homePage.open();
    }

    @When("I add item to cart")
    public MyBagPopUp iAddItemToCart() {
        return homePage.chooseWomenCategory()
                .clickOnOutlet()
                .clickOnViewAll()
                .chooseTheFirstItem()
                .chooseTheSize()
                .addToMyBag();
    }

    @Then("I should see pop-up window informs My bag consists of {} item")
    public void iShouldSeePopUpWindowInformsMyBagConsists(int amountOfGoods) {
        Assert.assertEquals(amountOfGoods, myBagPopUp.quantityOfItemsInMyBag());
    }

}

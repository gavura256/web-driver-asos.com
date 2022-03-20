package org.epam.poland.aqa.course;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.poland.aqa.course.pageobject.modules.MyBagPopUp;
import org.epam.poland.aqa.course.pageobject.pages.HomePage;
import org.epam.poland.aqa.course.pageobject.pages.MyBagPage;
import org.testng.Assert;

public class CartTest extends BaseTest {
    private final HomePage homePage;
    private final MyBagPopUp myBagPopUp;
    private final MyBagPage myBagPage;

    public CartTest() {
        homePage = new HomePage(webDriver);
        myBagPopUp = new MyBagPopUp(webDriver);
        myBagPage = new MyBagPage(webDriver);
    }

    @Before
    public void setUp() {
        setUpDriver();
    }

    @After
    public void tearDown() {
        quit();
    }

    @Given("I am on home page")
    public HomePage iAmOnHomePage() {
        return homePage.open();
    }

    @When("I add item to cart")
    public MyBagPopUp iAddItemToCart() {
        return homePage.chooseWomenCategory()
                .clickOnDresses()
                .clickOnViewAll()
                .chooseDeliveryToUK()
                .chooseTheFirstItem()
                .closeStudentDiscountWindow()
                .chooseTheSize()
                .addToMyBag();
    }

    @Then("I should see pop-up window informs My bag consists of {string}")
    public void iShouldSeePopUpWindowInformsMyBagConsists(String amountOfGoods) {
        Assert.assertEquals(amountOfGoods, myBagPopUp.quantityOfItemsInMyBag());
    }

    @Then("I go to My Bag")
    public MyBagPage iGoToMyBag() {
        return myBagPopUp.viewBag();
    }

    @When("I remove item from My Bag")
    public MyBagPage iRemoveItemFromMyBag() {
        return myBagPage.removeSingleItem();
    }

    @Then("I should see message {string}")
    public void iShouldSee(String string) {
        Assert.assertEquals(string, myBagPage.getEmptyMyBagMessage());
    }

}

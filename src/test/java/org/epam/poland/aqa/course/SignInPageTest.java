package org.epam.poland.aqa.course;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.epam.poland.aqa.course.pageobject.pages.HomePage;
import org.epam.poland.aqa.course.pageobject.pages.MyAccountPage;
import org.epam.poland.aqa.course.pageobject.pages.SignInPage;

public class SignInPageTest extends BaseTest {
    private final HomePage homePage;
    private final SignInPage signInPage;

    public SignInPageTest() {
        homePage = new HomePage(webDriver);
        signInPage = new SignInPage(webDriver);
    }

    @Before
    public void setUp() {
        setUpDriver();
    }

    @After
    public void tearDown() {
        quit();
    }

    @Given("I am on sign-in page")
    public SignInPage iAmOnSignInPage() {
        return homePage.open()
                .clickOnAccountDropDownMenu()
                .clickOnSignInLink();
    }

    @When("I login with valid data")
    public MyAccountPage iLoginWithValidData() {
        return signInPage.fillEmailAddressFieldWithValidData()
                .fillPasswordFieldWithValidData()
                .clickOnSignInButton();
    }

    @Then("I should see My account page")
    public void iShouldSeeMyAccountPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

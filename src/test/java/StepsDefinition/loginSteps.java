package StepsDefinition;

import api.Connection;
import api.RequestManager;
import pages.HomePage;
import pages.SignInPage;
import pages.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Clase con los acciones para el testeo del login.
 */
public class loginSteps {
    SignInPage signInPage;
    HomePage home;

    @And("^The user introduce my user (.*)$")
    public void theUserIntroduceMyUserLionel(String user) {
        signInPage.setUserName(user);
        signInPage.clickOnNextButton();
    }

    @And("^The user introduce my password (.*)$")
    public void theUserIntroduceMyPasswordPSswRdPivotal(String password) {
        signInPage.setPassord(password);
        home = signInPage.clickOnNextButtonAndGoToHomePage();
    }

    @When("The user click on login button")
    public void theUserClickOnLoginButton() {
        WelcomePage welcomePage = new WelcomePage();
        signInPage = welcomePage.clickOnLoginButton();
        System.out.println("Login button press");
    }

    @Given("The user go to Pivotal web page")
    public void theUserGoToPivotalWebPage() {
        System.out.print("Go Pivotal");
    }

    @Then("Home page should be displayed")
    public void mainPageShouldBeDisplayed() {
        home.waitHomePage();
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        signInPage.errorMessage();
    }
}

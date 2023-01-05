package StepsDefinition;

import UI.DriverFactory;
import api.Connection;
import api.RequestManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    static Logger logger = LoggerFactory.getLogger(loginSteps.class);
    SignInPage signInPage;
    HomePage home;

    @And("^The user introduce my user (.*)$")
    public void theUserIntroduceMyUserLionel(String user) {
        logger.debug("Introduciendo usuario: "+user);
        signInPage.setUserName(user);
        signInPage.clickOnNextButton();
    }

    @And("^The user introduce my password (.*)$")
    public void theUserIntroduceMyPasswordPSswRdPivotal(String password) {
        logger.debug("Introduciendo contraseña: "+password);
        signInPage.setPassord(password);
        home = signInPage.clickOnNextButtonAndGoToHomePage();
    }

    @When("The user click on login button")
    public void theUserClickOnLoginButton() {
        WelcomePage welcomePage = new WelcomePage();
        signInPage = welcomePage.clickOnLoginButton();
        logger.info("Presionando el boton login");
    }

    @Given("The user go to Pivotal web page")
    public void theUserGoToPivotalWebPage() {
        logger.info("Saliendo a la pagina principal");
    }

    @Then("Home page should be displayed")
    public void mainPageShouldBeDisplayed() {
        logger.info("Esperando a la pagina Home");
        home.waitHomePage();
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        logger.info("Esperando que se muestre el mensaje de error");
        signInPage.errorMessage();
    }
}

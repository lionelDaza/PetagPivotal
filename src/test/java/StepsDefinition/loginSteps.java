package StepsDefinition;

import UI.DriverFactory;
import UI.Environment;
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
    Environment env = Environment.getInstance();
    static Logger logger = LoggerFactory.getLogger(loginSteps.class);
    SignInPage signInPage;
    HomePage home;

    @And("The user introduce his username")
    public void theUserIntroduceMyUserLionel() {
        String username = env.getUser();
        logger.debug("Introduciendo usuario: "+username);
        signInPage.setUserName(username);
        signInPage.clickOnNextButton();
    }

    @And("The user introduce his password")
    public void theUserIntroduceMyPasswordPSswRdPivotal() {
        String password = env.getPassWord();
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

    @And("^The user introduce a invalida password (.*)$")
    public void theUserIntroduceAInvalidaPassword(String wrongPassword) {
        logger.debug("Introduciendo una contraseña invalida: "+wrongPassword);
        signInPage.setPassord(wrongPassword);
        home = signInPage.clickOnNextButtonAndGoToHomePage();
    }
}

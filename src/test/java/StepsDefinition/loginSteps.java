package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    
    @And("^The user introduce my user (.*)$")
    public void theUserIntroduceMyUserLionel(String user) {
        System.out.println("user: "+ user);
    }

    @And("^The user introduce my password (.*)$")
    public void theUserIntroduceMyPasswordPSswRdPivotal(String password) {
        System.out.println("password: "+ password);
    }

    @When("The user click on login button")
    public void theUserClickOnLoginButton() {
        System.out.println("Login button press");
    }

    @Then("The welcome page should be displayed")
    public void theWelcomePageShouldBeDisplayed() {
        System.out.println("Welcome page");
    }

    @Given("The user go to Pivotal web page")
    public void theUserGoToPivotalWebPage() {
        System.out.println("Web Page");
    }

}

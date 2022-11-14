package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProjectForm;
import pages.ProjectPage;

public class projectSteps {
    ProjectForm projectForm;
    ProjectPage projectPage;
    @When("The user click on new project button")
    public void theUserClickOnNewProjectButton() {
        HomePage home =  new HomePage();
        projectForm = home.clickOnProjectButton();
    }

    @And("^Introduce a new project name (.*)$")
    public void introduceANewProjectNameTEST(String projectName) {
        projectForm.setProjectName(projectName);
    }

    @And("^Choose a the account (.*)$")
    public void chooseATheAccountPtag(String accountName) {
        projectForm.chooseAccount(accountName);

    }

    @And("^Choose the type as (.*)$")
    public void chooseTheTypeAsPrivate(String projectType) {
        projectForm.chooseProjectType(projectType);
    }

    @And("click on create project button")
    public void clickOnCreateProjectButton() {
        projectPage = projectForm.clickOnCreateProject();
    }

    @Then("^A new project (.*) should be created$")
    public void aNewProjectShouldBeCreated(String projectName) {
        projectPage.waitProjectPage(projectName);
    }
}

package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ProjectPage;
import pages.ProjectPanel;

public class epicSteps {
    ProjectPage projectPage;

    @When("^I click on (.*) option")
    public void clickOnEpicOption(String option) {
        projectPage = new ProjectPage();
        projectPage.getPanel().clickOnPanelOption(option);
        System.out.println("aca!");

    }
}

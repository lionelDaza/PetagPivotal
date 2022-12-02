package StepsDefinition;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.EpicForm;
import pages.ProjectPage;

import java.util.List;

public class epicSteps {
    ProjectPage projectPage;
    EpicForm epicForm;
    WebElement panel;

    @When("^I click on (.*) option")
    public void clickOnEpicOption(String option) {
        projectPage = new ProjectPage();
        panel = projectPage.getPanel().clickOnPanelOption(option);
    }

    @And("I click on a new epic button")
    public void iClickOnANewEpicButton() {
        List<WebElement> panelButtons = panel.findElements(By.tagName("button"));
        for (WebElement button: panelButtons){
            if(button.getText().contains("Add Epic")){
                button.click();
            }
        }

    }

    @And("^I introduce the Epic name (.*)")
    public void iIntroduceTheEpicNameEpicPetag(String epicName) {
        epicForm = new EpicForm();
        epicForm.introduceEpicName(epicName);

    }

    @And("I click on save epic button")
    public void iClickOnSaveEpicButton() {
        epicForm.clickOnSaveEpicButton();
    }

    @Then("^The (.*) should be displayed")
    public void theEpicPetagShouldBeDisplayed(String epicName) {
        epicForm.verifyEpicCreation(epicName);

    }

}

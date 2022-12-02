package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BacklogForm;
import pages.MyWork;

public class backlogSteps {
    BacklogForm backlogForm;
    MyWork myWork;
    @And("I click on a new story button in Backlog")
    public void iClickOnANewStoryButtonInBacklog() {
        backlogForm = new BacklogForm();
        backlogForm.clickOnNewStory();
    }

    @And("^I introduce the story in Backlog named (.*)")
    public void iIntroduceTheStoryInBacklogNamedStoryPetag(String storyName) {
        backlogForm.setStoryName(storyName);
    }

    @And("^I introduce the story in Backlog description (.*)")
    public void iIntroduceTheStoryInBacklogDescriptionPetagStoryDescriptionInBacklog(String storyDescription) {
        backlogForm.setStoryDescription(storyDescription);

    }

    @And("I click on save story button in Backlog")
    public void iClickOnSaveStoryButtonInBacklog() {
        backlogForm.clickOnSaveStory();
    }

    @Then("^A new story in Backlog named (.*) should be displayed")
    public void aNewStoryInBacklogNamedStoryPetagShouldBeDisplayed(String storyName) {
        backlogForm.verifyStoryCreated(storyName);
    }

    @And("^I set (.*) points for the story")
    public void iSetPointsForTheStory(String storyPoints) {
        backlogForm.setStoryPoints(storyPoints);

    }

    @And("I click on start story")
    public void iClickOnStartStory() {
        backlogForm.clickOnStartStory();
        myWork = new MyWork();
    }


    @Then("^Story (.*) should be displayed in My work")
    public void storyBacklogStoryPetagShouldBeDisplayedInMyWork(String storyName) {
        myWork.verifyStoryInMyWork(storyName);
    }
}

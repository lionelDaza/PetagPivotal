package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BacklogForm;
import pages.StoryForm;

public class storySteps {
    StoryForm storyForm;
    BacklogForm backlogForm;
    @And("I click on a new story button")
    public void iClickOnANewStoryButton() {
        storyForm = new StoryForm();
        storyForm.clickOnAddStoryIceBox();
    }

    @And("^I introduce the story name (.*)")
    public void iIntroduceTheStoryNameStoryPetag(String storyTitle) {
        storyForm.setStoryTitle(storyTitle);
    }

    @And("I click on save story button")
    public void iClickOnSaveStoryButton() {
        storyForm.clickOnSaveStoryIceBox();
    }

    @Then("^A new story named (.*) should be displayed")
    public void aNewStoryNamedStoryPetagShouldBeDisplayed(String storyName) {
        storyForm.verifyStoryCreation(storyName);
    }
    @And("^I introduce the story description Story (.*)")
    public void iIntroduceTheStoryDescriptionStoryPetagStoryDescription(String storyDescription) {
        storyForm.clickOnStoryDescription();
        storyForm.addTextInToStoryDescriptionTextArea(storyDescription);
        storyForm.clickOnsaveStoryDescription();
    }

    @And("^In IceBox I set (.*) points for the story")
    public void inIceBoxISetPointsForTheStory(String storyPoints) {
        storyForm.setStoryPoints(storyPoints);

    }

    @And("In Icebox I click on start story")
    public void inIceboxIClickOnStartStory() {
        storyForm.clickOnStartStory();
        backlogForm = new BacklogForm();

    }

    @Then("In Backlog the Story: (.*) should be displayed")
    public void inBacklogTheStoryStoryPetagToBacklogShouldBeDisplayed(String storyName) {
        backlogForm = new BacklogForm();
        backlogForm.verifyStoryCreated(storyName);
    }
}

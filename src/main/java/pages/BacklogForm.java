package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class BacklogForm extends AbstractBasePage{


    @FindBy(css = "div[data-type=\"backlog\"] button[title=\"Add Story\"]")
    private WebElement addStoryBacklogButton;
    @FindBy(css = "div[data-type=\"backlog\"] textarea[aria-label=\"story title\"]")
    private WebElement storyTitleBacklogTextField;
    @FindBy(css= "div[data-type=\"backlog\"] button[class=\"autosaves button std save\"]")
    private WebElement saveBacklogStoryButton;

    @FindBy(css= "div[data-type=\"backlog\"] textarea[data-aid=\"textarea\"]")
    private WebElement descriptionBacklogTextArea;
//    @FindBy(css= "div[data-type=\"backlog\"] textarea[data-aid=\"textarea\"]")
//    private WebElement descriptionAreaTextArea;
    @FindBy(css= "div[data-type=\"backlog\"] section[class=\"description full\"]")
    private WebElement descriptionBacklogArea;
    @FindBy(css= "div[data-type=\"backlog\"] button[data-aid=\"save\"]")
    private WebElement clickOnBacklogSaveDescriptionButton;
    @FindBy(css= "div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand")
    private WebElement storyInBacklogList;

    @FindBy(css= "div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand button[class=\"state button start\"")
    private WebElement startStoryButton;

//    @FindBy(css= "div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand button[data-point-value=\"2\"]")
//    private WebElement storyInBacklogList;


    public void clickOnNewStory() {
        addStoryBacklogButton.click();
    }

    public void setStoryName(String storyName) {
        storyTitleBacklogTextField.clear();
        storyTitleBacklogTextField.sendKeys(storyName);
    }

    public void setStoryDescription(String storyDescription) {
        descriptionBacklogArea.click();
        descriptionBacklogTextArea.sendKeys(storyDescription);
        clickOnBacklogSaveDescriptionButton.click();
    }

    public void clickOnSaveStory() {
        saveBacklogStoryButton.click();
    }

    public void verifyStoryCreated(String storyName) {
        assertEquals(storyInBacklogList.getText(),storyName);
    }

    public void setStoryPoints(String storyPoints) {
        String locator;
        locator = String.format("div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand button[data-point-value=\"%s\"]",storyPoints);
        WebElement pointsButton = driver.findElement(By.cssSelector(locator));
        pointsButton.click();

    }

    public void clickOnStartStory() {
        startStoryButton.click();
    }
}
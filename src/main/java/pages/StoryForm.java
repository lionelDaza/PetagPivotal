package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class StoryForm extends AbstractBasePage{

    @FindBy(xpath = "/html/body/div[4]/div[2]/section[1]/article/section/div/div[2]/div/header/div[2]/button/span[1]")
    private WebElement addStoryIceBoxButton;
    @FindBy(css = "textarea[aria-label=\"story title\"]")
    private WebElement storyTitleTextField;
    @FindBy(css= "button[class=\"autosaves button std save\"]")
    private WebElement saveStoryButton;
    @FindBy(css= "div.StoryPreviewItem__clickToExpand")
    private WebElement storyInList;
    @FindBy(css= "section[class=\"description full\"]")
    private WebElement descriptionArea;
    @FindBy(css= "section[class=\"description full\"] textarea[data-aid=\"textarea\"]")
    private WebElement descriptionAreaTextArea;
    @FindBy(css= "button[data-aid=\"save\"]")
    private WebElement clickOnSaveDescriptionButton;

    //    test
    @FindBy(xpath = " //*[@id=\"view150\"]")
    private WebElement currentBacklog;
    @FindBy(css= " div[class =\"tn-panel__loom\"] div[data-cid=\"c203")
    private WebElement storyInListToDrag;
    @FindBy(xpath= "//*[@id=\"view183\"]/div/div[1]/header/div/div/span[1]")
    private WebElement storyInListToDragText;
    @FindBy(css= "div[data-type=\"icebox\"] div.StoryPreviewItem__clickToExpand button[class=\"state button start\"")
    private WebElement startStoryButton;


    public void clickOnAddStoryIceBox(){
        addStoryIceBoxButton.click();
    }

    public void setStoryTitle(String storyTitle){
        storyTitleTextField.clear();
        storyTitleTextField.sendKeys(storyTitle);
    }

    public void clickOnSaveStoryIceBox(){
        saveStoryButton.click();
    }
    public void verifyStoryCreation(String storyName) {
        assertEquals(storyInList.getText(),storyName);
//        actions.dragAndDrop(storyInList,currentBacklog);
//        actions.dragAndDrop(storyInListToDragText,currentBacklog);

    }
    public void clickOnStoryDescription() {
        descriptionArea.click();
    }

    public void addTextInToStoryDescriptionTextArea(String storyDescription) {
        descriptionAreaTextArea.clear();
        descriptionAreaTextArea.sendKeys(storyDescription);
    }

    public void clickOnsaveStoryDescription() {
        clickOnSaveDescriptionButton.click();
    }

    public void setStoryPoints(String storyPoints) {
        String locator;
        locator = String.format("div[data-type=\"icebox\"] div.StoryPreviewItem__clickToExpand button[data-point-value=\"%s\"]",storyPoints);
        WebElement pointsButton = driver.findElement(By.cssSelector(locator));
        pointsButton.click();
    }

    public void clickOnStartStory() {
        startStoryButton.click();
    }
}

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

    @FindBy(css= "div[data-type=\"icebox\"] div.StoryPreviewItem__clickToExpand button[class=\"state button start\"")
    private WebElement startStoryButton;

    /**
     * Método que presiona el boton de agregar story en el IceBox.
     */
    public void clickOnAddStoryIceBox(){
        addStoryIceBoxButton.click();
    }

    /***
     * Método para agregar el nombre de la story.
     * @param storyTitle    String nombre de la story.
     */
    public void setStoryTitle(String storyTitle){
        storyTitleTextField.clear();
        storyTitleTextField.sendKeys(storyTitle);
    }

    /***
     * Método que presiona el boton de salvar story.
     */
    public void clickOnSaveStoryIceBox(){
        saveStoryButton.click();
    }

    /***
     * Método que verifica que la story haya sido creada como se espera.
     * @param storyName String nombre de la story.
     */
    public void verifyStoryCreation(String storyName) {
        assertEquals(storyInList.getText(),storyName);
    }

    /***
     * Método que presiona en el are de descripción de la story.
     */
    public void clickOnStoryDescription() {
        descriptionArea.click();
    }

    /***
     * Método para agregar el texto de la descripción del proyecto.
     * @param storyDescription  String descripción del proyecto.
     */
    public void addTextInToStoryDescriptionTextArea(String storyDescription) {
        descriptionAreaTextArea.clear();
        descriptionAreaTextArea.sendKeys(storyDescription);
    }

    /***
     * Método que presiona el boton de salvar la descripción del proyecto
     */
    public void clickOnsaveStoryDescription() {
        clickOnSaveDescriptionButton.click();
    }

    /***
     * Método para agregar los puntos del story.
     * @param storyPoints   String puntuación de la story(1,2,3...)
     */
    public void setStoryPoints(String storyPoints) {
        String locator;
        locator = String.format("div[data-type=\"icebox\"] div.StoryPreviewItem__clickToExpand button[data-point-value=\"%s\"]",storyPoints);
        WebElement pointsButton = driver.findElement(By.cssSelector(locator));
        pointsButton.click();
    }

    /***
     * Método para presionar el boton de empezar la story.
     */
    public void clickOnStartStory() {
        startStoryButton.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import static org.testng.AssertJUnit.assertEquals;

/***
 * Clase que representa el Backlog form.
 */
public class BacklogForm extends AbstractBasePage{


    @FindBy(css = "div[data-type=\"backlog\"] button[title=\"Add Story\"]")
    private WebElement addStoryBacklogButton;

    @FindBy(css = "div[data-type=\"backlog\"] textarea[aria-label=\"story title\"]")
    private WebElement storyTitleBacklogTextField;

    @FindBy(css= "div[data-type=\"backlog\"] button[class=\"autosaves button std save\"]")
    private WebElement saveBacklogStoryButton;

    @FindBy(css= "div[data-type=\"backlog\"] textarea[data-aid=\"textarea\"]")
    private WebElement descriptionBacklogTextArea;

    @FindBy(css= "div[data-type=\"backlog\"] section[class=\"description full\"]")
    private WebElement descriptionBacklogArea;

    @FindBy(css= "div[data-type=\"backlog\"] button[data-aid=\"save\"]")
    private WebElement clickOnBacklogSaveDescriptionButton;

    @FindBy(css= "div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand span[data-aid=\"StoryPreviewItem__title\"]")
    private WebElement storyInBacklogList;

    @FindBy(css= "div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand button[class=\"state button start\"")
    private WebElement startStoryButton;

    @FindBy(css= "div[data-type=\"backlog\"] aside div[class=\"actions\"] button[title=\"Delete this story\"]")
    private WebElement deleteStoryBasketButton;

    @FindBy(css= "div[data-type=\"backlog\"] aside div[class=\"actions\"] button[title=\"Clone this story\"]")
    private WebElement cloneStoryButton;


    /***
     * Método para hacer click en agregar una story en backlog.
     */
    public void clickOnNewStory() {
        addStoryBacklogButton.click();
    }

    /***
     * Método que agrega el titulo de la story en el backlog.
     * @param storyName String titulo de la story.
     */
    public void setStoryName(String storyName) {
        storyTitleBacklogTextField.clear();
        storyTitleBacklogTextField.sendKeys(storyName);
    }

    /***
     * Método que agrega la descripción de la story en el backlog.
     * @param storyDescription  String descripción de la story.
     */
    public void setStoryDescription(String storyDescription) {
        descriptionBacklogArea.click();
        descriptionBacklogTextArea.sendKeys(storyDescription);
        clickOnBacklogSaveDescriptionButton.click();
    }

    /***
     * Método para hacer click en salvar una story en backlog.
     */
    public void clickOnSaveStory() {
        saveBacklogStoryButton.click();
    }

    /***
     * Metodo para verificar que el nombre de la story fue creado como se espera.
     * @param storyName String titulo de la story.
     */
    public void verifyStoryCreated(String storyName) {
        assertEquals(storyInBacklogList.getText(),storyName);
    }

    /***
     * Método para configurar los puntos de dificultad de la story.
     * @param storyPoints   String valor de la story en string (1,2,3..)
     */
    public void setStoryPoints(String storyPoints) {
        String locator;
        locator = String.format("div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand button[data-point-value=\"%s\"]",storyPoints);
        WebElement pointsButton = driver.findElement(By.cssSelector(locator));
        pointsButton.click();
    }

    /***
     * Método para hacer click en empezar una story del backlog.
     */
    public void clickOnStartStory() {
        startStoryButton.click();
    }

    /***
     * Método para hacer click en crear una story en backlog de acuerdo al nombre/titulo .
     * @param storyName String nombre/tirulo de la story
     */
    public void clickOnCreatedStory(String storyName) {
        List <WebElement> storyList = driver.findElements(By.cssSelector("div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand span[data-aid=\"StoryPreviewItem__title\"]"));
        for (WebElement story : storyList){
            if (story.getText().equals(storyName)){
                story.click();
            }
        }
    }

    /***
     * Método para hacer click en borrar(icono de basurero) una story del backlog.
     */
    public void clickOnDeleteBasketButton() {
        deleteStoryBasketButton.click();
    }

    /***
     * Método para verificar que la story del backlog fue eliminada.
     * @param storyName
     */
    public void verifyStoryDeleted(String storyName) {
        boolean story_found = false;
        List <WebElement> storyList = driver.findElements(By.cssSelector("div[data-type=\"backlog\"] div.StoryPreviewItem__clickToExpand span[data-aid=\"StoryPreviewItem__title\"]"));
        for (WebElement story : storyList){
            if (story.getText().equals(storyName)){
                story_found = true;
            }
        }
        assert !story_found;
    }

    /**
     * Método para hacer click en clonar una story del backlog.
     */
    public void clickOnCloneButton() {
        cloneStoryButton.click();
    }
}

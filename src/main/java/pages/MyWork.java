package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertEquals;

/***
 * Clase que representa el formulario de la seccion de trabajos asignados al usuario.
 */
public class MyWork extends AbstractBasePage{


    @FindBy(css= "div[data-type=\"my_work\"] div.StoryPreviewItem__clickToExpand span[data-aid=\"StoryPreviewItem__title\"]")
    private WebElement storyMyWork;

    /***
     * Método para verificar que la existencia de la story en la seccion My work
     * @param storyName  String nombre/titulo de la story en la seccion My work.
     */
    public void verifyStoryInMyWork(String storyName) {
        assertEquals(storyMyWork.getText(),storyName);
    }
}

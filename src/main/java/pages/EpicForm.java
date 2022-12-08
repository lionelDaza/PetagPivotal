package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

/***
 * Clase que representa el formulario Epic.
 */
public class EpicForm extends AbstractBasePage{

    @FindBy(name = "epic[name]")
    private WebElement epicTextField;
    @FindBy(css= "button.autosaves.std.save")
    private WebElement epicSaveButton;
    @FindBy(css= "div.name")
    private WebElement epicInList;

    /***
     * Método que agrega el titulo del Epic.
     * @param epicName  nombre/titulo del Epic.
     */
    public void introduceEpicName(String epicName){
        epicTextField.clear();
        epicTextField.sendKeys(epicName);
    }

    /***
     * Método para hacer click en guardar Epic.
     */
    public void clickOnSaveEpicButton(){
        epicSaveButton.click();
    }

    /***
     * Método para verificar la creacion del Epic de acuerdo al titulo/nombre.
     * @param epicName  String Epic titulo/nombre.
     */
    public void verifyEpicCreation(String epicName) {
        assertEquals(epicInList.getText(),epicName);
    }

}

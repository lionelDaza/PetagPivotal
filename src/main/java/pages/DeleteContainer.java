package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/***
 *  Clase que representa el contenedor de la accion delete.
 */
public class DeleteContainer extends AbstractBasePage {

    @FindBy(css = "button[data-aid=\"DeleteButton\"]")
    private WebElement deleteButton;
    @FindBy(css = "button[data-aid=\"CancelButton\"]")
    private WebElement cancelButton;

    /***
     * Método para hacer click en borrar una story en el contener de delete.
     */
    public void clickOnDeleteButton() {
        deleteButton.click();
    }
}

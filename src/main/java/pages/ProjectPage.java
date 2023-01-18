package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;

/***
 * Clase que representa la pagina del proyecto.
 */
public class ProjectPage extends AbstractBasePage{
    ProjectPanel panel = new ProjectPanel();

    @FindBy(xpath = "//*[@id=\"view38\"]/div[1]/div/div[1]/header/ul/li[1]/a")
    private WebElement pivotalLogoButton;
    @FindBy(className = "raw_context_name")
    private WebElement pivotalLogoProject;

    /***
     * Metodo que presiona el boton del logo de pivotal tracker.
     * @return  HomePage la pagina inicial.
     */
    public HomePage clickOnPivotalLogo(){
        pivotalLogoButton.click();
        return new HomePage();
    }

    /***
     * Metodo para verificar y esperar que el proyecto este creado.
     * @param projectName   String nombre del proyecto
     */
    public void waitProjectPage(String projectName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("raw_context_name")));
        assertEquals(pivotalLogoProject.getText(),projectName);
    }

    /***
     * Metodo que retorna el panel del proyecto.
     * @return  ProjectPanel panel de opciones del proyecto.
     */
    public ProjectPanel getPanel(){
        return panel;
    }

}

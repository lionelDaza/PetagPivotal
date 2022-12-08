package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Clase que representa el formulario de la creacion del proyecto.
 */
public class ProjectForm extends AbstractBasePage {

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/div/div/div[1]/label/input")
    private WebElement newProjectTextField;

    @FindBy(className = "tc-account-selector")
    private WebElement accountOptionDropDownList;

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/footer/button[2]")
    private WebElement createProjectButton;

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/div/div/div[2]/fieldset/label[1]/input")
    private WebElement privateProjectRadioButton;

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/div/div/div[2]/fieldset/label[2]/input")
    private WebElement publicProjectRadioButton;

    /**
     * Método que agrega el titulo del proyecto.
     * @param projectName  String  nombre/titulo del proyecto
     */
    public void setProjectName(String projectName){
        newProjectTextField.clear();
        newProjectTextField.sendKeys(projectName);
    }

    /***
     * Método que busca y selecciona el la cuenta de usuario en una lista desplegable.
     * @param accountName   String nombre de la cuenta.
     */
    public void chooseAccount(String accountName){
        accountOptionDropDownList.click();
        final int index = 0;
        List<WebElement> menuBodyList = driver.findElements(By.xpath("//div[contains(text(), '" + accountName + "')]"));
        menuBodyList.get(index).click();
    }

    /***
     * Método para seleccionar el tipo de proyecto (privado o publico)
     * @param projectType   String tipo de proyecto.
     */
    public void chooseProjectType(String projectType){
        if (projectType.equals("private")){
            privateProjectRadioButton.click();
        }
        else{
            publicProjectRadioButton.click();
        }
    }

    /***
     * Método para hacer click en agregar una proyecto.
     * @return  ProjectPage la pagina del proyecto.
     */
    public ProjectPage clickOnCreateProject(){
        createProjectButton.click();
        return new ProjectPage();
    }

}

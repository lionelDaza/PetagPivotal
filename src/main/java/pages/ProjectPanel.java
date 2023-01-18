package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/***
 * clase que representa el panel de opciones dentro del proyecto.
 */
public class ProjectPanel extends AbstractBasePage{

    @FindBy(css = ".add_epic span")
    private WebElement createEpicButton;

    /***
     * Método que busca y presiona la opcion del panel requerida.
     * @param option    String nombre del boton del panel del proyecto.
     * @return WebElement que representa el objeto del panel requerido.
     */
    public WebElement clickOnPanelOption(String option){
        WebElement panel = isPanelDisplayed(option);
        if (panel == null ){
            WebElement menuBodyList = driver.findElement(By.xpath("/html/body/div[4]/div[2]/section[1]/div/aside/div[2]/div/section/section/div/ul"));
            List<WebElement> menuOptionButtonsList = menuBodyList.findElements(By.tagName("li"));
            for (WebElement component : menuOptionButtonsList){
                if (component.getText().contains(option)){
                    component.click();
                    break;
                }
            }
        }else{
            return panel;
        }
        return isPanelDisplayed(option);
    }

    /***
     * Verifica si el formulario de la opcion requerida del panel se muestra en la pagina proyecto.
     * @param option    String nombre del boton en el panel del proyecto.
     * @return  WebElement retorna el panel requerido.
     */
    public WebElement isPanelDisplayed(String option){
        WebElement panelType =  null;
        List<WebElement> panelContainer = driver.findElements(By.xpath("//*[@id=\"view38\"]/section[1]/article/section/div/div"));
        for (WebElement panel:panelContainer){
            if (panel.getText().contains(option) || panel.getText().contains(option.split("/")[0]) ){
                panelType = panel;
                return panelType;
            }
        }
        return panelType;
    }
}

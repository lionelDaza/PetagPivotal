package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProjectPanel extends AbstractBasePage{

    @FindBy(css = ".add_epic span")
    private WebElement createEpicButton;


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

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProjectPanel extends AbstractBasePage{

//    @FindBy(className = "item settings_area")
    @FindBy(xpath = "//*[@id=\"sidebar_area\"]/aside/div[2]")
    private WebElement optionsPanel;
    @FindBy(xpath = "/html/body/div[4]/div[2]/section[1]/div/aside/div[2]/div/section/section/div/ul/li[6]/div[2]/span")
    private WebElement epicButton;



    public void clickOnPanelOption(String option){
//        epicButton.click();
        List<WebElement> panelsList = driver.findElements(By.className("panels"));
        WebElement menuBodyList = driver.findElement(By.xpath("/html/body/div[4]/div[2]/section[1]/div/aside/div[2]/div/section/section/div/ul"));
//        WebElement epicButton = driver.findElements(By.xpath("/html/body/div[4]/div[2]/section[1]/div/aside/div[2]/div/section/section/div/ul"));
        List<WebElement> menuOptionButtonsList = menuBodyList.findElements(By.tagName("li"));
        for (WebElement component : menuOptionButtonsList){
            if (component.getText().contains(option)){
                component.click();
            }

        }

    }


}

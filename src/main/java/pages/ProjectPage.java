package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;

public class ProjectPage extends AbstractBasePage{

    @FindBy(xpath = "//*[@id=\"view38\"]/div[1]/div/div[1]/header/ul/li[1]/a")
    private WebElement pivotalLogoButton;
    @FindBy(className = "raw_context_name")
    private WebElement pivotalLogoProject;


    public HomePage clickOnPivotalLogo(){
        pivotalLogoButton.click();
        return new HomePage();
    }

    public void waitProjectPage(String projectName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("raw_context_name")));
        assertEquals(pivotalLogoProject.getText(),projectName);
    }

}

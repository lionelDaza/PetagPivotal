package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProjectForm extends AbstractBasePage {

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/div/div/div[1]/label/input")
    private WebElement newProjectTextField;
   // @FindBy(className = "tc-account-selector__option-account-name")
    @FindBy(className = "tc-account-selector")
    private WebElement accountOptionDropDownList;
    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/footer/button[2]")
    private WebElement createProjectButton;
    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/div/div/div[2]/fieldset/label[1]/input")
    private WebElement privateProjectRadioButton;
    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div[2]/div/form/div/div/div[2]/fieldset/label[2]/input")
    private WebElement publicProjectRadioButton;


    public void setProjectName(String projectName){
        newProjectTextField.clear();
        newProjectTextField.sendKeys(projectName);
    }

    public void chooseAccount(String accountName){
        accountOptionDropDownList.click();
        final int index = 0;
        List<WebElement> menuBodyList = driver.findElements(By.xpath("//div[contains(text(), '" + accountName + "')]"));
        menuBodyList.get(index).click();

    }
    public void chooseProjectType(String projectType){
        if (projectType.equals("private")){
            privateProjectRadioButton.click();
        }
        else{
            publicProjectRadioButton.click();
        }

    }
    public ProjectPage clickOnCreateProject(){
        createProjectButton.click();
        return new ProjectPage();
    }



}

package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class EpicForm extends AbstractBasePage{

    @FindBy(name = "epic[name]")
    private WebElement epicTextField;
    @FindBy(css= "button.autosaves.std.save")
    private WebElement epicSaveButton;
    @FindBy(css= "div.name")
    private WebElement epicInList;

    public void introduceEpicName(String epicName){
        epicTextField.clear();
        epicTextField.sendKeys(epicName);
    }

    public void clickOnSaveEpicButton(){
        epicSaveButton.click();
    }


    public void verifyEpicCreation(String epicName) {
        assertEquals(epicInList.getText(),epicName);
    }

}

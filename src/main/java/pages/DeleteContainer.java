package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteContainer extends AbstractBasePage {


    @FindBy(css = "button[data-aid=\"DeleteButton\"]")
    private WebElement deleteButton;
    @FindBy(css = "button[data-aid=\"CancelButton\"]")
    private WebElement cancelButton;

    public void clickOnDeleteButton() {
        deleteButton.click();
    }
}

package pages;

import UI.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertMessage extends AbstractBasePage {
    public void clickOKAlertMessage() {
        if (wait.until(ExpectedConditions.alertIsPresent())!=null){
            Driver.getInstance().getWebDriver().switchTo().alert().accept();
        }
    }
}

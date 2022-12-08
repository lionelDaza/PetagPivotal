package pages;

import UI.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/***
 *
 */
public class AlertMessage extends AbstractBasePage {
    public void clickOKAlertMessage() {
        try {
            if (wait.until(ExpectedConditions.alertIsPresent())!=null){
                Driver.getInstance().getWebDriver().switchTo().alert().accept();
            }
        }catch (Exception e){
            System.out.println("no hay Alert");

        }

    }
}

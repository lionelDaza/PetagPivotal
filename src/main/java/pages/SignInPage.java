package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Clase que representa la pagina de Sign in.
 */
public class SignInPage extends AbstractBasePage  {

    @FindBy(id = "credentials_username")
    private WebElement userNameTextField;
    @FindBy(id = "credentials_password")
    private WebElement passwordTextField;
    @FindBy(name = "action")
    private WebElement nextSigninButton;
    @FindBy(xpath = "//*[@id=\"login_type_check_form\"]/div[1]")
    private WebElement errorLoginMessage;


    /**
     * Metodo que limpia el text field y agrega el nombre de usuario de la cuenta.
     * @param userName  String  Nombre de usuario de la cuenta de pivotal tracker.
     */
    public void setUserName(String userName){
        userNameTextField.clear();
        userNameTextField.sendKeys(userName);
    }

    /**
     * Método que limpia el text field y agrega el password de usuario de la cuenta.
     * @param password String Password de la cuenta de pivotal tracker.
     */
    public void setPassord(String password){
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    /**
     * Método que presiona el boton de login.
     */
    public void clickOnNextButton(){
        nextSigninButton.click();
    }

    /**
     * Método que presiona el boton de login.
     */
    public HomePage clickOnNextButtonAndGoToHomePage(){
        nextSigninButton.click();
        return new HomePage();
    }

    public void errorMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"login_type_check_form\"]/div[1]")));
    }

}
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Clase que representa la pagina de Welcome.
 */
public class WelcomePage extends AbstractBasePage {

    @FindBy(xpath = "//a[contains(@tabindex,'1')]")
    private WebElement loginButton;

    /**
     * Método que presiona el boton de login y devuelve la pagina de sign in.
     *
     * @return class SignInPage class.
     */
    public SignInPage clickOnLoginButton() {
        loginButton.click();
        return new SignInPage();
    }

}

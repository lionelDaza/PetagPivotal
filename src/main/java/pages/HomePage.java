package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Clase que representa la pagina de Home.
 */
public class HomePage extends AbstractBasePage{

    @FindBy(xpath = "//*[@id=\"shared_header\"]/div/div/header/ul/li[3]/div/div/button")
    public static WebElement profileButton;
    @FindBy(xpath = "//*[@id=\"shared_header\"]/div/div/header/ul/li[3]/div/div/div[2]/div/div/form/button")
    public static  WebElement signOutButton;
    @FindBy(id = "create-project-button")
    private WebElement createProjectButton;

    /**
     * Metodo que espera que la pagina Home sea visible en el Dom.
     */
    public void waitHomePage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"shared_header\"]/div/div/header/ul/li[2]/div/button")));
    }
    public static void clickOnProfileButton(){
        profileButton.click();
    }

    public static SignInPage clickOnSignOutButton(){
        signOutButton.click();
        return new SignInPage();
    }

    public static SignInPage signOut(){
        clickOnProfileButton();
        return clickOnSignOutButton();
    }

    public ProjectForm clickOnProjectButton(){
        createProjectButton.click();
        return new ProjectForm();
    }


}

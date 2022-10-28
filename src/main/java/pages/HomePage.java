package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Clase que representa la pagina de Home.
 */
public class HomePage extends AbstractBasePage{

    /**
     * Metodo que espera que la pagina Home sea visible en el Dom.
     */
    public void waitHomePage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"shared_header\"]/div/div/header/ul/li[2]/div/button")));

    }
}

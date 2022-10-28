package pages;
import UI.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clase Abstracta que hereda el Driver a a las Paginas.
 */
public abstract class AbstractBasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * Constructor.
     */
    public AbstractBasePage() {
        this.wait = Driver.getInstance().wait;
        this.driver = Driver.getInstance().getWebDriver();
        PageFactory.initElements(this.driver, this);
    }
}

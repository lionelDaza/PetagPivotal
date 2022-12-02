package pages;
import UI.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clase Abstracta que hereda el Driver a a las Paginas.
 */
public abstract class AbstractBasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    /**
     * Constructor.
     */
    public AbstractBasePage() {
        this.wait = Driver.getInstance().wait;
        this.driver = Driver.getInstance().getWebDriver();
        this.actions = Driver.getInstance().getWebDriverActions();
        PageFactory.initElements(this.driver, this);
    }
}

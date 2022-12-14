package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Clase que inicializa y configura el web driver que se usara de acuerdo al navegador.
 */
public class Driver {
    public static Driver driverInstance = null;
    public Environment env = Environment.getInstance();
    public WebDriver driver;
    public WebDriverWait wait;

    /**
     * Constructor.
     */
    public Driver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(env.getBaseUrl());
        wait = new WebDriverWait(driver, 10);
    }

    /**
     * Método que verifica si es que la clase ya fue instanciada, y devuelve la instancia actual.
     *
     * @return class La instancia de la clase Driver.
     */
    public static Driver getInstance() {
        if (driverInstance == null) {
            driverInstance = new Driver();
        }
        return driverInstance;
    }

    /**
     * Método que devuelve el driver configurado.
     *
     * @return objeto Webdriver.
     */
    public WebDriver getWebDriver() {
        return driver;
    }
}

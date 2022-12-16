package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements BrowserWebDriver {
    public WebDriver FireFoxDriver;
    @Override
    public WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        FireFoxDriver = new FirefoxDriver();
        return FireFoxDriver;

    }
}

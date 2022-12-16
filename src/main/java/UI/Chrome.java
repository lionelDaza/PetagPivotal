package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements BrowserWebDriver {
   public WebDriver chromeDriver;

    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        return chromeDriver;
    }
}

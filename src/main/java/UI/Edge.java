package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge implements BrowserWebDriver {
    public WebDriver edgeDriver;
    @Override
    public WebDriver getDriver() {
        WebDriverManager.edgedriver().setup();
        edgeDriver = new EdgeDriver();
        return edgeDriver;
    }
}

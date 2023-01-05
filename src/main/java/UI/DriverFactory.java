package UI;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {
    static Logger logger = LoggerFactory.getLogger(DriverFactory.class);

    public WebDriver getDriver(String browserType){

        switch (browserType) {
            case ("FireFox"):
                logger.info("Inicializando FireFox WebDriver");
                return new FireFox().getDriver();
            case ("Edge"):
                logger.info("Inicializando Edge WebDriver");
                return new Edge().getDriver();
            default:
                logger.info("Inicializando Chrome WebDriver");
                return new Chrome().getDriver();
        }
    }
}

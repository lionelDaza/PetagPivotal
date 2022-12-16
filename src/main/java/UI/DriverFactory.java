package UI;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public WebDriver getDriver(String browserType){

        switch (browserType) {
            case ("FireFox"):
                return new FireFox().getDriver();
            case ("Edge"):
                return new Edge().getDriver();
            default:
                return new Chrome().getDriver();
        }
    }
}

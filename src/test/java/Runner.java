import UI.Driver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projectHooks.LoginHooks;
import utils.Reporting;


/**
 * Clase que ejecutara los Features.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "junit:target/cucumber-report.xml"},
        features = {"src/test/resources/features/01_login.feature"},
        glue = {""}
)


public class Runner {
    static Logger logger = LoggerFactory.getLogger(LoginHooks.class);

        @AfterClass
        public static void generateReport(){
            logger.info("Creando Reporte Cucumber");
            Reporting.cucumberReport();
            //Finaliza la instancia del WebDriver
            logger.info("Cerrando Web Driver");
            Driver.getInstance().getWebDriver().close();
        }
}

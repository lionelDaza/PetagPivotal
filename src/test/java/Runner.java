import UI.Driver;
import io.cucumber.java.AfterAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import utils.Reporting;

import java.util.Locale;

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
        features = {"src/test/resources/features"},
        glue = {""}
//        tags = ("@Login or @Project or @Epic")
)


public class Runner extends AbstractTestNGCucumberTests {

        @AfterSuite
        public void generateReport(){
               Reporting.cucumberReport();
               //Finaliza la instancia del WebDriver
               Driver.getInstance().getWebDriver().close();
        }
}

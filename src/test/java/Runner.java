import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import utils.Reporting;

/**
 * Clase que ejecutara los Features.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty",
                "html:target/test-report.html",
                "json:target/cucumber.json"
//                "junit:target/test-report.xml"
        },
        features = {
                "src/test/resources/features"
        },
        glue = {
                ""
        }
)


public class Runner extends AbstractTestNGCucumberTests {
        @AfterSuite
        public void generateReport(){
               Reporting.cucumberReport();
        }
}

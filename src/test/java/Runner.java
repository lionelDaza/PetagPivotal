import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Clase que ejecutara los Features.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"

        },
        glue = "StepsDefinition"
)

public class Runner {
}

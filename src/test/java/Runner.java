import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * This class execute the features.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
//        features = {
//                "src/test/resources/features/login"
//        }
        features = {
                "src/test/resources/features"

        },
        glue = "StepsDefinition"
//        ,glue={"StepsDefinition"}

)

public class Runner {
}

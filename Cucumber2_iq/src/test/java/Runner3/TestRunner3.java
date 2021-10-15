package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(
        features = "/Users/incikaratay/git/Cucumber2_iq/src/test/java/features/login.feature",
        glue = "stepDefinition",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
        )
public class TestRunner {
}

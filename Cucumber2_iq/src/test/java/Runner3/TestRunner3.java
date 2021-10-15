package Runner3;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(
        dryRun =false,// true olursa testi calsitirmadan once terminalde her featurenin karsiligi var mi onu gosterir.
        features = "/Users/incikaratay/git/Cucumber2_iq/src/test/java/features1",
        glue = "stepDefinition2",
     //   tags = "@multipleUsers", //unprofessional
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
        )
public class TestRunner3 {
}

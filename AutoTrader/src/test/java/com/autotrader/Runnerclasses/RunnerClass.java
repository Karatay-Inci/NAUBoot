package com.autotrader.Runnerclasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**
 * if any scenario fails, we are storing the fail details
 * in rerun.txt and we are only calling failed scenarios.
 */

@RunWith( Cucumber.class )
@CucumberOptions(

        features = "/Users/incikaratay/git/AutoTrader/src/test/resources/features",
        glue = {"/Users/incikaratay/git/AutoTrader/src/test/java/com/autotrader/stepDefinitions"},
        dryRun =false,
        tags = "@smoke_test, @unit_test",
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/cucumber.json",
                  "return:target/rerun.txt"
        }
)

public class RunnerClass {

}

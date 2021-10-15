package com.autotrader.Runnerclasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions (

        features = {"@target/rerun.txt",},
        glue = "com/autotrader/StepDefinitions",

        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber_failure.json",
        }
)

public class FailedRunner {

    

}

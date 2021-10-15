package com.autotrader.stepDefinitions;

import com.autotrader.utilities.ConfigurationReader;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Hook {
    Logger logger = LoggerFactory.getLogger(Hook.class);


    @Before

    public void setup(){

        logger.info("##### SETUP STARTED (HOOK) ######");

        MyDriver.get().get(ConfigurationReader.getProperty("Url"));
    }

    @After
    public void after(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            logger.error("!!!!Test Failed! check the screenshot!!!!");
            byte[] screenshot= ((TakesScreenshot)MyDriver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"images/png","Screenshot");
            //scenario.embed(screenshot,"images/png"); versiyon 4.7.4

        }else {
            logger.info("Test Completed");
        }
        logger.info("###### END OF TESTS #####");

        MyDriver.close();
    }
}

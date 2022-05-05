package com.automation.steps;

import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;

import java.util.ArrayList;


public class Hooks {

    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    WebDriver driver;
    Logger log = Logger.getLogger(Hooks.class);


    @Before("@start_scenario")
    public void initDriver() {
        driver = DriverFactory.createDriver();
        DriverFactory.setDriver(driver);
        DriverFactory.addDriver(driver);
        driver.get(HOME_PAGE_URL);
    }

    @After("@end_scenario")
    public void tearDown() {
        if (driver != null) {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            for (String handle : tabs) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
    }

    @After
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                log.info(scenario.getName() + "Fails");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



}

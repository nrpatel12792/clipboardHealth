package com.automation.steps;

import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    public static WebDriver driver;


    @Before("@start_scenario")
    public void initDriver() {
        driver = DriverFactory.getDriver();
        driver.get(HOME_PAGE_URL);
    }

}

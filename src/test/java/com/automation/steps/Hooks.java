package com.automation.steps;

import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class Hooks {

    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    public static WebDriver driver;


    @Before("@start_scenario")
    public void initDriver() {
        driver = DriverFactory.getDriver();
        driver.get(HOME_PAGE_URL);
    }

    @After("@end_scenario")
    public void closeDriver() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        for (String handle : tabs) {
            driver.switchTo().window(handle);
            driver.close();
        }
    }
}

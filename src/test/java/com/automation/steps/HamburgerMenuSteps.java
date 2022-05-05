package com.automation.steps;

import amazon.factories.DriverFactory;
import com.automation.pages.HamburgerMenuPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class HamburgerMenuSteps {

    WebDriver driver = DriverFactory.getWebDriver();
    public HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage(driver);

    @Then("^user clicks \"([^\"]*)\" on hamburger menu page$")
    public void clickHamburgerOption (String option) throws Exception {
        hamburgerMenuPage.clickHamburgerOption(option);
    }
}

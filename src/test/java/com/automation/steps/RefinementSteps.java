package com.automation.steps;

import amazon.factories.DriverFactory;
import com.automation.pages.RefinementPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class RefinementSteps {

    WebDriver driver = DriverFactory.getWebDriver();
    RefinementPage refinementPage = new RefinementPage(driver);

    @Then("^user selects option \"([^\"]*)\" on refinement page$")
    public void clickRefinementOption (String option) throws Exception {
        refinementPage.clickRefinementOption(option);
    }
}

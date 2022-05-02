package com.automation.steps;

import com.automation.pages.HamburgerMenuPage;
import com.automation.pages.RefinementPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class RefinementSteps {

    WebDriver driver = Hooks.driver;
    RefinementPage refinementPage = new RefinementPage(driver);

    @Then("^user select option \"([^\"]*)\" on refinement page$")
    public void clickRefinementOption (String option) throws Exception {
        refinementPage.clickRefinementOption(option);
    }
}

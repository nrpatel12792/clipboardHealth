package com.automation.steps;

import com.automation.pages.NavPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class NavSteps {

    WebDriver driver = Hooks.driver;
    NavPage navPage = new NavPage(driver);

    @Then("^user clicks hamburger button on nav page$")
    public void clickHamburgerButtonNavPage () throws Exception {
        navPage.clickHamburgerIcon();
    }

    @And("^user selects option \"([^\"]*)\" in filter dropdown on nav page$")
    public void selectOptionFromDropDown(String option) throws Exception {
        navPage.selectOptionFromDropDown(option);
    }
}

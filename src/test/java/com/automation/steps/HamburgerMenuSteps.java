package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class HamburgerMenuSteps {

    WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @Then("^user clicks hamburger button on home page$")
    public void clickHamburgerButtonHomePage () throws Exception {
        homePage.clickHamburgerIcon();
    }
}

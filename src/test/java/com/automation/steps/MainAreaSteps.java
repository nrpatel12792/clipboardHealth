package com.automation.steps;

import com.automation.pages.MainAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainAreaSteps {

    WebDriver driver = Hooks.driver;
    MainAreaPage mainAreaPage = new MainAreaPage(driver);

    @And("^user clicks product number \"([^\"]*)\" on main area page$")
    public void clickProductOnMainArea (int option) throws Exception {
        mainAreaPage.clickProductOnMainArea(option);
    }

    @Then("^validate correct item About description for product \"([^\"]*)\" on main area page$")
    public  void validateCorrectItemAboutDescription(String productName) throws Exception {
            Assert.assertTrue("Item description does not match expected one!",  mainAreaPage.validateCorrectItemAboutDescription(productName));
    }
}

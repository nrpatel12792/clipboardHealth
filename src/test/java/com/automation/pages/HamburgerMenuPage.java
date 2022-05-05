package com.automation.pages;

import com.automation.pageElements.HamburgerMenuPageElements;
import com.automation.steps.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HamburgerMenuPage extends BasePage{

     HamburgerMenuPageElements hamburgerMenuPageElements = new HamburgerMenuPageElements();

    public HamburgerMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, hamburgerMenuPageElements);
    }

    public void clickHamburgerOption(String option) throws Exception {
        List<WebElement> hamburgerOptionList = hamburgerMenuPageElements.hamburgerMenuOptions;
        clickElementFromList(hamburgerOptionList, option);
    }


}

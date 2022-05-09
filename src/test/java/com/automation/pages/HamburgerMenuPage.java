package com.automation.pages;

import com.automation.pageElements.HamburgerMenuPageElements;
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
        isDisplayed(hamburgerMenuPageElements.hamburgerMenuWindow,10);
        List<WebElement> hamburgerOptionList = hamburgerMenuPageElements.hamburgerMenuOptions;
        clickElementFromList(hamburgerOptionList, option);
    }


}

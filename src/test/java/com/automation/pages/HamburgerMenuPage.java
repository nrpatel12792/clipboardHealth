package com.automation.pages;

import com.automation.pageElements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenuPage extends BasePage{

     m = new HomePageElements();

    public HamburgerMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, homePageElements);
    }

    public void clickHamburgerIcon () throws Exception {
        clickElement(homePageElements.hamburgerButton);
    }


}

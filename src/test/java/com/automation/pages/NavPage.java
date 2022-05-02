package com.automation.pages;

import com.automation.pageElements.NavPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NavPage extends BasePage{

    NavPageElements navPageElements = new NavPageElements();

    public NavPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, navPageElements);
    }

    public void clickHamburgerIcon () throws Exception {
        clickElement(navPageElements.hamburgerButton);
    }


    public void selectOptionFromDropDown(String option) throws Exception {
        clickElement(navPageElements.dropDownButton);
        isDisplayed(navPageElements.dropDownList, 3);
        List<WebElement> dropDownList = navPageElements.dropDownOptionsList;
        clickElementFromList(dropDownList, option);
    }
}

package com.automation.pages;

import com.automation.pageElements.RefinementPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RefinementPage extends BasePage{

     RefinementPageElements refinementPageElements = new RefinementPageElements();

    public RefinementPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, refinementPageElements);
    }

    public void clickRefinementOption(String option) throws Exception {
        isDisplayed(refinementPageElements.brandLabel, 5);
        List<WebElement> refinementOptionList = refinementPageElements.refinementOptionList;
        clickElementFromList(refinementOptionList, option);
    }


}

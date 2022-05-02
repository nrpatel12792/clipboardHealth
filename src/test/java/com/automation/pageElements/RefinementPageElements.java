package com.automation.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RefinementPageElements {

    @FindBy(className = "a-link-normal")
    public List<WebElement> refinementOptionList;

    @FindBy(xpath = "//span[normalize-space()='Brands']")
    public WebElement brandLabel;

}

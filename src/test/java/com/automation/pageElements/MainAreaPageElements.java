package com.automation.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainAreaPageElements {

    @FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])")
    public List<WebElement> productTitleList;

    @FindBy(id = "feature-bullets")
    public WebElement productAboutDescription;

}

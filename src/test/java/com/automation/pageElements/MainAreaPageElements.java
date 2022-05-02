package com.automation.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainAreaPageElements {

    @FindBy(tagName = "h2")
    public List<WebElement> productTitleList;

    @FindBy(id = "feature-bullets")
    public WebElement productAboutDescription;

}

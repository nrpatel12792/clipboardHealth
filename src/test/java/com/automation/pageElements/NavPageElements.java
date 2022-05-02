package com.automation.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavPageElements {

    @FindBy(id = "nav-hamburger-menu")
    public WebElement hamburgerButton;

    @FindBy(id = "a-autoid-0-announce")
    public WebElement dropDownButton;

    @FindBy(css = ".a-nostyle.a-list-link")
    public WebElement dropDownList;

    @FindBy(className = "a-dropdown-link")
    public List<WebElement> dropDownOptionsList;

}

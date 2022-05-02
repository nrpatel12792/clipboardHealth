package com.automation.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HamburgerMenuPageElements {

    @FindBy(className = "hmenu-item")
    public List<WebElement> hamburgerMenuOptions;

}

package com.automation.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement (WebElement element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }catch (Exception e) {
            throw new Exception("Cannot click element: " + element);
        }
    }

    public void clickElementFromList (List<WebElement> elementsList, String option) throws Exception {
        for (WebElement options : elementsList) {
            if (options.getText().toLowerCase().equals(option.toLowerCase())) {
                clickElement(options);
                return;
            }
        }
        System.err.println("Cannot find " + option + " in list!");
    }

    public void clickElementFromListByIndex (List<WebElement> elementsList, int option) throws Exception {
        if (elementsList.size() >= option) {
            clickElement(elementsList.get(option-1));
            return;
        }
        System.err.println("Option number:" + option + " exceeds in list!");
    }

    public boolean isDisplayed (WebElement element, int time) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        }catch (Exception e) {
            throw new Exception("Element is not displayed: " + element);
        }
    }

    public void switchTab (int tabNumber) {
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(tabNumber-1));
    }

    public String getText (WebElement element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.getText();
        }catch (Exception e) {
            throw new Exception("Cannot getText of element: " + element);
        }
    }
}

package com.automation.pages;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public boolean isDisplayed (WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        }catch (Exception e) {
            throw new Exception("Element is not displayed: " + element);
        }
    }

    public String getText (WebElement element) throws Exception {
        try {
            return element.getText();
        }catch (Exception e) {
            throw new Exception("Cannot getText of element: " + element);
        }
    }
}

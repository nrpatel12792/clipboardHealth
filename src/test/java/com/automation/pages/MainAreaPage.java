package com.automation.pages;

import com.automation.pageElements.MainAreaPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class MainAreaPage extends BasePage{

     MainAreaPageElements mainAreaPageElements = new MainAreaPageElements();

    public MainAreaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, mainAreaPageElements);
    }

    public void clickProductOnMainArea(int option) throws Exception {
        isDisplayed(mainAreaPageElements.productTitleList.get(option),10);
        List<WebElement> productTitleList = mainAreaPageElements.productTitleList;
        clickElementFromListByIndex(productTitleList, option);
    }

    public boolean validateCorrectItemAboutDescription(String productName) throws Exception {
        switchTab(2);
        String aboutDescriptionText = getText(mainAreaPageElements.productAboutDescription);
        File file = new File("./src/test/resources/data/" + productName + ".txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            if (!aboutDescriptionText.contains(scan.nextLine())) {
                scan.close();
                return false;
            }
        }
        scan.close();
        return true;
    }
}

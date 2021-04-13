package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AboutPage {

    //--- Fields
    private WebDriver driver;

    private By loc_pageBanner = By.xpath("//h1");
    private By loc_zipBttn = By.linkText("Download the Brand Assets (ZIP)");
    private By loc_historyLink_1 = By.linkText("Fog Creek Software");
    private By loc_historyLink_2 = By.linkText("Spark Capital");
    private By loc_historyLink_3 = By.linkText("Index Ventures");
    private By loc_historyLink_4 = By.linkText("acquired by Atlassian");
    private By loc_historyLink_5 = By.linkText("Help us add more things to this list.");
    private By loc_historyLinks = By.xpath("//ul/li/p/a");

    private By loc_automation_page = By.linkText("Automation");

    //--- Constructor
    public AboutPage(WebDriver inputDriver) {
        driver = inputDriver;
    }

    //--- Methods

    public void gotoAutomationPage() {
        WebElement automationLinkElem = driver.findElement(loc_automation_page);
        Actions action = new Actions(driver);
        action.moveToElement(automationLinkElem)
                .perform();
        automationLinkElem.click();
    }

    public boolean isPageDisplayed() {
        WebElement pageBanner = driver.findElement(loc_pageBanner);
        return pageBanner.isDisplayed();
    }

    public boolean isLinksClickable() {
        List<WebElement> historyLinksAll = driver.findElements(loc_historyLinks);
        boolean result = true;
        for(int i=0; i< historyLinksAll.size(); i++) {
            boolean isClickable = historyLinksAll.get(i).isEnabled();
            result = result && isClickable;
        }
        return result;
    }
}

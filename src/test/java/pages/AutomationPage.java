package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationPage {

    // fields
    private WebDriver driver;

    private By loc_automation_banner = By.xpath("//h1");
    private By loc_try_button = By.xpath("(//span)[3]");
    private By loc_learn_link = By.xpath("(//a[@href='/pricing'])[1]");
    private By loc_imgs_all = By.xpath("//img");

    // constructor
    public AutomationPage(WebDriver inputDriver) {
        driver = inputDriver;
    }

    // methods
    public boolean isPageDisplayed() {
        WebElement bannerElem = driver.findElement(loc_automation_banner);
        WebElement tryBtnElem = driver.findElement(loc_try_button);
        WebElement learnLink = driver.findElement(loc_learn_link);

        return bannerElem.isDisplayed() && tryBtnElem.isDisplayed() && learnLink.isDisplayed();
    }

    public boolean isImagsDisplayed() {
        List<WebElement> imgsElems = driver.findElements(loc_imgs_all);
        boolean result = true;
        for(int i=0; i < imgsElems.size(); i++) {
            result = result && imgsElems.get(i).isDisplayed();
        }
        return result;
    }
}

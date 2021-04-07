package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

    //-- Fields (list of element locations, webdriver)
    private WebDriver driver;
    private By loc_page_banner = By.xpath("(//h1)[1]");

    //-- Constructor (webdriver instance injected)
    public SignupPage(WebDriver inputDriver) {
        driver = inputDriver;
    }

    //-- Methods (represents actual user actions)
    public boolean isSignupPageVisible() {
        WebElement pageBannerElem = driver.findElement(loc_page_banner);
        return pageBannerElem.isDisplayed();
    }
}

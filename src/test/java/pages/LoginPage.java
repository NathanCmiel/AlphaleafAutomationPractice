package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //-- Fields (list of element location, webdriver)
    private WebDriver driver;
    private By loc_page_banner = By.xpath("//h1");
    private By loc_email_input = By.id("user");
    private By loc_pass_input = By.id("password");
    private By loc_login_bttn = By.id("login");

    //-- Constructor (webdriver instance injected)
    public LoginPage(WebDriver inputDriver) {
        driver = inputDriver;
    }
    //-- Methods (represents actual user actions)
    public boolean isLoginPageVisible() {
        WebElement pageBannerElem = driver.findElement(loc_page_banner);
        return pageBannerElem.isDisplayed();

    }

    public void login(String email, String password) {
        // 1. enter email
        WebElement emailElement = driver.findElement(loc_email_input);
        emailElement.sendKeys(email);

        // 2. enter password
        WebElement passwordElement = driver.findElement(loc_pass_input);
        passwordElement.sendKeys(password);

        // 3. click "log in" button
        WebElement loginBttn = driver.findElement(loc_login_bttn);
        loginBttn.click();
    }
}

/*
WebDriver driver = new ChromeDriver();
LoginPage loginPage = new LoginPage(driver);
loginPage.login("nijat@alpha.com", "pass123!");
 */
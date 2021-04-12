package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PricingPage {
    //---- Fields
    private WebDriver driver;
    private By loc_page_banner = By.xpath("//h1");
    private By loc_price_free = By.xpath("//h2[text()='Free']");
    private By loc_price_biz = By.xpath("//h2[text()='Business Class']");
    private By loc_price_entp = By.xpath("//h2[text()='Enterprise']");
    private By loc_price_biz_monthly = By.xpath("(//div[contains(@class,'dRnxNh')])[2]");
    private By loc_try_free_bttn = By.xpath("//span[text()='Try for free']");

    //---- Constructors
    public PricingPage(WebDriver inputDriver) {
        driver = inputDriver;
    }

    //---- Methods
    public boolean isPageDisplayed() {
        WebElement pageBanner = driver.findElement(loc_page_banner);
        return pageBanner.isDisplayed();
    }

    public boolean isPricingCategoryDisplayed() {
        WebElement freeTier = driver.findElement(loc_price_free);
        WebElement bizTier = driver.findElement(loc_price_biz);
        WebElement entpTier = driver.findElement(loc_price_entp);

        boolean isFreeTierThere = freeTier.isDisplayed();
        boolean isBizTierThere = bizTier.isDisplayed();
        boolean isEntpTierThere = entpTier.isDisplayed();

        return (isBizTierThere && isEntpTierThere && isFreeTierThere);
    }

    public boolean verifyBizMonthlyPrice(String expectedPrice) {
        WebElement bizMonthlyPrice = driver.findElement(loc_price_biz_monthly);
        String actualPrice = bizMonthlyPrice.getText();
        return actualPrice.equals(expectedPrice);
    }
}

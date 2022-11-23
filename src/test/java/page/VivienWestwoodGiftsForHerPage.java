package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static page.VivienWestwoodHomePage.HOMEPAGE_URL;

public class VivienWestwoodGiftsForHerPage extends BasePage {
    public VivienWestwoodGiftsForHerPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
    public VivienWestwoodGiftsForHerPage(WebDriver driver) {
        super(driver);
    }


    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

}
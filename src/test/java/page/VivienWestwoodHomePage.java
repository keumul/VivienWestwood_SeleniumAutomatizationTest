package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VivienWestwoodHomePage extends BasePage {
    public static final String HOMEPAGE_URL = "https://www.viviennewestwood.com/en/";
    @FindBy(xpath = "//*[@id=\"p-homepage\"]/header/div[3]/div/div/form/div/fieldset/div[1]")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"onetrust-reject-all-handler\"]")
    private WebElement cookieButton;

    @FindBy(xpath = "//*[@id=\"p-homepage\"]/div[4]/nav[2]/div/ul/li[7]")
    private WebElement giftsMenu;

    @FindBy(xpath = "//*[@id=\"p-homepage\"]/div[8]/div/span")
    private WebElement closeModal;

    @FindBy(xpath = "//*[@id=\"p-homepage\"]/div[4]/nav[2]/div/ul/li[7]/div/div[1]/ul/li[4]/a")
    private WebElement forHerButton;

    @FindBy(xpath = "//*[@id=\"p-search\"]/div[3]/ul/li[1]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"p-homepage\"]/header/div[3]/div/div/form/div/fieldset/button[2]")
    private WebElement firstAccessories;

    public VivienWestwoodHomePage(WebDriver driver) {
            super(driver);
        }

    public VivienWestwoodHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public VivienWestwoodHomePage searchButton() throws InterruptedException {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(searchButton))
                .click();
        return this;
    }
    public VivienWestwoodHomePage giftsMenu() throws InterruptedException {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(giftsMenu))
                .click();
        return this;
    }

    public VivienWestwoodGiftsForHerPage forHerButton(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(forHerButton))
                .click();
        return new VivienWestwoodGiftsForHerPage(driver);
    }

    public VivienWestwoodHomePage rejectCookies() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                ExpectedConditions.elementToBeClickable(cookieButton)).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                ExpectedConditions.elementToBeClickable(closeModal)).click();
        return this;

    }

    public VivienWestwoodHomePage searchAccessories(String accessories) {
        searchField.sendKeys(accessories);
        return this;
    }

    public VivienWestwoodGiftsForHerPage openFirstAccessoriesPage() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                ExpectedConditions.elementToBeClickable(firstAccessories)).click();
        return new VivienWestwoodGiftsForHerPage(driver);
    }
}

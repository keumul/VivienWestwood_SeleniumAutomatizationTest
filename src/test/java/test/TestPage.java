package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestPage {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = getDriver();
    }
    private WebDriver getDriver() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        return new ChromeDriver(options);
    }
    @AfterEach
    public void teardown() {
        driver.quit();
    }
}

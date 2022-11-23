package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import page.VivienWestwoodGiftsForHerPage;
import page.VivienWestwoodHomePage;

class VivienWestwoodTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = getDriver();
    }
    private WebDriver getDriver() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        return new ChromeDriver(options);
    }

//    @Test
//    @DisplayName("Test: go to accessories from search")
//    void openAccessoriesPage()
//            throws InterruptedException {
//        VivienWestwoodGiftsForHerPage accessoriesPage =
//                new VivienWestwoodHomePage(driver).openPage()
//                        .rejectCookies()
//                        .searchButton()
//                        .searchAccessories("Accessories")
//                        .openFirstAccessoriesPage();
//        Assertions.assertEquals(
//                "https://www.viviennewestwood.com/en/search-results?q=Accessories&cgid=",
//                accessoriesPage.getPageUrl());
//    }


    @Test
    @DisplayName("Test: go to gifts for her from menu")
    void giftsForHerFromMenu() throws InterruptedException {
        VivienWestwoodGiftsForHerPage giftsPage =
                new VivienWestwoodHomePage(driver).openPage()
                        .rejectCookies()
                        .giftsMenu()
                        .forHerButton();
        Assertions.assertEquals(
                "https://www.viviennewestwood.com/en/for-her-1/",
                giftsPage.getPageUrl());
    }
    @AfterEach
    @DisplayName("Close Chrome Driver")
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}

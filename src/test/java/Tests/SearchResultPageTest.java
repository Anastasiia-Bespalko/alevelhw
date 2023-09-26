package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ChargeStationResultPage;
import page_objects.HomePage;
import page_objects.SearchResultPage;

import java.time.Duration;

public class SearchResultPageTest {
    private WebDriver driver;

    @BeforeMethod
    public void driverInitialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://hotline.ua/");
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }

    @Test
    public void comparePricesAndCheckTitle() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnEnergyButton();

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.chargingStationsClick();
    }

    @Test
    public void verifyThatSearchResultPageTitleIsCorrect() {
        String wordToSearch = "Samsung";
        HomePage homePage = new HomePage(driver);

        homePage.searchProductWithEnterKey(wordToSearch);

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        String actualSearchResultPageTitle = searchResultPage.getSearchResultPageTitle();

        Assert.assertTrue(actualSearchResultPageTitle.contains(wordToSearch));


    }
}

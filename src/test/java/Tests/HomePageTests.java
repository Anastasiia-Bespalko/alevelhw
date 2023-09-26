package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchResultPage;

public class HomePageTests {

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
    public void verifySearchResultsForSmartphone() {
        String searchWord = "смартфон";
        HomePage homePage = new HomePage(driver);
        homePage.searchProductByWord(searchWord);

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.searchResultProductByWord();
        Assert.assertTrue(searchResultPage.getSearchResultsElement().isDisplayed());

    }



}

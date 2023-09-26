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
import page_objects.SearchResultChargePage;
import page_objects.SearchResultPage;

import java.time.Duration;


public class ChargeStationResultPageTest {
    private WebDriver driver;

    @BeforeMethod
    public void driverInitialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }

    @Test
    public void titleIsCorrect() {

        HomePage homePage = new HomePage(driver);
        homePage.clickOnEnergyButton();

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.chargingStationsClick();

        ChargeStationResultPage chargeStationResultPage = new ChargeStationResultPage(driver);
        chargeStationResultPage.clickOnComparePricesButton(2);

        SearchResultChargePage searchResultChargePage = new SearchResultChargePage(driver);

        String expectedTitle = "Зарядна станція";
        searchResultChargePage.isTitleContainsText(expectedTitle);

        Assert.assertTrue(searchResultChargePage.isTitleContainsText(expectedTitle), "Заголовок не содержит ожидаемый текст: " + expectedTitle);


    }
}

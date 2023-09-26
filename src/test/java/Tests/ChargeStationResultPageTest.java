package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.ChargeStationResultPage;
import page_objects.HomePage;
import page_objects.SearchResultChargePage;
import page_objects.SearchResultPage;



public class ChargeStationResultPageTest extends BaseTest {

    @Test
    public void titleIsCorrect() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnEnergyButton();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.chargingStationsClick();

        ChargeStationResultPage chargeStationResultPage = new ChargeStationResultPage(getWebDriver());
        chargeStationResultPage.clickOnComparePricesButton(2);

        SearchResultChargePage searchResultChargePage = new SearchResultChargePage(getWebDriver());

        String expectedTitle = "Зарядна станція";
        searchResultChargePage.isTitleContainsText(expectedTitle);

        Assert.assertTrue(searchResultChargePage.isTitleContainsText(expectedTitle), "Заголовок не содержит ожидаемый текст: " + expectedTitle);
    }
}

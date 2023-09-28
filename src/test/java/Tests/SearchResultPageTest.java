package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.*;

public class SearchResultPageTest extends BaseTest{

    @Test
    public void comparePricesAndCheckTitle() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnEnergyButton();

        EnergySupplyPage energySupplyPage = new EnergySupplyPage(getWebDriver());
        energySupplyPage.chargingStationsClick();

        ChargeStationResultPage chargeStationResultPage = new ChargeStationResultPage(getWebDriver());
        Assert.assertTrue(chargeStationResultPage.isChargingStationTitleDisplayed(), "Элемент не найден");
    }

    @Test
    public void AddToFavoriteTest() {
        String wordToSearch = "Samsung";
        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProductWithEnterKey(wordToSearch);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnTelephoneButton(1);

        SamsungTelephonePage samsungTelephonePage = new SamsungTelephonePage(getWebDriver());
        samsungTelephonePage.personalListButtonClick();
        samsungTelephonePage.clickOnButtonWant();
        samsungTelephonePage.closeWantPopUpClick();
        samsungTelephonePage.clickOnTheWantButton(2);
        samsungTelephonePage.checkThatTheItemHasBeenAddedToWantButton();

        FavoriteProductsPage favoriteProductsPage = new FavoriteProductsPage(getWebDriver());
        Assert.assertTrue(favoriteProductsPage.isProductDisplayed(), "Элемент не найден");

    }
}

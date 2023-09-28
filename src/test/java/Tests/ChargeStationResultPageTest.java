package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.*;


public class ChargeStationResultPageTest extends BaseTest {

    @Test
    public void titleIsCorrect() {

        String expectedTitle = "Зарядна станція";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnEnergyButton();

        EnergySupplyPage energySupplyPage = new EnergySupplyPage(getWebDriver());
        energySupplyPage.chargingStationsClick();

        ChargeStationResultPage chargeStationResultPage = new ChargeStationResultPage(getWebDriver());
        chargeStationResultPage.clickOnComparePricesButton(2);

        ProductDetailsChargePage productDetailsChargePage = new ProductDetailsChargePage(getWebDriver());

        productDetailsChargePage.isTitleContainsText(expectedTitle);

        Assert.assertTrue(productDetailsChargePage.isTitleContainsText(expectedTitle), "Заголовок не содержит ожидаемый текст: " + expectedTitle);
    }
}

package ProjectTests;

import ProjectPages.BasketPage;
import ProjectPages.HomePage;
import ProjectPages.PrivateOfficePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheOperationOfThePersonalUserAccountTest16 extends BaseTests{

    @Test
    public void checkingTheOperationOfThePersonalUserAccountTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButton();
        homePage.enterPasswordButton();
        homePage.inputInPersonalAccountClick();
        homePage.clickOnPrivateOfficeButton();

        PrivateOfficePage privateOfficePage = new PrivateOfficePage(getWebDriver());
        Assert.assertTrue(privateOfficePage.isMyOrdersDisplayed(), "isn't displayed");
        privateOfficePage.clickOnFavoritesButton();
        Assert.assertTrue(privateOfficePage.isTitleInFavoritesButtonDisplayed(), "isn't displayed");
        privateOfficePage.clickOnMySettingsButton();
        Assert.assertTrue(privateOfficePage.isTitleInMySettingsButtonDisplayed(), "isn't displayed");

    }
}

package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.PrivateOfficePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheOperationOfThePersonalUserAccountTest extends BaseTests{
    @Test
    public void checkingTheOperationOfThePersonalUserAccountTest() {
        String emailInput = "bespalko140300@gmail.com";
        String passwordInput = "password";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButton(emailInput);
        homePage.enterPasswordButton(passwordInput);
        homePage.inputInPersonalAccountClick();
        homePage.clickOnPrivateOfficeButton();

        PrivateOfficePage privateOfficePage = new PrivateOfficePage(getWebDriver());
        Assert.assertTrue(privateOfficePage.isMyOrdersDisplayed(), "My Orders section isn't displayed");
        privateOfficePage.clickOnFavoritesButton();
        Assert.assertTrue(privateOfficePage.isTitleInFavoritesButtonDisplayed(), "Title in Favorites button isn't displayed");
        privateOfficePage.clickOnMySettingsButton();
        Assert.assertTrue(privateOfficePage.isTitleInMySettingsButtonDisplayed(), "Title in My Settings button isn't displayed");
    }
}

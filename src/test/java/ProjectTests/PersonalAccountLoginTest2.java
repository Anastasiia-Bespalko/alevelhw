package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalAccountLoginTest2 extends BaseTests{

    @Test
    public void loginPersonalAccount() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButton();
        homePage.enterPasswordButton();
        homePage.inputInPersonalAccountClick();

        Assert.assertTrue(homePage.isMassageOfInputDisplayed(), "massage is not found");

    }
}

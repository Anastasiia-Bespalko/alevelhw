package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalAccountLoginTest extends BaseTests{
    @Test
    public void loginPersonalAccount() {
        String emailInput = "bespalko140300@gmail.com";
        String passwordInput = "password";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButton(emailInput);
        homePage.enterPasswordButton(passwordInput);
        homePage.inputInPersonalAccountClick();

        Assert.assertTrue(homePage.isMassageOfInputDisplayed(), "massage is not found");
    }
}

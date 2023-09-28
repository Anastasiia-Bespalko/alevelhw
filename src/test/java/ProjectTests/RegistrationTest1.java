package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest1 extends BaseTests{
    @Test
    public void registrationOnSite() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnRegistrationButtonPopUp();
        homePage.nameInput();
        homePage.lastNameInput();
        homePage.phoneNumberInput();
        homePage.emailInput();
        homePage.passwordInput();
        homePage.clickOnRegistration();

        Assert.assertTrue(homePage.isErrorElementDisplayed(), "error is not found");

    }
}

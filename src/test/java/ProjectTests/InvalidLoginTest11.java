package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest11 extends BaseTests{

    @Test
    public void invalidLoginTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButtonForNegativeTest();
        homePage.enterPasswordButtonForNegativeTest();
        homePage.inputInPersonalAccountClick();

        Assert.assertTrue(homePage.isErrorMassageDisplayed(), "error massage isn't displayed");
    }

}

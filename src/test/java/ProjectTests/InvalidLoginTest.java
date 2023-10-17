package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTests{
    @Test
    public void invalidLoginTest() {
        String email = "karinamarina@gmail.com";
        int password = 123456;

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButtonForNegativeTest(email);
        homePage.enterPasswordButtonForNegativeTest(password);
        homePage.inputInPersonalAccountClick();

        Assert.assertTrue(homePage.isErrorMassageDisplayed(), "error massage isn't displayed");
    }

}

package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.PasswordRecoveryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheOperationOfTheCaptchaTest19 extends BaseTests{

    @Test
    public void checkingTheOperationOfTheCaptchaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButton();
        homePage.clickOnRemindButton();

        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(getWebDriver());
        passwordRecoveryPage.enterEmailInForm();
        passwordRecoveryPage.enterCaptcha(1);
        Assert.assertTrue(passwordRecoveryPage.isErrorMassageDisplayed());
    }
}

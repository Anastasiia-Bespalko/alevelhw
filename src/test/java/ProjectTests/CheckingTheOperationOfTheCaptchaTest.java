package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.PasswordRecoveryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheOperationOfTheCaptchaTest extends BaseTests{
    @Test
    public void checkingTheOperationOfTheCaptchaTest() {
        String emailInput = "bespalko140300@gmail.com";
        String enteringAnEmail = "bespalko14032000@gmail.com";
        String captcha = "1234";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnInputButton();
        homePage.clickOnLoginButton();
        homePage.enterEmailOrNumberButton(emailInput);
        homePage.clickOnRemindButton();

        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(getWebDriver());
        passwordRecoveryPage.enterEmailInForm(enteringAnEmail);
        passwordRecoveryPage.enterCaptcha(1, captcha);
        Assert.assertTrue(passwordRecoveryPage.isErrorMassageDisplayed());
    }
}

package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.LoginPage;

public class LoginPageTest extends BaseTest{

    @Test
    public void negativeVerificationOfLoginToThePersonalAccount() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnLoginButton();

        LoginPage loginPage = new LoginPage(getWebDriver());

        Assert.assertTrue(loginPage.isElementEmailDisplayed(), "Элемент email не найден");
        Assert.assertTrue(loginPage.isElementPasswordDisplayed(), "Элемент password не найден");
    }
}

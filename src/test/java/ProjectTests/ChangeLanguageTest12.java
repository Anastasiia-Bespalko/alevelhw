package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLanguageTest12 extends BaseTests{

    @Test
    public void changeLanguageTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.changeLanguage();

        Assert.assertTrue(homePage.isLanguageChange(), "language isn't change");

    }

}

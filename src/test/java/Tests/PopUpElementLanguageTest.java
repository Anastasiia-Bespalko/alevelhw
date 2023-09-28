package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;


public class PopUpElementLanguageTest extends BaseTest {

    @Test
    public void popUpElementLanguageTest() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.popUpLanguageButtonClick();
        Assert.assertTrue(homePage.isPopUpDisplayed());
    }
}


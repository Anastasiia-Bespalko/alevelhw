package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class HomePageTests extends BaseTest{

    @Test
    public void verifyCatalogPopUpAppears() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.ClickOnCatalogButton();
        homePage.isCatalogPopUpDisplayed();
        Assert.assertTrue(homePage.isCatalogPopUpDisplayed());
    }
}

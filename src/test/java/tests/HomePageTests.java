package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class HomePageTests extends BaseTest{

    @Test(description = "Catalog pop up arrears after clicking on catalog button")
    @Description("Test description: verify that catalog pop up appears after clicking on catalog button")
    public void verifyCatalogPopUpAppears() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.ClickOnCatalogButton();
        homePage.isCatalogPopUpDisplayed();
        Assert.assertTrue(homePage.isCatalogPopUpDisplayed());
    }
}

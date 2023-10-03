package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationThatTheManufacturersInstructionsArePresentWithTheProductTest18 extends BaseTests{

    @Test
    public void verificationThatTheManufacturersInstructionsArePresentWithTheProductTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        productDetailsPage.clickOnInstructionButton();

        Assert.assertTrue(productDetailsPage.checkThatWarehouseDisplayed(2), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheDosageFormDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatThePharmacotherapyGroupDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatThePharmacologicPropertiesDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheIndicationsDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheContraindicationsDisplayed(2), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheInteractionWithOtherMedicinalProductsAndOtherTypesOfInteractionsDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheFeaturesOfApplicationDisplayed(2), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheUseDuringPregnancyOrBreastfeedingDisplayed(2), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheMethodOfAdministrationAndDosageDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheOverdoseDisplayed(2), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheAdverseReactionsDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheExpirationDateDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheStorageConditionsDisplayed(2), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatThePackagingDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheCategoryOfReleaseDisplayed(), "isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheManufacturerDisplayed(), "isn't displayed");
    }
}

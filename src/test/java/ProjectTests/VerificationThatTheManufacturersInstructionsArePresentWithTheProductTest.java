package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationThatTheManufacturersInstructionsArePresentWithTheProductTest extends BaseTests{
    @Test
    public void verificationThatTheManufacturersInstructionsArePresentWithTheProductTest() {
        String searchWord = "Спазмалгон";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct(searchWord);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        productDetailsPage.clickOnInstructionButton();

        Assert.assertTrue(productDetailsPage.checkThatWarehouseDisplayed(2), "Warehouse information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheDosageFormDisplayed(), "Dosage form isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatThePharmacotherapyGroupDisplayed(), "Pharmacotherapy group isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatThePharmacologicPropertiesDisplayed(), "Pharmacologic properties aren't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheIndicationsDisplayed(), "Indications aren't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheContraindicationsDisplayed(2), "Contraindications information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheInteractionWithOtherMedicinalProductsAndOtherTypesOfInteractionsDisplayed(), "Interaction with other medicinal products information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheFeaturesOfApplicationDisplayed(2), "Features of application information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheUseDuringPregnancyOrBreastfeedingDisplayed(2), "Use during pregnancy or breastfeeding information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheMethodOfAdministrationAndDosageDisplayed(), "Method of administration and dosage isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheOverdoseDisplayed(2), "Overdose information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheAdverseReactionsDisplayed(), "Adverse reactions aren't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheExpirationDateDisplayed(), "Expiration date isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheStorageConditionsDisplayed(2), "Storage conditions information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatThePackagingDisplayed(), "Packaging information isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheCategoryOfReleaseDisplayed(), "Category of release isn't displayed");
        Assert.assertTrue(productDetailsPage.checkThatTheManufacturerDisplayed(), "Manufacturer information isn't displayed");
    }
}

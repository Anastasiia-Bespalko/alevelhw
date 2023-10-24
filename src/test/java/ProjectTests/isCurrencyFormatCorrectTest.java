package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.ProductListingPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class isCurrencyFormatCorrectTest extends BaseTests{
    @Test
    public void verifyCurrencyFormat() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnCatalogMenuCategory(3);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnTheBabyDiapersAndDiapersButton();

        ProductListingPage productListingPage = new ProductListingPage(getWebDriver());
        productListingPage.clickOnTheDisposableDiapers();

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        Assert.assertTrue(productDetailsPage.isPriceHaveUkrainianCurrency(1), "price don't have Ukrainian currency");
    }
}

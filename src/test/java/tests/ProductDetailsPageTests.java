package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.ProductDetailsPage;
import page_objects.SearchResultPage;

public class ProductDetailsPageTests extends BaseTest{

    @Test
    public void verifyThatNavigatedToTheCorrectProductDetailsPage() {
        int productIndexToGetTitle = 1;
        HomePage homePage = new HomePage(getWebDriver());

        homePage.searchProductByWord("IPhone");

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());

        String firstProductTitleFromSRP = searchResultPage.getProductTitle(productIndexToGetTitle);

        searchResultPage.clickOnComparePricesButton(productIndexToGetTitle);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());

        productDetailsPage.getProductDetailsPageTitle();

        String productDetailsPageTitle = productDetailsPage.getProductDetailsPageTitle();

        Assert.assertTrue(productDetailsPageTitle.contains(firstProductTitleFromSRP));

    }
}

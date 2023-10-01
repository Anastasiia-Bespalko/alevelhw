package ProjectTests;

import ProjectPages.CheckoutPage;
import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest7 extends BaseTests{

    @Test
    public void addToCartTest() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);
        searchResultPage.clickOnCardButton();
        searchResultPage.clickOnPlaceAnOrder();

        CheckoutPage checkoutPage = new CheckoutPage(getWebDriver());
        Assert.assertTrue(checkoutPage.isProductInCartDisplayed(), "product isn't displayed");
    }
}

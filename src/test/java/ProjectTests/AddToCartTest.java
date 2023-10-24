package ProjectTests;

import ProjectPages.CheckoutPage;
import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTests{
    @Test
    public void addToCartTest() {
        String searchWord = "Спазмалгон";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct(searchWord);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);
        searchResultPage.clickOnCardButton();
        searchResultPage.clickOnPlaceAnOrder();

        CheckoutPage checkoutPage = new CheckoutPage(getWebDriver());
        Assert.assertTrue(checkoutPage.isProductInCartDisplayed(), "product isn't displayed");
    }
}

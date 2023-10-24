package ProjectTests;

import ProjectPages.BasketPage;
import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingWhetherItIsPossibleToRemoveAnItemFromTheCartTest extends BaseTests{

    @Test
    public void checkingWhetherItIsPossibleToRemoveAnItemFromTheCartTest() {
        String searchWord = "Анальгін";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct(searchWord);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnAnalginProduct();

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        productDetailsPage.clickOnCardButton();
        productDetailsPage.closePopUpButtonInAddToCard();
        productDetailsPage.clickOnBasketButton();

        BasketPage basketPage = new BasketPage(getWebDriver());
        basketPage.deleteProductInBasket();

        Assert.assertTrue(basketPage.checkThatTheTitleIsUnless(), "Title isn't displayed");
    }
}

package ProjectTests;

import ProjectPages.BasketPage;
import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAvailableDeliveryMethodsForYourOrderTest15 extends BaseTests{
    @Test
    public void checkAvailableDeliveryMethodsForYourOrderTest () {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);
        searchResultPage.clickOnCardButton();
        searchResultPage.clickOnPlaceAnOrder();

        BasketPage basketPage = new BasketPage(getWebDriver());
        basketPage.clickOnButtonYes();
        Assert.assertTrue(basketPage.isSelfDeliveryButtonDisplayed(1), "self delivery isn't displayed");
        Assert.assertTrue(basketPage.isCourierDeliveryButtonDisplayed(2), "courier delivery isn't displayed");
        Assert.assertTrue(basketPage.isUkrPostDeliveryButtonDisplayed(3), "Ukr Post Delivery isn't displayed");
    }
}

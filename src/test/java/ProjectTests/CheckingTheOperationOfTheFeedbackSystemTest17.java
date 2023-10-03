package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheOperationOfTheFeedbackSystemTest17 extends BaseTests{

    @Test
    public void checkingTheOperationOfTheFeedbackSystemTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        productDetailsPage.deleteCookies();
        productDetailsPage.clickOnFeedbackButton();
        Assert.assertTrue(productDetailsPage.isFeedbacksDisplayed(), "feedbacks isn't displayed");
    }
}

package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheOperationOfTheFeedbackSystemTest extends BaseTests{
    @Test
    public void checkingTheOperationOfTheFeedbackSystemTest() {
        String searchWord = "Спазмалгон";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct(searchWord);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickOnSpazmalgonProduct(1);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
        productDetailsPage.deleteCookies();
        productDetailsPage.clickOnFeedbackButton();
        Assert.assertTrue(productDetailsPage.isFeedbacksDisplayed(), "feedbacks isn't displayed");
    }
}

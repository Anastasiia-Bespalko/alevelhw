package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductListingPage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheSearchFunctionalityOfTheWebsiteTest extends BaseTests{
    @Test
    public void checkingTheSearchFunctionalityOfTheWebsite() {
        String Keyword = "Знеболюючі";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.keywordSearchForMedicines(Keyword);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickToTheKeywordSearchMatchButton();

        ProductListingPage productListingPage = new ProductListingPage(getWebDriver());

        Assert.assertTrue(productListingPage.isTitleOfKeywordSearchCorrect(), "title isn't correct");
    }
}

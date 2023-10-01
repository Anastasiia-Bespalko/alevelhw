package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterProductsTest10 extends BaseTests{

    @Test
    public void filterProductsTest() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProductForFilters();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.searchProductWithFilter(1);
        Assert.assertTrue(searchResultPage.isFilterOn(), "filter is not connected");

    }
}

package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterProductsTest extends BaseTests{
    @Test
    public void filterProductsTest() {
        String Word = "Вітаміни та бади";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProductForFilters(Word);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.searchProductWithFilter(1);
        Assert.assertTrue(searchResultPage.isFilterOn(), "filter is not connected");
    }
}

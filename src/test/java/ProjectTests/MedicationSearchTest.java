package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MedicationSearchTest extends BaseTests{
    @Test
    public void medicationSearch() {
        String searchWord = "Спазмалгон";

        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct(searchWord);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        Assert.assertTrue(searchResultPage.isSearchResultCorrect(), "Title is not correct");

    }
}

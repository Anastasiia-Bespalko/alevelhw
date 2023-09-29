package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MedicationSearchTest3 extends BaseTests{

    @Test

    public void medicationSearch() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProduct();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        Assert.assertTrue(searchResultPage.isSearchResultCorrect(), "Title is not correct");

    }
}

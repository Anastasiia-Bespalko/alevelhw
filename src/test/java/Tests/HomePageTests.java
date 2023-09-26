package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchResultPage;

public class HomePageTests extends BaseTest{

    @Test
    public void verifySearchResultsForSmartphone() {
        String wordToSearch = "смартфон";
        HomePage homePage = new HomePage(getWebDriver());
        homePage.searchProductByWord(wordToSearch);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.searchResultProductByWord();
        Assert.assertTrue(searchResultPage.getSearchResultsElement().isDisplayed());

    }
}

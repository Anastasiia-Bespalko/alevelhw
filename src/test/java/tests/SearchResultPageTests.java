package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchResultPage;

public class SearchResultPageTests extends BaseTest{
    @Test
    public void verifyThatSearchResultPageTitleIsCorrect() {
        String wordToSearch = "game";

        HomePage homePage = new HomePage(getWebDriver());

        homePage.searchProductByWord(wordToSearch);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());

        String actualSearchResultPageTitle = searchResultPage.getSearchResultPageTitle();

        Assert.assertTrue(actualSearchResultPageTitle.contains(wordToSearch));

    }
}

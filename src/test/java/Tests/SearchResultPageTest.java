package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchResultPage;

public class SearchResultPageTest extends BaseTest{

    @Test
    public void comparePricesAndCheckTitle() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnEnergyButton();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.chargingStationsClick();
    }

    @Test
    public void verifyThatSearchResultPageTitleIsCorrect() {
        String wordToSearch = "Samsung";
        HomePage homePage = new HomePage(getWebDriver());

        homePage.searchProductWithEnterKey(wordToSearch);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        String actualSearchResultPageTitle = searchResultPage.getSearchResultPageTitle();

        Assert.assertTrue(actualSearchResultPageTitle.contains(wordToSearch));
    }
}

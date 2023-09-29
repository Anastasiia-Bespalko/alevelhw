package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckingTheSearchFunctionalityOfTheWebsiteTest5 extends BaseTests{

    @Test
    public void checkingTheSearchFunctionalityOfTheWebsite() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.keywordSearchForMedicines();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        searchResultPage.clickToTheKeywordSearchMatchButton();

        Assert.assertTrue(searchResultPage.isTitleOfKeywordSearchCorrect(), "title isn't correct");
    }
}

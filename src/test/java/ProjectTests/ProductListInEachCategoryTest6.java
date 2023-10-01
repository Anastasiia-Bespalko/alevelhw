package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductListInEachCategoryTest6 extends BaseTests{

    @Test
    public void productListInEachCategoryTest() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnCatalogMenuCategory(1);

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        Assert.assertTrue(searchResultPage.isTitleMenuCategoryDisplayed(), "title isn't displayed");
    }
}

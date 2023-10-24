package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PromotionDisplayTest extends BaseTests{
    @Test
    public void promotionDisplayTest() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.discountsButtonClick();

        SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
        Assert.assertTrue(searchResultPage.isDiscountsDisplayed(), "Discounts isn't found");
    }
}

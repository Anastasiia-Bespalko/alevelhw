package ProjectTests;

import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductCatalogTest extends BaseTests{
    @Test
    public void isProductCatalogDisplayed() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.hoverOnProductCatalog();

        Assert.assertTrue(homePage.isMedicinalProductsPopUpDisplayed(), "Pop up isn't displayed");
    }
}

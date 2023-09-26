package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.HomePage;


public class ComparisonPopUpElementPageTest extends BaseTest {

    @Test
    public void ComparisonPopUpElementPageTest() {
        HomePage homePage = new HomePage(getWebDriver());
        homePage.popUpComparisonButtonClick();
        Assert.assertTrue(homePage.isPopUpDisplayed());
    }
}


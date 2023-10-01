package ProjectTests;

import ProjectPages.ContactsPage;
import ProjectPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPageTest14 extends BaseTests{

    @Test
    public void contactPageTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.clickOnContactsButton();

        ContactsPage contactsPage = new ContactsPage(getWebDriver());
        Assert.assertTrue(contactsPage.isRoundTheClockHotlineNumberDisplayed(), "number isn't found");

        Assert.assertTrue(contactsPage.isSupportServiceEmailDisplayed(), "email isn't found");

        Assert.assertTrue(contactsPage.isServiceQualityControlServiceNumberDisplayed(), "number isn't found");
    }
}

package ProjectTests;

import ProjectPages.HomePage;
import ProjectPages.ProductDetailsPage;
import ProjectPages.ProductListingPage;
import ProjectPages.SearchResultPage;
import org.testng.annotations.Test;


public class AddToFavoriteTest extends BaseTests{
    @Test
     public void addToFavoriteTest() {
       String emailInput = "bespalko140300@gmail.com";
       String passwordInput = "password";

       HomePage homePage = new HomePage(getWebDriver());
       homePage.clickOnInputButton();
       homePage.clickOnLoginButton();
       homePage.enterEmailOrNumberButton(emailInput);
       homePage.enterPasswordButton(passwordInput);
       homePage.inputInPersonalAccountClick();
       homePage.clickOnCatalogMenuCategory(5);

       SearchResultPage searchResultPage = new SearchResultPage(getWebDriver());
       searchResultPage.clickOnMedicalEquipmentButton();

       ProductListingPage productListingPage = new ProductListingPage(getWebDriver());
       productListingPage.clickOnTheProduct(1);

       ProductDetailsPage productDetailsPage = new ProductDetailsPage(getWebDriver());
       productDetailsPage.clickOnFavoritesButtonAndAdd(4);
    }
}
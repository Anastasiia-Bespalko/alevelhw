package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage{
    private final By PRICE = By.xpath("//div[@class='price-new']");
    private final By FAVOURITES_BUTTON = By.xpath("//a[@class='btn-icon-add-fav']");
    private final By FAVORITE_PRODUCT_ADD_BUTTON = By.xpath("//input[@class='btn btn-accent btn_mw-180']");
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPriceHaveUkrainianCurrency(int productIndex) {
        waitUntilElementVisibility(PRICE);
        WebElement priceElement = getDriver().findElements(PRICE).get(productIndex - 1);
        return priceElement.getText().contains("грн.");
    }

    public void clickOnFavoritesButtonAndAdd(int productIndex) {
        getDriver().findElement(FAVOURITES_BUTTON).click();
        waitUntilElementVisibility(FAVORITE_PRODUCT_ADD_BUTTON);
        getDriver().findElements(FAVORITE_PRODUCT_ADD_BUTTON).get(productIndex - 1).click();
    }


}

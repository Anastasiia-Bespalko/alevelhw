package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoriteProductsPage extends BasePage{

    private final By PRODUCT_IS_DISPLAYED = By.cssSelector("label[title='Смартфон Samsung Galaxy A54 5G 8/256GB  Awesome Graphite (SM-A546EZKD)']");

    public FavoriteProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductDisplayed() {
        waitUntilElementVisibility(PRODUCT_IS_DISPLAYED);
        return getDriver().findElement(PRODUCT_IS_DISPLAYED).isDisplayed();
    }
}

package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    private final By PRODUCT_IN_CART = By.xpath("//div[@class='cart-list__item']");
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCartDisplayed() {
        waitUntilElementVisibility(PRODUCT_IN_CART);
        return getDriver().findElement(PRODUCT_IN_CART).isDisplayed();
    }
}

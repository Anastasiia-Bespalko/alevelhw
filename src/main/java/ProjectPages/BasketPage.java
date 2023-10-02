package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{

    private final By SELECT_DELIVERY_METHOD_BUTTON = By.xpath("//a[@class='btn btn-outline-primary btn-m']");
    private final By BUTTON_YES = By.xpath("//a[@class='btn btn-accent btn-xl btn_mw-120']");
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonYes() {
        waitUntilElementVisibility(BUTTON_YES);
        getDriver().findElement(BUTTON_YES).click();
    }

    public boolean isSelfDeliveryButtonDisplayed(int productIndex) {
        waitUntilElementVisibility(SELECT_DELIVERY_METHOD_BUTTON);
        return getDriver().findElements(SELECT_DELIVERY_METHOD_BUTTON).get(productIndex - 1).isDisplayed();
    }

    public boolean isCourierDeliveryButtonDisplayed(int productIndex) {
        return getDriver().findElements(SELECT_DELIVERY_METHOD_BUTTON).get(productIndex = 1).isDisplayed();
    }

    public boolean isUkrPostDeliveryButtonDisplayed(int productIndex) {
        return getDriver().findElements(SELECT_DELIVERY_METHOD_BUTTON).get(productIndex - 1).isDisplayed();
    }
}

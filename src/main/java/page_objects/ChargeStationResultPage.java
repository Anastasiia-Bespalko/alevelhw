package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChargeStationResultPage extends BasePage{
    private final By COMPARE_PRICES_BUTTON = By.xpath("//a[@class='btn btn--orange']");
    public ChargeStationResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnComparePricesButton(int productIndex) {
        waitUntilElementVisibility(COMPARE_PRICES_BUTTON);
        getDriver().findElements(COMPARE_PRICES_BUTTON).get(productIndex - 1).click();
    }
}

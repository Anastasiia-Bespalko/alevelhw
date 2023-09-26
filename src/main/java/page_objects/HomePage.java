package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private final By SEARCH_FIELD = By.xpath("//input[@type='text']");
    private final By ENERGY_SUPPLY_BUTTON = By.xpath("//section[@class='index-page-section categories-section'] //i[@class='icon-section--categories icon-section--categories--power']");
    private final By POP_UP_COMPARISON_BUTTON = By.xpath("//div[@class='popover-head']");
    private final By POP_UP_COMPARISON = By.xpath("//div[@class='popover-body popover-body--right popover-body--responsive-xl']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProductByWord(String searchWord) {
        getDriver().findElement(SEARCH_FIELD).sendKeys(searchWord, Keys.ENTER);
    }
    public void clickOnEnergyButton() {
        getDriver().findElement(ENERGY_SUPPLY_BUTTON).click();
    }

    public void popUpComparisonButtonClick() {
        getDriver().findElement(POP_UP_COMPARISON_BUTTON).click();
    }

    public boolean isPopUpDisplayed() {
        waitUntilElementVisibility(POP_UP_COMPARISON);
        return getDriver().findElement(POP_UP_COMPARISON).isDisplayed();
    }

    public void searchProductWithEnterKey(String wordToSearch) {
        getDriver().findElement(SEARCH_FIELD).sendKeys(wordToSearch, Keys.ENTER);
    }
}

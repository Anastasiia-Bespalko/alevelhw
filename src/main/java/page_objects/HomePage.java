package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private final By SEARCH_FIELD = By.xpath("//input[@type='text']");
    private final By ENERGY_SUPPLY_BUTTON = By.xpath("//section[@class='index-page-section categories-section'] //i[@class='icon-section--categories icon-section--categories--power']");
    private final By POP_UP_LANGUAGE_BUTTON = By.xpath("//div[@class='lang-button flex middle-xs center-xs header__lang-icon']");
    private final By POP_UP_LANGUAGE = By.xpath("//div[@class='v-popper__inner']");
    private final By LOGIN_BUTTON = By.xpath("//div[@class='user-button__image flex middle-xs center-xs']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnEnergyButton() {
        getDriver().findElement(ENERGY_SUPPLY_BUTTON).click();
    }

    public void popUpLanguageButtonClick() {
        getDriver().findElement(POP_UP_LANGUAGE_BUTTON).click();
    }

    public boolean isPopUpDisplayed() {
        waitUntilElementVisibility(POP_UP_LANGUAGE);
        return getDriver().findElement(POP_UP_LANGUAGE).isDisplayed();
    }

    public void searchProductWithEnterKey(String wordToSearch) {
        getDriver().findElement(SEARCH_FIELD).sendKeys(wordToSearch, Keys.ENTER);
    }

    public void clickOnLoginButton() {
        getDriver().findElement(LOGIN_BUTTON).click();
    }
}

package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivateOfficePage extends BasePage{
    private final By MY_ORDERS = By.xpath("//span[text()='Мої замовлення']");
    private final By FAVORITES_BUTTON = By.xpath("//ul[@class='m-aside__body'] //a[@href='https://apteka911.ua/ua/shop/labels/wish']");
    private final By TITLE_IN_FAVORITES_BUTTON = By.xpath("//h1[text()='Всі списки']");
    private final By MY_SETTINGS_BUTTON = By.xpath("//ul[@class='m-aside__body'] //a[@href='https://apteka911.ua/ua/account/profile']");
    private final By TITLE_IN_MY_SETTINGS = By.xpath("//h1[text()='Профіль']");
    public PrivateOfficePage(WebDriver driver) {
        super(driver);
    }

    public boolean isMyOrdersDisplayed() {
        waitUntilElementVisibility(MY_ORDERS);
        return getDriver().findElement(MY_ORDERS).isDisplayed();
    }

    public void clickOnFavoritesButton() {
        getDriver().findElement(FAVORITES_BUTTON).click();
    }

    public boolean isTitleInFavoritesButtonDisplayed() {
        waitUntilElementVisibility(TITLE_IN_FAVORITES_BUTTON);
        return getDriver().findElement(TITLE_IN_FAVORITES_BUTTON).isDisplayed();
    }

    public void clickOnMySettingsButton() {
        getDriver().findElement(MY_SETTINGS_BUTTON).click();
    }

    public boolean isTitleInMySettingsButtonDisplayed() {
        waitUntilElementVisibility(TITLE_IN_MY_SETTINGS);
        return getDriver().findElement(TITLE_IN_MY_SETTINGS).isDisplayed();
    }
}

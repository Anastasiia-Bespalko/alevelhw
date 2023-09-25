package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    private final By CATALOG_BUTTON = By.xpath("//div[@class='button-menu-main ']");
    private final By CATALOG_POP_UP = By.xpath("//nav[@class='menu-main active']");
    private final By SEARCH_FIELD = By.xpath("//input[@type='text']");



    public HomePage(WebDriver driverFromTest) {
        super(driverFromTest);
    }

    public void ClickOnCatalogButton() {
        getDriver().findElement(CATALOG_BUTTON).click();
    }

    public boolean isCatalogPopUpDisplayed() {
        waitUntilElementVisibility(CATALOG_POP_UP);
        return getDriver().findElement(CATALOG_POP_UP).isDisplayed();
    }

    public void searchProductByWord(String searchWord) {
        getDriver().findElement(SEARCH_FIELD).sendKeys(searchWord, Keys.ENTER);
    }



}

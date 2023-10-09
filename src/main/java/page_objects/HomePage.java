package page_objects;

import io.qameta.allure.Step;
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

     @Step("Click on catalog button")
     public void ClickOnCatalogButton() {
        getDriver().findElement(CATALOG_BUTTON).click();
    }

    @Step("Verify is catalog pop up displayed")
    public boolean isCatalogPopUpDisplayed() {
        waitUntilElementVisibility(CATALOG_POP_UP);
        return getDriver().findElement(CATALOG_POP_UP).isDisplayed();
    }

    @Step("search product by word")
    public void searchProductByWord(String searchWord) {
        getDriver().findElement(SEARCH_FIELD).sendKeys(searchWord, Keys.ENTER);
    }



}

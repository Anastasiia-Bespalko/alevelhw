package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListingPage extends BasePage{
    private final By SEARCH_RESULT_TITLE_OF_KEYWORD = By.xpath("//h1[text()='Знеболюючі препарати']");
    private final By DISPOSABLE_DIAPERS_BUTTON = By.xpath("//b[text()='Одноразові підгузки']");
    private final By PRODUCT_IN_MEDICAL_EQUIPMENT = By.xpath("//a[@class='b-prod__thumb']");
    public ProductListingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleOfKeywordSearchCorrect() {
        waitUntilElementVisibility(SEARCH_RESULT_TITLE_OF_KEYWORD);
        return getDriver().findElement(SEARCH_RESULT_TITLE_OF_KEYWORD).isDisplayed();
    }

    public void clickOnTheDisposableDiapers() {
        waitUntilElementVisibility(DISPOSABLE_DIAPERS_BUTTON);
        getDriver().findElement(DISPOSABLE_DIAPERS_BUTTON).click();
    }

    public void clickOnTheProduct(int productIndex) {
        waitUntilElementVisibility(PRODUCT_IN_MEDICAL_EQUIPMENT);
        getDriver().findElements(PRODUCT_IN_MEDICAL_EQUIPMENT).get(productIndex - 1).click();
    }
}

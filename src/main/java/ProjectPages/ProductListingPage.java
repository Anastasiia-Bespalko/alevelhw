package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListingPage extends BasePage{
    private final By SEARCH_RESULT_TITLE_OF_KEYWORD = By.xpath("//h1[text()='Знеболюючі препарати']");
    public ProductListingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleOfKeywordSearchCorrect() {
        waitUntilElementVisibility(SEARCH_RESULT_TITLE_OF_KEYWORD);
        return getDriver().findElement(SEARCH_RESULT_TITLE_OF_KEYWORD).isDisplayed();
    }
}

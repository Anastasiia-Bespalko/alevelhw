package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{
    private final By SEARCH_RESULT_TITLE = By.xpath("//h1[text()='Спазмалгон']");
    private final By KEYWORD_SEARCH_MATCH_BUTTON = By.xpath("//span[@class='search-indexes__name']");
    private final By SEARCH_RESULT_TITLE_OF_KEYWORD = By.xpath("//h1[text()='Знеболюючі препарати']");
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchResultCorrect() {
        waitUntilElementVisibility(SEARCH_RESULT_TITLE);
        return getDriver().findElement(SEARCH_RESULT_TITLE).isDisplayed();
    }

    public void clickToTheKeywordSearchMatchButton() {
        waitUntilElementVisibility(KEYWORD_SEARCH_MATCH_BUTTON);
        getDriver().findElement(KEYWORD_SEARCH_MATCH_BUTTON).click();
    }

    public boolean isTitleOfKeywordSearchCorrect() {
        waitUntilElementVisibility(SEARCH_RESULT_TITLE_OF_KEYWORD);
        return getDriver().findElement(SEARCH_RESULT_TITLE_OF_KEYWORD).isDisplayed();
    }
}

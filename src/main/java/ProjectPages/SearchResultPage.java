package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{
    private final By SEARCH_RESULT_TITLE = By.xpath("//h1[text()='Спазмалгон']");


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchResultCorrect() {
        waitUntilElementVisibility(SEARCH_RESULT_TITLE);
        return getDriver().findElement(SEARCH_RESULT_TITLE).isDisplayed();
    }
}

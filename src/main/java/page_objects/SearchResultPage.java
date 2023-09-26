package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends BasePage{

    private final By SEARCH_RESULTS = By.xpath("//div[@class='search__title']");
    private final By CHARGING_STATION_BUTTON = By.xpath("//div[@class='navigation-block'] //div[@class='section-navigation__item content']");
    private final By SEARCH_RESULT_PAGE_TITLE = By.xpath("//div[@class='search__title']");
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void searchResultProductByWord() {
        waitUntilElementVisibility(SEARCH_RESULTS);
        getDriver().findElement(SEARCH_RESULTS);
    }
    public WebElement getSearchResultsElement() {
        return getDriver().findElement(SEARCH_RESULTS);
    }

    public void chargingStationsClick() {
        waitUntilElementVisibility(CHARGING_STATION_BUTTON);
        getDriver().findElement(CHARGING_STATION_BUTTON).click();
    }

    public String getSearchResultPageTitle() {
        waitUntilElementVisibility(SEARCH_RESULT_PAGE_TITLE);
        return getDriver().findElement(SEARCH_RESULT_PAGE_TITLE).getText();
    }
}

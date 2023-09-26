package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultPage {
    private WebDriver driver;

    private final By SEARCH_RESULTS = By.xpath("//div[@class='search__title']");
    private final By CHARGING_STATION_BUTTON = By.xpath("//div[@class='navigation-block'] //div[@class='section-navigation__item content']");
    private final By SEARCH_RESULT_PAGE_TITLE = By.xpath("//div[@class='search__title']");
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchResultProductByWord() {
        waitUntilElementVisibility(SEARCH_RESULTS);
        driver.findElement(SEARCH_RESULTS);
    }
    public WebElement getSearchResultsElement() {
        return driver.findElement(SEARCH_RESULTS);
    }

    public void chargingStationsClick() {
        waitUntilElementVisibility(CHARGING_STATION_BUTTON);
        driver.findElement(CHARGING_STATION_BUTTON).click();
    }

    public String getSearchResultPageTitle() {
        return driver.findElement(SEARCH_RESULT_PAGE_TITLE).getText();
    }


    private void waitUntilElementVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }
}

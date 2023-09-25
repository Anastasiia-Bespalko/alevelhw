package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends BasePage{


    private final By SEARCH_RESULT_PAGE_TITLE = By.xpath("//div[@class='search__title']");
    private final By PRODUCT_TITLE = By.xpath("//a[@class='list-item__title text-md m_b-5']");
    private final By COMPARE_PRICES_BUTTON = By.xpath("//a[@class='btn btn--orange']");

    public SearchResultPage(WebDriver driverFromTest) {
        super(driverFromTest);
    }

    public String getSearchResultPageTitle() {
        waitUntilElementVisibility(SEARCH_RESULT_PAGE_TITLE);
        return getDriver().findElement(SEARCH_RESULT_PAGE_TITLE).getText();
    }

    public String getProductTitle(int productIndex) {
        waitUntilElementVisibility(SEARCH_RESULT_PAGE_TITLE);
        List<WebElement> productTitles = getDriver().findElements(PRODUCT_TITLE);
        return productTitles.get(productIndex - 1).getText();
    }

    public void clickOnComparePricesButton(int productIndex) {
        List<WebElement> comparePriceButton = getDriver().findElements(COMPARE_PRICES_BUTTON);
        comparePriceButton.get(productIndex - 1).click();
    }

}

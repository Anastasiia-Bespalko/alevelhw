package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class SearchResultPage extends BasePage{
    private final By SEARCH_RESULT_TITLE = By.xpath("//h1[text()='Спазмалгон']");
    private final By KEYWORD_SEARCH_MATCH_BUTTON = By.xpath("//span[@class='search-indexes__name']");
    private final By LICARSKI_ZASOBY_TITLE = By.xpath("//h1[text()='Лікарські засоби']");
    private final By SPAZMALGON_SEARCH_PRODUCT = By.xpath("//div[@class='wrp-colgroup__margins wrp-colgroup__margins-catalog mb35'] //div[@class='b-prod__tile-container']");
    private final By ADD_TO_CARD_BUTTON = By.xpath("//a[@class='btn btn-accent btn-xl']");
    private final By PLACE_AN_ORDER_BUTTON = By.xpath("//a[@class='btn btn-l fr btn-accent']");
    private final By BABY_DIAPERS_AND_DIAPERS_BUTTON = By.xpath("//b[text()='Дитячі підгузки та пелюшки']");
    private final By MEDICAL_EQUIPMENT_BUTTON = By.xpath("//b[text()='Медична техніка']");
    private final By PUT_A_FILTER_ON_A_PRODUCT_GROUP = By.xpath("//i[@class='fl icon-check']");
    private final By FILTER_VITAMINS_AND_SUPPLEMENTS = By.xpath("//a[text()='Вітаміни та БАДи']");
    private final By OFFER_WITH_DISCOUNTS = By.xpath("//div[@class='content__shadow']");

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

    public boolean isTitleMenuCategoryDisplayed() {
        return getDriver().findElement(LICARSKI_ZASOBY_TITLE).isDisplayed();
    }

    public void clickOnSpazmalgonProduct(int productIndex) {
        waitUntilElementVisibility(SPAZMALGON_SEARCH_PRODUCT);
        getDriver().findElements(SPAZMALGON_SEARCH_PRODUCT).get(productIndex - 1).click();
    }

    public void clickOnCardButton() {
        getDriver().findElement(ADD_TO_CARD_BUTTON).click();
    }

    public void clickOnPlaceAnOrder() {
        waitUntilElementVisibility(PLACE_AN_ORDER_BUTTON);
        getDriver().findElement(PLACE_AN_ORDER_BUTTON).click();
    }

    public void clickOnTheBabyDiapersAndDiapersButton() {
        waitUntilElementVisibility(BABY_DIAPERS_AND_DIAPERS_BUTTON);
        getDriver().findElement(BABY_DIAPERS_AND_DIAPERS_BUTTON).click();
    }

    public void clickOnMedicalEquipmentButton() {
        getDriver().findElement(MEDICAL_EQUIPMENT_BUTTON).click();
    }

    public void searchProductWithFilter(int productIndex) {
        waitUntilElementVisibility(PUT_A_FILTER_ON_A_PRODUCT_GROUP);
        getDriver().findElements(PUT_A_FILTER_ON_A_PRODUCT_GROUP).get(productIndex - 1).click();
    }

    public boolean isFilterOn() {
        waitUntilElementVisibility(FILTER_VITAMINS_AND_SUPPLEMENTS);
        return getDriver().findElement(FILTER_VITAMINS_AND_SUPPLEMENTS).isDisplayed();
    }

    public boolean isDiscountsDisplayed() {
        return getDriver().findElement(OFFER_WITH_DISCOUNTS).isDisplayed();
    }

}

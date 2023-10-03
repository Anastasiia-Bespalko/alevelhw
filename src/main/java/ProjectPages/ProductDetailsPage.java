package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage{
    private final By PRICE = By.xpath("//div[@class='price-new']");
    private final By FAVOURITES_BUTTON = By.xpath("//a[@class='btn-icon-add-fav']");
    private final By FAVORITE_PRODUCT_ADD_BUTTON = By.xpath("//input[@class='btn btn-accent btn_mw-180']");
    private final By FEEDBACK_BUTTON = By.xpath("//div[@class='block-card'] //a[@href='https://apteka911.ua/ua/shop/spazmalgon-tabl-20-p133779/reviews']");
    private final By DELETE_COOKIES = By.xpath("//button[@class='cookie-close']");
    private final By REMOVAL_OF_ADS = By.xpath("//div[@class='bottom-bnn-close']");
    private final By REVIEWS = By.xpath("//div[@class='block-reviews'] //div[@class='b-question__content']");
    private final By MANUFACTURERS_INSTRUCTION_BUTTON = By.xpath("//a[@href='https://apteka911.ua/ua/shop/spazmalgon-tabl-20-p133779#manual']");
    private final By WAREHOUSE = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Склад']");
    private final By DOSAGE_FORM = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Лікарська форма']");
    private final By PHARMACOTHERAPY_GROUP = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Фармакотерапевтична група']");
    private final By PHARMACOLOGIC_PROPERTIES = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Фармакологічні властивості']");
    private final By INDICATIONS = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Показання']");
    private final By CONTRAINDICATIONS = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Протипоказання']");
    private final By INTERACTION_WITH_OTHER_MEDICINAL_PRODUCTS_AND_OTHER_TYPES_OF_INTERACTIONS = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Взаємодія з іншими лікарськими засобами та інші види взаємодій']");
    private final By FEATURES_OF_APPLICATION = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Особливості застосування']");
    private final By METHOD_Of_ADMINISTRATION_AND_DOSE = By.xpath("//h2[text()='Спосіб застосування та дози']");
    private final By USE_DURING_PREGNANCY_OR_BREASTFEEDING = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Особливості застосування']");
    private final By OVERDOSE = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Передозування']");
    private final By ADVERSE_REACTIONS = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Побічні реакції']");
    private final By EXPIRATION_DATE = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Термін придатності']");
    private final By STORAGE_CONDITIONS = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Умови зберігання']");
    private final By PACKAGING = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Упаковка']");
    private final By CATEGORY_OF_RELEASE = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Категорія відпуску']");
    private final By MANUFACTURER = By.xpath("//div[@class='collapsible-heading open-block'] //h2[text()='Виробник']");
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPriceHaveUkrainianCurrency(int productIndex) {
        waitUntilElementVisibility(PRICE);
        WebElement priceElement = getDriver().findElements(PRICE).get(productIndex - 1);
        return priceElement.getText().contains("грн.");
    }

    public void clickOnFavoritesButtonAndAdd(int productIndex) {
        getDriver().findElement(FAVOURITES_BUTTON).click();
        waitUntilElementVisibility(FAVORITE_PRODUCT_ADD_BUTTON);
        getDriver().findElements(FAVORITE_PRODUCT_ADD_BUTTON).get(productIndex - 1).click();
    }

    public void clickOnFeedbackButton() {
        waitUntilElementVisibility(FEEDBACK_BUTTON);
        getDriver().findElement(FEEDBACK_BUTTON).click();
    }

    public void deleteCookies() {
        waitUntilElementVisibility(DELETE_COOKIES);
        getDriver().findElement(DELETE_COOKIES).click();
        getDriver().findElement(REMOVAL_OF_ADS).click();
    }

    public boolean isFeedbacksDisplayed() {
        return getDriver().findElement(REVIEWS).isDisplayed();
    }

    public void clickOnInstructionButton() {
        getDriver().findElement(MANUFACTURERS_INSTRUCTION_BUTTON).click();
    }


    public boolean checkThatWarehouseDisplayed(int productIndex) {
        return getDriver().findElements(WAREHOUSE).get(productIndex - 1).isDisplayed();
    }

    public boolean checkThatTheDosageFormDisplayed() {
        return getDriver().findElement(DOSAGE_FORM).isDisplayed();
    }

    public boolean checkThatThePharmacotherapyGroupDisplayed() {
        return getDriver().findElement(PHARMACOTHERAPY_GROUP).isDisplayed();
    }

    public boolean checkThatThePharmacologicPropertiesDisplayed() {
        return getDriver().findElement(PHARMACOLOGIC_PROPERTIES).isDisplayed();
    }

    public boolean checkThatTheIndicationsDisplayed() {
        return getDriver().findElement(INDICATIONS).isDisplayed();
    }

    public boolean checkThatTheContraindicationsDisplayed(int productIndex) {
        return getDriver().findElements(CONTRAINDICATIONS).get(productIndex - 1).isDisplayed();
    }

    public boolean checkThatTheInteractionWithOtherMedicinalProductsAndOtherTypesOfInteractionsDisplayed() {
        return getDriver().findElement(INTERACTION_WITH_OTHER_MEDICINAL_PRODUCTS_AND_OTHER_TYPES_OF_INTERACTIONS).isDisplayed();
    }

    public boolean checkThatTheFeaturesOfApplicationDisplayed(int productIndex) {
        return getDriver().findElements(FEATURES_OF_APPLICATION).get(productIndex - 1).isDisplayed();
    }

    public boolean checkThatTheUseDuringPregnancyOrBreastfeedingDisplayed(int productIndex) {
        return getDriver().findElements(USE_DURING_PREGNANCY_OR_BREASTFEEDING).get(productIndex - 1).isDisplayed();
    }

    public boolean checkThatTheMethodOfAdministrationAndDosageDisplayed() {
        return getDriver().findElement(METHOD_Of_ADMINISTRATION_AND_DOSE).isDisplayed();
    }

    public boolean checkThatTheOverdoseDisplayed(int productIndex) {
        return getDriver().findElements(OVERDOSE).get(productIndex - 1).isDisplayed();
    }

    public boolean checkThatTheAdverseReactionsDisplayed() {
        return getDriver().findElement(ADVERSE_REACTIONS).isDisplayed();
    }

    public boolean checkThatTheExpirationDateDisplayed() {
        return getDriver().findElement(EXPIRATION_DATE).isDisplayed();
    }

    public boolean checkThatTheStorageConditionsDisplayed(int productIndex) {
        return getDriver().findElements(STORAGE_CONDITIONS).get(productIndex - 1).isDisplayed();
    }

    public boolean checkThatThePackagingDisplayed() {
        return getDriver().findElement(PACKAGING).isDisplayed();
    }

    public boolean checkThatTheCategoryOfReleaseDisplayed() {
        return getDriver().findElement(CATEGORY_OF_RELEASE).isDisplayed();
    }

    public boolean checkThatTheManufacturerDisplayed() {
        return getDriver().findElement(MANUFACTURER).isDisplayed();
    }






}

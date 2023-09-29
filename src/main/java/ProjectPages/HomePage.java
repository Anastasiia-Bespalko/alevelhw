package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    private final By INPUT_BUTTON = By.xpath("//a[@class='personal-area__user-name']");
    private final By INPUT_POP_UP_REGISTRATION_BUTTON = By.xpath("//a[@class='personal-area__register']");
    private final By NAME_BUTTON_IN_REGISTRATION = By.xpath("//input[@type='text'][@name='userFirstname']");
    private final By LAST_BUTTON__NAME_IN_REGISTRATION = By.xpath("//input[@type='text'][@name='userLastname']");
    private final By PHONE_BUTTON__NUMBER_IN_REGISTRATION = By.xpath("//input[@name='userPhone']");
    private final By EMAIL_BUTTON__IN_REGISTRATION = By.xpath("//input[@type='text'][@name='userEmail']");
    private final By PASSWORD_BUTTON_iN_REGISTRATION = By.xpath("//input[@type='password'][@name='password1']");
    private final By CHECK_IN = By.xpath("//input[@class='btn btn-accent btn-m btn_mw-180']");
    private final By ERROR_ELEMENT_IN_REGISTRATION = By.xpath("//p[@class='alert alert-error']");
    private final By INPUT_POP_UP_LOGIN_BUTTON = By.xpath("//a[@class='personal-area__user-login']");
    private final By EMAIL_OR_NUMBER_BUTTON = By.xpath("//input[@type='text'][@name='login']");
    private final By PASSWORD_BUTTON_IN_INPUT = By.xpath("//input[@name='password']");
    private final By ENTRY_BUTTON_IN_INPUT = By.xpath("//input[@class='btn btn-accent btn-m btn_mw-180']");
    private final By MASSAGE_THAT_LOGIN_IS_SUCCESSFUL = By.xpath("//a[@class='personal-area__user-name']");
    private final By SEARCH = By.xpath("//input[@id='search']");
    private final By MEDICINAL_PRODUCT_BUTTON = By.xpath("//a[@href='https://apteka911.ua/ua/shop/lekarstvennyie-preparatyi']");
    private final By MEDICINAL_PRODUCTS_POP_UP = By.xpath("//div[@class='mc__sub-dropdown']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnInputButton() {
        waitUntilElementVisibility(INPUT_BUTTON);
        getDriver().findElement(INPUT_BUTTON).click();
    }

    public void clickOnRegistrationButtonPopUp() {
        waitUntilElementVisibility(INPUT_POP_UP_REGISTRATION_BUTTON);
        getDriver().findElement(INPUT_POP_UP_REGISTRATION_BUTTON).click();
    }

    public void nameInput() {
        waitUntilElementVisibility(NAME_BUTTON_IN_REGISTRATION);
        getDriver().findElement(NAME_BUTTON_IN_REGISTRATION).sendKeys(faker.name().firstName());
    }

    public void lastNameInput() {
        getDriver().findElement(LAST_BUTTON__NAME_IN_REGISTRATION).sendKeys(faker.name().lastName());
    }

    public void phoneNumberInput() {
        getDriver().findElement(PHONE_BUTTON__NUMBER_IN_REGISTRATION).sendKeys(faker.phoneNumber().cellPhone());
    }

    public void emailInput() {
        getDriver().findElement(EMAIL_BUTTON__IN_REGISTRATION).sendKeys(faker.internet().emailAddress());
    }

    public void passwordInput() {
        getDriver().findElement(PASSWORD_BUTTON_iN_REGISTRATION).sendKeys(faker.internet().password());
    }

    public void clickOnRegistration() {
        getDriver().findElement(CHECK_IN).click();
    }

    public boolean isErrorElementDisplayed() {
        waitUntilElementVisibility(ERROR_ELEMENT_IN_REGISTRATION);
        return getDriver().findElement(ERROR_ELEMENT_IN_REGISTRATION).isDisplayed();
    }

    public void clickOnLoginButton() {
        waitUntilElementVisibility(INPUT_POP_UP_LOGIN_BUTTON);
        getDriver().findElement(INPUT_POP_UP_LOGIN_BUTTON).click();
    }

    public void enterEmailOrNumberButton() {
        getDriver().findElement(EMAIL_OR_NUMBER_BUTTON).sendKeys("bespalko140300@gmail.com");
    }

    public void enterPasswordButton() {
        getDriver().findElement(PASSWORD_BUTTON_IN_INPUT).sendKeys("password");
    }

    public void inputInPersonalAccountClick() {
        waitUntilElementVisibility(ENTRY_BUTTON_IN_INPUT);
        getDriver().findElement(ENTRY_BUTTON_IN_INPUT).click();
    }

    public boolean isMassageOfInputDisplayed() {
        waitUntilElementVisibility(MASSAGE_THAT_LOGIN_IS_SUCCESSFUL);
        return getDriver().findElement(MASSAGE_THAT_LOGIN_IS_SUCCESSFUL).isDisplayed();

    }

    String searchWord = "Спазмалгон";
    public void searchProduct() {
        getDriver().findElement(SEARCH).sendKeys((searchWord), Keys.ENTER);
    }

    public void hoverOnProductCatalog() {
        Actions actions = new Actions(getDriver());
        waitUntilElementVisibility(MEDICINAL_PRODUCT_BUTTON);
        WebElement productCatalogElement = getDriver().findElement(MEDICINAL_PRODUCT_BUTTON);
        actions.moveToElement(productCatalogElement).perform();
    }

    public boolean isMedicinalProductsPopUpDisplayed() {
        waitUntilElementVisibility(MEDICINAL_PRODUCTS_POP_UP);
        return getDriver().findElement(MEDICINAL_PRODUCTS_POP_UP).isDisplayed();
    }

    public void keywordSearchForMedicines() {
        String Keyword = "Знеболюючі";
        getDriver().findElement(SEARCH).sendKeys(Keyword, Keys.ENTER);
    }




}

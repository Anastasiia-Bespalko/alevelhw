package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SamsungTelephonePage extends BasePage{

    private final By PERSONAL_LISTS_BUTTON = By.xpath("//div[@class='zoom-gallery__sidebar'] //div[@class='action action--bookmark']");
    private final By WAIN_IN_POP_UP = By.xpath("//div[@class='modal']");
    private final By WANT_BUTTON_IN_PHONE_SEARCH = By.xpath("//div[@class='action__title']");
    private final By CLOSE_WANT_POP_UP = By.xpath("//div[@class='modal__close-icon btn-close']");
    private final By CHECK_THAT_PHONE_ADD = By.cssSelector("a[href='/profile/guest/lists/bookmarks/']");
    private final By WANT_BUTTON = By.xpath("//div[@class='popover hidden-below-xl'] //div[@class='popover-head']");
    public SamsungTelephonePage(WebDriver driver) {
        super(driver);
    }

    public void personalListButtonClick() {
        waitUntilElementVisibility(PERSONAL_LISTS_BUTTON);
        getDriver().findElement(PERSONAL_LISTS_BUTTON).click();
    }

    public void clickOnButtonWant() {
        waitUntilElementVisibility(WAIN_IN_POP_UP);
        getDriver().findElement(WANT_BUTTON_IN_PHONE_SEARCH).click();
    }

    public void closeWantPopUpClick() {
        getDriver().findElement(CLOSE_WANT_POP_UP).click();
    }

    public void clickOnTheWantButton(int productIndex) {
        waitUntilElementVisibility(WANT_BUTTON);
        getDriver().findElements(WANT_BUTTON).get(productIndex - 1).click();
    }

    public void checkThatTheItemHasBeenAddedToWantButton() {
        waitUntilElementVisibility(CHECK_THAT_PHONE_ADD);
        getDriver().findElement(CHECK_THAT_PHONE_ADD).click();

    }
}

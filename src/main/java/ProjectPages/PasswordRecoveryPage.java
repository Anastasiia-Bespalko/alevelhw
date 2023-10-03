package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage extends BasePage{

    private final By EMAIL_OR_PHONE_BUTTON = By.xpath("//div[@class='block-w600 tc fs16'] //label[@class='input-holder']");
    private final By CAPTCHA = By.xpath("//form[@class='general-form'] //input[@name='captcha_code']");
    private final By ERROR_MASSAGE = By.xpath("//div[@class='block-w600 tc fs16'] //p[@class='alert alert-error']");
    public PasswordRecoveryPage(WebDriver driver) {
        super(driver);
    }

    String enteringAnEmail = "bespalko14032000@gmail.com";
    public void enterEmailInForm() {
        waitUntilElementVisibility(EMAIL_OR_PHONE_BUTTON);
        getDriver().findElement(EMAIL_OR_PHONE_BUTTON).sendKeys((enteringAnEmail), Keys.ENTER);
    }

    String captcha = "1234";
    public void enterCaptcha(int productIndex) {
        getDriver().findElements(CAPTCHA).get(productIndex - 1).sendKeys((captcha), Keys.ENTER);
    }

    public boolean isErrorMassageDisplayed() {
        waitUntilElementVisibility(ERROR_MASSAGE);
        return getDriver().findElement(ERROR_MASSAGE).isDisplayed();
    }
}

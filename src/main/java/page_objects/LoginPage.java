package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private final By EMAIL_OR_NUMBER_BUTTON = By.xpath("//input[@class='field m_b-sm']");
    private final By PASSWORD_BUTTON = By.xpath("//input[@class='field']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isElementEmailDisplayed() {
        waitUntilElementVisibility(EMAIL_OR_NUMBER_BUTTON);
        return getDriver().findElement(EMAIL_OR_NUMBER_BUTTON).isDisplayed();
    }

    public boolean isElementPasswordDisplayed() {
        return getDriver().findElement(PASSWORD_BUTTON).isDisplayed();
    }

}

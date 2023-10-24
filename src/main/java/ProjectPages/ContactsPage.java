package ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage{
    private final By ROUND_THE_CLOCK_HOTLINE = By.xpath("//a[@class='fs24']");
    private final By SUPPORT_SERVICE = By.xpath("//a[text()='apteka911@apteka911.com.ua']");
    private final By SERVICE_QUALITY_CONTROL_SERVICE = By.xpath("//a[text()='0 800 500 488']");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRoundTheClockHotlineNumberDisplayed() {
        waitUntilElementVisibility(ROUND_THE_CLOCK_HOTLINE);
        return getDriver().findElement(ROUND_THE_CLOCK_HOTLINE).isDisplayed();
    }

    public boolean isSupportServiceEmailDisplayed() {
        return getDriver().findElement(SUPPORT_SERVICE).isDisplayed();
    }

    public boolean isServiceQualityControlServiceNumberDisplayed() {
        return getDriver().findElement(SERVICE_QUALITY_CONTROL_SERVICE).isDisplayed();
    }
}

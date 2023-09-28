package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{
    private final By SAMSUNG_PHONE_BUTTON = By.xpath("//a[@class='list-item__title text-md m_b-5']");


    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnTelephoneButton(int productIndex) {
        waitUntilElementVisibility(SAMSUNG_PHONE_BUTTON);
        getDriver().findElements(SAMSUNG_PHONE_BUTTON).get(productIndex - 1).click();
    }

}

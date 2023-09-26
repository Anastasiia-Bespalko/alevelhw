package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    private final By SEARCH_FIELD = By.xpath("//input[@type='text']");
    private final By ENERGY_SUPPLY_BUTTON = By.xpath("//section[@class='index-page-section categories-section'] //i[@class='icon-section--categories icon-section--categories--power']");
    private final By POP_UP_COMPARISON_BUTTON = By.xpath("//div[@class='popover-head']");
    private final By POP_UP_COMPARISON = By.xpath("//div[@class='popover-body popover-body--right popover-body--responsive-xl']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProductByWord(String searchWord) {
        driver.findElement(SEARCH_FIELD).sendKeys(searchWord, Keys.ENTER);
    }
    public void clickOnEnergyButton() {
        driver.findElement(ENERGY_SUPPLY_BUTTON).click();
    }



    private void waitUntilElementVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }

    public void popUpComparisonButtonClick() {
        driver.findElement(POP_UP_COMPARISON_BUTTON).click();
    }

    public boolean isPopUpDisplayed() {
        waitUntilElementVisibility(POP_UP_COMPARISON);
        return driver.findElement(POP_UP_COMPARISON).isDisplayed();
    }

    public void searchProductWithEnterKey(String wordToSearch) {
        driver.findElement(SEARCH_FIELD).sendKeys(wordToSearch, Keys.ENTER);
    }
}

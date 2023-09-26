package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class ChargeStationResultPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final By COMPARE_PRICES_BUTTON = By.xpath("//a[@class='btn btn--orange']");

    public ChargeStationResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilElementVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public void clickOnComparePricesButton(int productIndex) {
        waitUntilElementVisibility(COMPARE_PRICES_BUTTON);
        driver.findElements(COMPARE_PRICES_BUTTON).get(productIndex - 1).click();
    }





}

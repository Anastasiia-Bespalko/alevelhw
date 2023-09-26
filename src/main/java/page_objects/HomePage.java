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


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProductByWord(String wordToSearch) {

        driver.findElement(SEARCH_FIELD).sendKeys(wordToSearch, Keys.ENTER);
    }
    public void clickOnEnergyButton() {
        driver.findElement(ENERGY_SUPPLY_BUTTON).click();
    }



    private void waitUntilElementVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }

}

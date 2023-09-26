package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultChargePage {
    private WebDriver driver;

    private final By TITLE = By.xpath("//h1[@class='title__main']");

    public SearchResultChargePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilElementVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public boolean isTitleContainsText(String expectedText) {
        waitUntilElementVisibility(TITLE);
        WebElement titleElement = driver.findElement(TITLE);
        String actualText = titleElement.getText();

        return actualText.contains(expectedText);
    }
}



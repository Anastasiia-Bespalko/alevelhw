package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsChargePage extends BasePage{
    private final By TITLE = By.xpath("//h1[@class='title__main']");

    public ProductDetailsChargePage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleContainsText(String expectedText) {
        waitUntilElementVisibility(TITLE);
        WebElement titleElement = getDriver().findElement(TITLE);
        String actualText = titleElement.getText();

        return actualText.contains(expectedText);
    }
}



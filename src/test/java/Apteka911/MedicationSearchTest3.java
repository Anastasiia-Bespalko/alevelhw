package Apteka911;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class MedicationSearchTest3 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://apteka911.ua/ua");

        Wait<WebDriver> wait = new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search']")));
        search.click();
        search.sendKeys("Спазмалгон");

        WebElement buttonSearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='b-search__button-icon icon-search']")));
        buttonSearch.click();

        WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Спазмалгон']")));

        String expectedText = "Спазмалгон";
        String actualText = searchResult.getText();
        Assert.assertEquals(expectedText, actualText);

        webDriver.close();
    }
}


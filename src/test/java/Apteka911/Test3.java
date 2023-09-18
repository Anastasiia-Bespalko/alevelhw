package Apteka911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test3 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.navigate().to("https://apteka911.ua/ua");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='search']")));
        search.click();
        search.sendKeys("спазмалгон");

        WebElement buttonSearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='b-search__button-icon icon-search']")));
        buttonSearch.click();

        WebElement searchResult = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='found mb10 mt5 fs14']")));
        assert searchResult.isDisplayed() : "Результаты поиска не отображаются.";

        webDriver.close();
    }
}

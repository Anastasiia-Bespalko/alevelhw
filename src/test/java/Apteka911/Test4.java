package Apteka911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Test4 {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.navigate().to("https://apteka911.ua/ua");

        WebElement productCatalog = webDriver.findElement(By.xpath("//i[@class='icon-menu']"));
        productCatalog.click();

        WebElement menuMedicines = webDriver.findElement(By.xpath("//*[@id=\"wrap\"]/div[3]/div/div/div[1]/ul/li[4]/a"));
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10)); // Используйте Duration.ofSeconds для установки времени ожидания

        WebElement medicinalProducts = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='menu-catalog__item'][1]")));
        webDriver.close();
    }
}


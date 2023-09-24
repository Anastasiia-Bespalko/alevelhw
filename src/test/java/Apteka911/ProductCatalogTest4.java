
package Apteka911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.junit.Assert;

public class ProductCatalogTest4 {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://apteka911.ua/ua");

        WebElement productCatalog = webDriver.findElement(By.xpath("//i[@class='icon-menu']"));
        productCatalog.click();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        WebElement medicinalProducts = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wrap\"]/div[3]/div/div/div[1]/ul/li[4]/a")));
        Assert.assertTrue("Element medicinalProducts is not displayed", medicinalProducts.isDisplayed());

        webDriver.close();
    }
}

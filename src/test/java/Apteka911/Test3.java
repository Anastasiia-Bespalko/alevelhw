package Apteka911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.navigate().to("https://apteka911.ua/ua");

        WebElement search = webDriver.findElement(By.xpath("//input[@id='search']"));
        search.click();
        search.sendKeys("спазмалгон");
        WebElement buttonSearch = webDriver.findElement(By.xpath("//button[@class='b-search__button-icon icon-search']"));
        buttonSearch.click();
        webDriver.close();


    }
}

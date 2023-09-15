package Apteka911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.navigate().to("https://apteka911.ua/ua");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement input = webDriver.findElement(By.xpath("//a[@class='personal-area__user-name']"));
        input.click();

        WebElement login = webDriver.findElement(By.xpath("//a[@class='personal-area__user-login']"));
        login.click();

        WebElement emailOrNumber = webDriver.findElement(By.xpath("//input[@type='text'][@name='login']"));
        emailOrNumber.sendKeys("bespalko140300@gmail.com");

        WebElement password = webDriver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("password");

        WebElement entry = webDriver.findElement(By.xpath("//input[@class='btn btn-accent btn-m btn_mw-180']"));
        entry.click();

        webDriver.close();

    }
}

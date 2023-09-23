package Apteka911;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PersonalAccountLoginTest2 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://apteka911.ua/ua");
        Duration timeout = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(webDriver, timeout);

        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='personal-area__user-name']")));
        input.click();

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='personal-area__user-login']")));
        login.click();

        WebElement emailOrNumber = webDriver.findElement(By.xpath("//input[@type='text'][@name='login']"));
        emailOrNumber.sendKeys("bespalko140300@gmail.com");

        WebElement password = webDriver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("password");

        WebElement entry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='btn btn-accent btn-m btn_mw-180']")));
        entry.click();

        WebElement accountInfo = webDriver.findElement(By.xpath("//a[@class='personal-area__user-name']"));
        Assert.assertTrue("Вход не выполнен успешно", accountInfo.isDisplayed());

        webDriver.close();
    }
}



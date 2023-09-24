
package Apteka911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.github.javafaker.Faker;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class RegistrationTest1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://apteka911.ua/ua");
        Faker faker = new Faker();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement input = webDriver.findElement(By.xpath("//a[@class='personal-area__user-name']"));
        input.click();
        WebElement registration = webDriver.findElement(By.xpath("//a[@class='personal-area__register']"));
        registration.click();

        WebElement name = webDriver.findElement(By.xpath("//input[@type='text'][@name='userFirstname']"));
        name.sendKeys(faker.name().firstName());

        WebElement lastName = webDriver.findElement(By.xpath("//input[@type='text'][@name='userLastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement phone = webDriver.findElement(By.xpath("//input[@name='userPhone']"));
        phone.sendKeys(faker.phoneNumber().cellPhone());
    }
}
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
//    private WebDriver driver;
protected WebDriver driver;

    @BeforeMethod
    public void driverInitialization() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
    }

    @AfterMethod
    public void closeDriver() {
        driver.close();
    }
    public WebDriver getWebDriver() {
        return driver;
    }

}

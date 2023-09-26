package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;


public class ComparisonPopUpElementPageTest {
    private WebDriver driver;

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

    @Test
    public void ComparisonPopUpElementPageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.popUpComparisonButtonClick();
        Assert.assertTrue(homePage.isPopUpDisplayed());
    }

}


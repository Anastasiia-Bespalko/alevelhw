package TestNG;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;

public class RozetkaProductSortingTest {
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Test(dataProvider = "filterData", groups = "positive")
    public void testProductsInRange(int minPrice, int maxPrice) {

        SelenideElement laptopsAndComputers = $x("//div[@class='menu-wrapper menu-wrapper_state_static ng-star-inserted'] //a[@class='menu-categories__link']");
        laptopsAndComputers.click();

        SelenideElement laptops = $x("//ul[@class='portal-grid portal-grid_type_1_6'] //a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']");
        laptops.click();

        SelenideElement filterMin = $x("//form[@class='slider-filter__form ng-untouched ng-pristine ng-valid'] //input[@class='slider-filter__input ng-untouched ng-pristine ng-valid']");
        filterMin.should(exist).setValue(String.valueOf(minPrice));

        SelenideElement filterMax = $x("//input[@class='slider-filter__input ng-untouched ng-pristine ng-valid']");
        filterMax.setValue(String.valueOf(maxPrice));

        SelenideElement filterOK = $x("//button[@class='button button_color_gray button_size_small slider-filter__button']");
        filterOK.click();

        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10));
        List<WebElement> productPrices = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='goods-tile__price price--red ng-star-inserted'] //span[@class='goods-tile__price-value']")));

        for (WebElement priceElement : productPrices) {
            String priceText = priceElement.getText().replaceAll("[^0-9]", "");
            int productPrice = Integer.parseInt(priceText);
            Assert.assertTrue(productPrice >= minPrice && productPrice <= maxPrice, "Товар не соответствует фильтру по цене");
        }
    }

    @DataProvider(name = "filterData")
    public Object[][] filterData() {
        return new Object[][]{
                {20000, 40000},
                {32000, 39000},
        };
    }

    @AfterMethod
    public void afterMethod() {
        Selenide.closeWindow();
    }
}

package TestNG;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$x;

public class RozetkaProductSortingTest {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(dataProvider = "filterData", groups = "positive")
    public void TestFour(int minPrice, int maxPrice) {
        SelenideElement laptopsAndComputers = $x("/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[1]/a");
        laptopsAndComputers.click();

        SelenideElement laptops = $x("/html/body/app-root/div/div/rz-super-portal/div/main/section/div[2]/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]");
        laptops.click();

        SelenideElement filterMin = $x("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/aside/rz-filter-stack/div[3]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-slider/form/fieldset/div/input[1]");
        filterMin.should(exist).setValue(String.valueOf(minPrice));

        SelenideElement filterMax = $x("//input[@class='slider-filter__input ng-untouched ng-pristine ng-valid']");
        filterMax.setValue(String.valueOf(maxPrice));

        SelenideElement filterOK = $x("//button[@class='button button_color_gray button_size_small slider-filter__button']");
        filterOK.click();

        SelenideElement filterСheck = $x("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/p/span");

        String filterCheckText = filterСheck.getText().replaceAll("[^0-9]", "");
        int filterCheckPrice = Integer.parseInt(filterCheckText);

        System.out.println("Цена товара после фильтрации: " + filterCheckPrice);
        Assert.assertTrue(filterCheckPrice >= minPrice, "Товар не соответствует фильтру по цене");
        Assert.assertTrue(filterCheckPrice <= maxPrice, "Товар не соответствует фильтру по цене");
    }

    @DataProvider(name = "filterData")
    public Object[][] filterData() {
        return new Object[][]{
                {20000, 40000},
                {25000, 35000},
        };
    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

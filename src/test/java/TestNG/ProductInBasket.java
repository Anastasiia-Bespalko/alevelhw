package TestNG;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class ProductInBasket {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "positive")
    public void ThirdTest() {
        SelenideElement search = $x("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
        search.setValue("Ноутбук ASUS TUF Gaming F15 FX506HE-HN012");

        SelenideElement find = $x("//button[@class='button button_color_green button_size_medium search-form__submit']");
        find.click();

        SelenideElement laptop = $x("/html/body/app-root/div/div/rz-search/rz-catalog/div/div[2]/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span");

        SelenideElement buy = $x("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");
        buy.click();

        SelenideElement basket = $x("//button[@class='header__button ng-star-inserted header__button--active']");
        basket.click();

        SelenideElement nameInBasket = $x("//a[@class='cart-product__title']");

        String expectedLaptop = laptop.getText();
        String actualNameInBasket = nameInBasket.getText();
        Assert.assertEquals(expectedLaptop, actualNameInBasket);

    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

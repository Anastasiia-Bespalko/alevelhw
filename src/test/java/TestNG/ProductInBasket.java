package TestNG;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductInBasket {
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "positive")
    public void testAddProductToBasket() {
        SelenideElement search = $x("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
        search.setValue("Ноутбук ASUS TUF Gaming F15 FX506HE-HN012");

        SelenideElement find = $x("//button[@class='button button_color_green button_size_medium search-form__submit']");
        find.click();

        SelenideElement laptop = $("a[href=\"https://rozetka.com.ua/asus-90nr0704-m00cw0/p351781200/\"].goods-tile__heading");
        String expectedLaptop = laptop.getText();

        SelenideElement buy = $x("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");
        buy.click();

        SelenideElement basket = $x("//button[@class='header__button ng-star-inserted header__button--active']");
        basket.click();

        SelenideElement nameInBasket = $x("//a[@class='cart-product__title']");


        String actualNameInBasket = nameInBasket.getText();
        Assert.assertEquals(expectedLaptop, actualNameInBasket);

    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

package TestNG;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class SearchProduct {
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "positive")
    public void testSearchIphone14ProMax() {
        SelenideElement search = $x("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
        search.setValue("Iphone 14 pro max");

        SelenideElement find = $x("//button[@class='button button_color_green button_size_medium search-form__submit']").should(Condition.visible);
        find.click();

        SelenideElement price = $x("//div[@class='goods-tile__price price--red ng-star-inserted'] //span[@class='goods-tile__price-value']");
        String expectedPrice = price.getText();

        SelenideElement addToCartButton = $x("//app-buy-button[@class='toOrder ng-star-inserted'] //button[@class='buy-button goods-tile__buy-button ng-star-inserted']");
        addToCartButton.should(Condition.visible).click();

        SelenideElement basket = $x("//button[@class='header__button ng-star-inserted header__button--active']");
        basket.click();

        SelenideElement priceInBasket = $x("//div[@class='cart-receipt__sum']");
        priceInBasket.should(Condition.visible);
        String actualPriceInBasket = priceInBasket.getText();

        Assert.assertEquals(expectedPrice, actualPriceInBasket);
    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

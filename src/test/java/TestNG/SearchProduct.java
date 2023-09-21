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
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "positive")
    public void SecondTest() {
        SelenideElement search = $x("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
        search.setValue("Iphone 14 pro max");

        SelenideElement find = $x("//button[@class='button button_color_green button_size_medium search-form__submit']").should(Condition.visible);
        find.click();

        SelenideElement price = $x("/html/body/app-root/div/div/rz-search/rz-catalog/div/div[2]/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/p/span");


        SelenideElement buy = $x("/html/body/app-root/div/div/rz-search/rz-catalog/div/div[2]/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/app-buy-button/button");
        buy.should(Condition.visible).click();

        SelenideElement basket = $x("//button[@class='header__button ng-star-inserted header__button--active']");
        basket.click();

        SelenideElement priceInBasket = $x("//div[@class='cart-receipt__sum-price']");

        String expectedPrice = price.getText();
        String actualPriceInBasket = priceInBasket.getText();
        Assert.assertEquals(expectedPrice, actualPriceInBasket);
    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

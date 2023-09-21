package Apteka911;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class ProductCatalogTest4Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        SelenideElement iconMenu = $x("//i[@class='icon-menu']");
        iconMenu.click();

        SelenideElement medicinalProducts = $x("//*[@id=\"wrap\"]/div[3]/div/div/div[1]/ul/li[4]/a");
        medicinalProducts.hover();

        SelenideElement catalogMenu = $x("//*[@id=\"wrap\"]/div[3]/div/div/div[2]/div");

        Assert.assertTrue(catalogMenu.should(Condition.appear).is(Condition.visible));

        Selenide.closeWindow();
    }
}

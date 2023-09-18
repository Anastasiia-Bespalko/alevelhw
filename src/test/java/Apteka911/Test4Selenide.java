package Apteka911;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class Test4Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        $x("//i[@class='icon-menu']").click();
        $x("//*[@id=\"wrap\"]/div[3]/div/div/div[1]/ul/li[4]/a").hover();
        $x("//div[@class='fl j-main-catalog-menu main-catalog-menu']").should(Condition.appear).shouldBe(Condition.visible);

        Selenide.closeWindow();
    }
}

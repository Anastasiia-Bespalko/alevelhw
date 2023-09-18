package Apteka911;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

public class Test3Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.browserSize = "1920x1080";
        $x("//input[@id='search']").click();
        $x("//input[@id='search']").sendKeys("спазмалгон");
        $x("//button[@class='b-search__button-icon icon-search']").click();
        $x("//h1[contains(text(),'Спазмалгон')]").shouldHave(Condition.text("Спазмалгон"));

        Selenide.closeWindow();

    }
}

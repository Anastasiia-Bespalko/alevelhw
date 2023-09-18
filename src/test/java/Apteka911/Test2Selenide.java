package Apteka911;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

public class Test2Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        SelenideElement input = Selenide.$x("//a[@class='personal-area__user-name']");
        input.click();
        SelenideElement login = Selenide.$x("//a[@class='personal-area__user-login']");
        login.click();
        SelenideElement emainOrNumber = Selenide.$x("//input[@type='text'][@name='login']").setValue("bespalko140300@gmail.com");
        SelenideElement password = Selenide.$x("//input[@name='password']").setValue("password");
        SelenideElement entryButton = Selenide.$x("//input[@class='btn btn-accent btn-m btn_mw-180']");
        entryButton.click();
        SelenideElement successfulLogin = Selenide.$x("//a[@class='personal-area__user-name']").shouldBe(Condition.visible);

        assert $x("//a[@class='personal-area__user-name']").isDisplayed() : "Элемент не отображается после входа";

        Selenide.closeWindow();
    }
}

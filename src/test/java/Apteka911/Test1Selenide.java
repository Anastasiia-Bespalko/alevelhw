package Apteka911;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Test1Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = faker.phoneNumber().cellPhone();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        $x("//a[@class='personal-area__user-name']").click();
        $x("//a[@class='personal-area__register']").shouldBe(visible).click();


        $x("//input[@type='text'][@name='userFirstname']").should(Condition.appear, Duration.ofSeconds(10)).setValue(firstName);
        $x("//input[@type='text'][@name='userLastname']").should(Condition.appear, Duration.ofSeconds(10)).setValue(lastName);
        $x("//input[@name='userPhone']").should(Condition.appear, Duration.ofSeconds(10)).setValue(phoneNumber);
        $x("//input[@type='text'][@name='userEmail']").should(Condition.appear, Duration.ofSeconds(10)).setValue(email);
        $x("//input[@type='password'][@name='password1']").should(Condition.appear, Duration.ofSeconds(10)).setValue(password);

        $(".btn.btn-accent.btn-m.btn_mw-180").click();

        $("p.alert.alert-error").should(Condition.appear, Duration.ofSeconds(10));
    }
}

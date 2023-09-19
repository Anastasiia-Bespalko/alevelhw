package Apteka911;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationTest1Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Selenide.clearBrowserLocalStorage();

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = faker.phoneNumber().cellPhone();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        SelenideElement input = $x("//a[@class='personal-area__user-name']");
        input.click();

        SelenideElement registration = $x("//a[@class='personal-area__register']").shouldBe(visible);
        registration.click();

        SelenideElement name = $x("//input[@type='text'][@name='userFirstname']").should(Condition.appear, Duration.ofSeconds(10));
        name.setValue(firstName);

        SelenideElement lastName1 = $x("//input[@type='text'][@name='userLastname']");
        lastName1.should(Condition.appear, Duration.ofSeconds(10)).setValue(lastName);

        SelenideElement phone = $x("//input[@name='userPhone']");
        phone.should(Condition.appear, Duration.ofSeconds(10)).setValue(phoneNumber);

        SelenideElement email1 = $x("//input[@type='text'][@name='userEmail']");
        email1.should(Condition.appear, Duration.ofSeconds(10)).setValue(email);

        SelenideElement password1 = $x("//input[@type='password'][@name='password1']");
        password1.should(Condition.appear, Duration.ofSeconds(10)).setValue(password);

        $(".btn.btn-accent.btn-m.btn_mw-180").click();

        $("p.alert.alert-error").should(Condition.appear, Duration.ofSeconds(10));

        String expectedErrorMessage = "Не всі обов'язкові поля заповнені або помилка введення даних";
        String actualErrorMessage = $("p.alert.alert-error").text();
        assert actualErrorMessage.contains(expectedErrorMessage) : "Сообщение об ошибке не соответствует ожидаемому.";

        Selenide.closeWindow();
    }
}

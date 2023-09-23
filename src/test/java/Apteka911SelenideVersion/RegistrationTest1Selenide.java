package Apteka911SelenideVersion;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationTest1Selenide {
    public static void main(String[] args) {
        String expectedErrorMessage = "Не всі обов'язкові поля заповнені або помилка введення даних";
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

        SelenideElement name = $x("//input[@type='text'][@name='userFirstname']").should(Condition.appear);
        name.setValue(firstName);

        SelenideElement lastElement = $x("//input[@type='text'][@name='userLastname']");
        lastElement.should(Condition.appear).setValue(lastName);

        SelenideElement phone = $x("//input[@name='userPhone']");
        phone.should(Condition.appear).setValue(phoneNumber);

        SelenideElement emailElement = $x("//input[@type='text'][@name='userEmail']");
        emailElement.should(Condition.appear).setValue(email);

        SelenideElement passwordElement = $x("//input[@type='password'][@name='password1']");
        passwordElement.should(Condition.appear).setValue(password);

        $(".btn.btn-accent.btn-m.btn_mw-180").click();

        $("p.alert.alert-error").should(Condition.appear);


        String actualErrorMessage = $("p.alert.alert-error").text();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage), "Сообщение об ошибке не соответствует ожидаемому: " + actualErrorMessage);

        Selenide.closeWindow();
    }
}

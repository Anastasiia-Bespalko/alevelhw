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

public class PersonalAccountLogin {
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "negative")
    public void TestLogin() {

        SelenideElement input = $x("//button[@class='header__button ng-star-inserted']");
        input.click();

        SelenideElement login = $x("//input[@id='auth_email']");
        login.setValue("karinamarina@gmail.com");

        SelenideElement password = $x("//input[@id='auth_pass']");
        password.setValue("123456");

        SelenideElement entryButton = $x("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']");
        entryButton.click();

        SelenideElement errorInput = $x("//p[@class='error-message error-message_color_red']");
        errorInput.shouldBe(Condition.visible);

        Assert.assertTrue(errorInput.is(Condition.visible), "Сообщение об ошибке должно быть видно на странице входа в систему.");
    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

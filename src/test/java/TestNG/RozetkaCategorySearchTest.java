package TestNG;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class RozetkaCategorySearchTest {
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "positive")
    public void TestFive() {

        SelenideElement telephones = $x("//a[contains(text(),'Смартфони, ТВ і електроніка')]");
        telephones.click();

        SelenideElement mobileTelephones = $x("/html/body/app-root/div/div/rz-super-portal/div/main/section/div[2]/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]");
        mobileTelephones.click();

        SelenideElement categoryCorrectness = $x("//h1[@class='catalog-heading ng-star-inserted']");

        String expectedHeaderText = "Мобільні телефони";
        String actualHeaderText = categoryCorrectness.getText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }
    @AfterMethod
    public void AfterMethod() {
        Selenide.closeWindow();
    }
}

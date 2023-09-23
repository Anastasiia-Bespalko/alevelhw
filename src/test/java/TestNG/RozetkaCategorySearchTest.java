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
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        Selenide.open("https://rozetka.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test(groups = "positive")
    public void testMobileTelephonesCategory() {

        SelenideElement telephones = $x("//ul[@class='menu-categories menu-categories_type_main'] //a[text()='Смартфони, ТВ і електроніка']");
        telephones.click();

        SelenideElement mobileTelephones = $x("//ul[@class='portal-grid portal-grid_type_1_4'] //a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']");
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

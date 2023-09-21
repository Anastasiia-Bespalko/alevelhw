package Apteka911;

import com.codeborne.selenide.*;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class MedicationSearchTest3Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        SelenideElement search = $x("//input[@id='search']");
        search.click();

        SelenideElement textInput = $x("//input[@id='search']");
        textInput.sendKeys("спазмалгон");

        SelenideElement buttonSearch = $x("//button[@class='b-search__button-icon icon-search']");
        buttonSearch.click();

        SelenideElement searchResult = $x("//h1[contains(text(),'Спазмалгон')]");
        String expectedText = "Спазмалгон";

        String actualText = searchResult.text();
        Assert.assertEquals(expectedText, actualText);
        Selenide.closeWindow();

    }
}

package Apteka911SelenideVersion;

import com.codeborne.selenide.*;
import org.testng.Assert;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class MedicationSearchTest3Selenide {
    public static void main(String[] args) {
        Selenide.open("https://apteka911.ua/ua");
        WebDriverRunner.getWebDriver().manage().window().maximize();

        String searchText = "Спазмалгон";

        SelenideElement search = $x("//input[@id='search']");
        search.click();

        SelenideElement textInput = $x("//input[@id='search']");
        textInput.sendKeys(searchText);

        SelenideElement buttonSearch = $x("//button[@class='b-search__button-icon icon-search']");
        buttonSearch.click();

        Duration waitDuration = Duration.ofSeconds(3);
        SelenideElement searchResult = $x("//*[@id=\"wrp-content\"]/section/h1");
        searchResult.shouldBe(Condition.visible, waitDuration);

        String expectedText = "Спазмалгон";

        String actualText = searchResult.text();
        Assert.assertEquals(expectedText, actualText);

        Selenide.closeWindow();

    }
}

package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnergySupplyPage extends BasePage{

    private final By CHARGING_STATION_BUTTON = By.xpath("//div[@class='navigation-block'] //div[@class='section-navigation__item content']");

    public EnergySupplyPage(WebDriver driver) {
        super(driver);
    }

    public void chargingStationsClick() {
        waitUntilElementVisibility(CHARGING_STATION_BUTTON);
        getDriver().findElement(CHARGING_STATION_BUTTON).click();
    }

}

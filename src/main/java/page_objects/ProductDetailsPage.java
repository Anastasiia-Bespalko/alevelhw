package page_objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductDetailsPage extends BasePage{


    private final By PRODUCT_DETAILS_PAGE_TITLE = By.xpath("//h1[@class='title__main']");

    public ProductDetailsPage(WebDriver driverFromTest){
        super(driverFromTest);
    }

    @Step("Verify get product details page title")
    public String getProductDetailsPageTitle() {
        waitUntilElementVisibility(PRODUCT_DETAILS_PAGE_TITLE);
        return getDriver().findElement(PRODUCT_DETAILS_PAGE_TITLE).getText();
    }
}

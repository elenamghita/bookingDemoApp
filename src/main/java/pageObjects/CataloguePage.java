package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class CataloguePage {

    private static final String baseUrl = "https://webkul-booking-app-demo-2.myshopify.com/collections/all";

    private WebDriver driver;

    private By filterOptionsProduct = By.id("FilterTags");
    private String valueProduct = "wk_booking";
    private By filterOptionsSort = By.id("SortBy");
    private String valueSort = "Alphabetically, A-Z";

    private By findProduct = By.linkText("Beauty Salon");

    public CataloguePage(WebDriver driver) {
        this.driver = driver;
    }

    public void load() {
        driver.get(baseUrl);
    }

    public void filterAndSort() {
        Select product = new Select(driver.findElement(filterOptionsProduct));
        product.selectByVisibleText(valueProduct);
        Select sort = new Select(driver.findElement(filterOptionsSort));
        sort.selectByVisibleText(valueSort);
    }

    public void selectProductBeautySalon() {
        WebElement element = driver.findElement(findProduct);
        element.click();
    }

}

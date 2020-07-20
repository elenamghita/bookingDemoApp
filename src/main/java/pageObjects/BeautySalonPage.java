package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BeautySalonPage {

    private static final String baseUrl = "https://webkul-booking-app-demo-2.myshopify.com/products/beauty-salon";

    private WebDriver driver;

    private By selectDateBy = By.name("datepicker_input");
    private String valueDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    private By selectTimestampBy = By.name("timestamp");
    private String valueTimestamp = "";// after hours

    public BeautySalonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void load() {
        driver.get(baseUrl);
    }

    public void specifySelectDate() {
        WebElement element = driver.findElement(selectDateBy);
        element.sendKeys("value", valueDate);
    }

    public void specifySelectTimestamp() {
        WebElement element = driver.findElement(selectTimestampBy);
        element.sendKeys("value", valueTimestamp);
    }
}

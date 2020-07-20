package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final String baseURL = "https://webkul-booking-app-demo-2.myshopify.com/";
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void load() {
        webDriver.get(baseURL);
    }
}

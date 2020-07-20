package com.endava.bookingDemoApp;

import org.junit.jupiter.api.Test;
import pageObjects.CataloguePage;

import static org.assertj.core.api.Assertions.assertThat;

public class CatalogPageTest extends TestBaseClass {

    @Test
    public void shouldSelectProductBeautySalon() throws Exception {

        // GIVEN
        CataloguePage page = new CataloguePage(driver);
        page.load();
        page.filterAndSort();

        // WHEN
        page.selectProductBeautySalon();

        //THEN

        Thread.sleep(1000);
        assertThat(driver.getCurrentUrl()).endsWith("https://webkul-booking-app-demo-2.myshopify.com/products/beauty-salon");

    }

}

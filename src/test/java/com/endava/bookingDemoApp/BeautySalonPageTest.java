package com.endava.bookingDemoApp;

import org.junit.jupiter.api.Test;
import pageObjects.BeautySalonPage;

public class BeautySalonPageTest extends TestBaseClass {

    @Test
    public void shouldReserveBeautySalon() throws Exception {

        // GIVEN
        BeautySalonPage page = new BeautySalonPage(driver);
        page.load();

        // WHEN
        page.specifySelectDate();

        //THEN
        Thread.sleep(1000);

    }
}

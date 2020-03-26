package org.example;

import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeTest

    public void openBrowser() {

     BrowserSelector.openBrowser();
    }

//    @AfterTest
//    public void closeBrowser() {
//
//        browserSelector.closeBrowser();
//    }

}

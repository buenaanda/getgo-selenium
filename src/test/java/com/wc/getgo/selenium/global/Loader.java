package com.wc.getgo.selenium.global;

import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;

public class Loader {

    private String loaderLocator = "//div/img[@class='loader']";

    public static Loader loader() {
        return new Loader();
    }

    public Loader waitForLoader() {
        seleniumExtension().waitForElementVisible("xpath", loaderLocator);
        return this;
    }

    public Loader waitForLoaderNotVisible() {
        seleniumExtension().waitForElementNotVisible("xpath", loaderLocator);
        return this;
    }
}

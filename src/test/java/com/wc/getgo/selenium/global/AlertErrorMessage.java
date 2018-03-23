package com.wc.getgo.selenium.global;

import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;

public class AlertErrorMessage {

    public static AlertErrorMessage alertErrorMessage() {
        return new AlertErrorMessage();
    }

    public String getAlertErrorMessage() {
        String alertLocator = "//div[@class='alert alert-danger']";
        String alertMessage = seleniumExtension().getText("xpath", alertLocator);
        return alertMessage;
    }
}

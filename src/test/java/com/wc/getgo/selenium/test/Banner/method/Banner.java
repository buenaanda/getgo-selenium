package com.wc.getgo.selenium.test.Banner.method;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.test.Banner.locator.LocatorsBanner.locatorsBanner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;

public class Banner {

    public static Banner banner() {
        return new Banner();
    }

    public boolean clickDebitCardApplyNow() {
        clickButton(driver).xpath(locatorsBanner().debitCardApplyNowButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().noRadioButton());
    }

    public boolean clickApplyForGold() {
        clickButton(driver).xpath(locatorsBanner().applyForGoldButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().noRadioButton());
    }

    public boolean clickPlatinum() {
        clickButton(driver).xpath(locatorsBanner().creditCardPlatinumButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().applyForPlatinumButton());
    }

    public boolean clickApplyForPlatinum() {
        clickButton(driver).xpath(locatorsBanner().applyForPlatinumButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().noRadioButton());
    }

    public boolean clickNo() {
        clickButton(driver).xpath(locatorsBanner().noRadioButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().nextButton());
    }

    public boolean clickYes() {
        clickButton(driver).xpath(locatorsBanner().yesRadioButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().nextButton());
    }

    public boolean clickNotSure() {
        clickButton(driver).xpath(locatorsBanner().notSureRadioButton()).click();
        sleep(1500);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().nextButton());
    }

    public boolean clickNext() {
        clickButton(driver).xpath(locatorsBanner().nextButton()).click();
        seleniumExtension().waitForElementVisible("xpath", locatorsCardApplicationPage().firstNameTextfield());
        return seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().firstNameTextfield());
    }

//    public boolean clickForgetYes() {
//        clickButton(driver).xpath(locatorsBanner().yesButton()).click();
//
//    }

    public boolean clickCloseInvalidProductId() {
        clickButton(driver).xpath(locatorsBanner().invalidCreditCardProdIDModalCloseButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().creditCardGoldButton());
    }
}

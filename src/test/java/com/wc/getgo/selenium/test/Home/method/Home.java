package com.wc.getgo.selenium.test.Home.method;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.test.Home.locator.LocatorsHomePage.locatorsHomePage;

public class Home {

    public static Home home() {
        return new Home();
    }

    public Boolean clickCompare() {
        clickButton(driver).xpath(locatorsHomePage().compareButton()).click();
        sleep(1000);
        return seleniumExtension().getAttribute(locatorsHomePage().compareSection(), "style").contains("max-height");
    }

    public Boolean clickIdDebitHere() {
        clickButton(driver).xpath(locatorsHomePage().idDebitHereLink()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsHomePage().idDebitModal());
    }

    public Boolean clickCloseIdDebit() {
        clickButton(driver).xpath(locatorsHomePage().idDebitCloseModalButton()).click();
        sleep(1000);
        return !seleniumExtension().isElementVisible("xpath", locatorsHomePage().idDebitModal());
    }

    public Boolean clickFeeDebitHere() {
        clickButton(driver).xpath(locatorsHomePage().feeDebitHereLink()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsHomePage().feeDebitModal());
    }

    public Boolean clickCloseFeeDebit() {
        clickButton(driver).xpath(locatorsHomePage().feeDebitCloseModalButton()).click();
        sleep(1000);
        return !seleniumExtension().isElementVisible("xpath", locatorsHomePage().feeDebitModal());
    }

    public Boolean clickIdCreditHere() {
        clickButton(driver).xpath(locatorsHomePage().idCreditHereLink()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsHomePage().idCreditModal());
    }

    public Boolean clickCloseIdCredit() {
        clickButton(driver).xpath(locatorsHomePage().idCreditCloseModalButton()).click();
        sleep(1000);
        return !seleniumExtension().isElementVisible("xpath", locatorsHomePage().idCreditModal());
    }

    public Boolean clickFeeCreditHere() {
        clickButton(driver).xpath(locatorsHomePage().feeCreditHereLink()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsHomePage().feeCreditModal());
    }

    public Boolean clickCloseFeeCredit() {
        clickButton(driver).xpath(locatorsHomePage().feeCreditCloseModalButton()).click();
        sleep(1000);
        return !seleniumExtension().isElementVisible("xpath", locatorsHomePage().feeCreditModal());
    }

    public Boolean clickIdPlatCreditHere() {
        clickButton(driver).xpath(locatorsHomePage().idPlatCreditHereLink()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsHomePage().idPlatCreditModal());
    }

    public Boolean clickCloseIdPlatCredit() {
        clickButton(driver).xpath(locatorsHomePage().idPlatCreditCloseModalButton()).click();
        sleep(1000);
        return !seleniumExtension().isElementVisible("xpath", locatorsHomePage().idPlatCreditModal());
    }

    public Boolean clickFeePlatCreditHere() {
        clickButton(driver).xpath(locatorsHomePage().feePlatCreditHereLink()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsHomePage().feePlatCreditModal());
    }

    public Boolean clickCloseFeePlatCredit() {
        clickButton(driver).xpath(locatorsHomePage().feePlatCreditCloseModalButton()).click();
        sleep(1000);
        return !seleniumExtension().isElementVisible("xpath", locatorsHomePage().feePlatCreditModal());
    }
}

package com.wc.getgo.selenium.test.Menu.method;

import com.wc.getgo.selenium.common.Seleniumbase;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.test.Banner.locator.LocatorsBanner.locatorsBanner;
import static com.wc.getgo.selenium.test.Menu.locator.LocatorsNavigationMenu.locatorsNavigationMenu;

public class NavigationMenu {

    public static NavigationMenu navigationMenu() {
        return new NavigationMenu();
    }


    public Boolean clickDebitCard() {
        clickButton(driver).xpath(locatorsNavigationMenu().debitCardMenu()).click();
        seleniumExtension().waitForElementVisible("xpath", locatorsBanner().debitCardApplyNowButton());
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().debitCardApplyNowButton());
    }

    public Boolean clickCreditCard() {
        clickButton(driver).xpath(locatorsNavigationMenu().creditCardMenu()).click();
        seleniumExtension().waitForElementVisible("xpath", locatorsBanner().applyForGoldButton());
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().applyForGoldButton());
    }

    public Boolean clickPromos() {
        clickButton(driver).xpath(locatorsNavigationMenu().promosMenu()).click();
        String currentUrl = driver.getCurrentUrl();
        return String.format("%s/promos", Seleniumbase.url).equals(currentUrl);
    }
}

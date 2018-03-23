package com.wc.getgo.selenium.test.Footer.method;

import com.wc.getgo.selenium.common.Seleniumbase;

import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.test.ContactUs.locator.LocatorsContactUsPage.locatorsContactUsPage;
import static com.wc.getgo.selenium.test.Footer.locator.LocatorsFooterLink.locatorsFooterLink;

public class Footer {

    public static Footer footer() {
        return new Footer();
    }

    public Boolean clickContactUs() {
        clickButton(driver).xpath(locatorsFooterLink().contactUsLink()).click();
        seleniumExtension().waitForElementVisible("xpath", locatorsContactUsPage().fullnameTextfield());
        return seleniumExtension().isElementVisible("xpath", locatorsContactUsPage().fullnameTextfield());
    }

    public Boolean clickFaq() {
        clickButton(driver).xpath(locatorsFooterLink().faqLink()).click();
        String currentUrl = driver.getCurrentUrl();
        return String.format("%s/faqs", Seleniumbase.url).equals(currentUrl);
    }

    public Boolean clickTermsAndConditions() {
        clickButton(driver).xpath(locatorsFooterLink().termsAndConditionsLink()).click();
        String currentUrl = driver.getCurrentUrl();
        return String.format("%s/terms-and-conditions/cards", Seleniumbase.url).equals(currentUrl);
    }

    public Boolean clickPrivacyAndPolicy() {
        clickButton(driver).xpath(locatorsFooterLink().privacyPolicyLink()).click();
        String currentUrl = driver.getCurrentUrl();
        return String.format("%s/privacy-policy", Seleniumbase.url).equals(currentUrl);
    }
}

package com.wc.getgo.selenium.global;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;

public class ActiveApplication {

    public static ActiveApplication activeApplication() {
        return new ActiveApplication();
    }

    public Boolean clickNo() {
        clickButton(driver).xpath("//button[@value='notForget']").click();
        seleniumExtension().waitForElementVisible("xpath", locatorsReviewApplicationPage().submitFormButton());
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().editPersonalInformationButton());
    }

    public Boolean clickYes() {
        clickButton(driver).xpath("//button[@value='forget']").click();
        seleniumExtension().waitForElementVisible("xpath", locatorsCardApplicationPage().submitFormButton());
        return seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown());
    }
}

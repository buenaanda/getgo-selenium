package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.Loader.loader;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.test.Banner.locator.LocatorsBanner.locatorsBanner;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_11
        extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg
    private String mainURL = url;
    private String platValidUrl = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=2213&next=Next", mainURL);
    private String platValidUrl2 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=2213&creditcard=2213&next=Next", mainURL);
    private String platValidUrl3 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=0&creditcard=2213&next=Next", mainURL);
    private String platInvalidUrl = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=02213&next=Next", mainURL);
    private String platInvalidUrl2 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=2213&creditcard=0&next=Next", mainURL);
    private String platInvalidUrl3 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=01163&next=Next", mainURL);
    private String platInvalidUrl4 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=0830&next=Next", mainURL);
    private String platInvalidUrl5 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=1&creditcard=2213&next=Next", mainURL);
    private String platInvalidUrl6 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=2213&debitcard=1&next=Next", mainURL);

    private String platValidUrl4 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=2213&next=Next", mainURL);
    private String platValidUrl5 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=2213&creditcard=2213&next=Next", mainURL);
    private String platValidUrl6 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=0&creditcard=2213&next=Next", mainURL);
    private String platInvalidUrl7 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=02213&next=Next", mainURL);
    private String platInvalidUrl8 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=2213&creditcard=0&next=Next", mainURL);
    private String platInvalidUrl9 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=01163&next=Next", mainURL);
    private String platInvalidUrl10 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=0830&next=Next", mainURL);
    private String platInvalidUrl11 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=1&creditcard=2213&next=Next", mainURL);
    private String platInvalidUrl12 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=2213&debitcard=1&next=Next", mainURL);

    private String platValidUrl7 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=2213&next=Next", mainURL);
    private String platValidUrl8 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=2213&creditcard=2213&next=Next", mainURL);
    private String platValidUrl9 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=0&creditcard=2213&next=Next", mainURL);
    private String platInvalidUrl13 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=02213&next=Next", mainURL);
    private String platInvalidUrl14 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=2213&creditcard=0&next=Next", mainURL);
    private String platInvalidUrl15 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=01163&next=Next", mainURL);
    private String platInvalidUrl16 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=0830&next=Next", mainURL);
    private String platInvalidUrl17 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=1&creditcard=2213&next=Next", mainURL);
    private String platInvalidUrl18 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=2213&debitcard=1&next=Next", mainURL);

    private String goldValidUrl = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=1163&next=Next", mainURL);
    private String goldValidUrl2 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=1163&creditcard=1163&next=Next", mainURL);
    private String goldValidUrl3 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=0&creditcard=1163&next=Next", mainURL);
    private String goldInvalidUrl = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=01163&next=Next", mainURL);
    private String goldInvalidUrl2 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=1163&creditcard=0&next=Next", mainURL);
    private String goldInvalidUrl3 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=02213&next=Next", mainURL);
    private String goldInvalidUrl4 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=00830&next=Next", mainURL);
    private String goldInvalidUrl5 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=1&creditcard=1163&next=Next", mainURL);
    private String goldInvalidUrl6 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&creditcard=1163&debitcard=1&next=Next", mainURL);

    private String goldValidUrl4 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=1163&next=Next", mainURL);
    private String goldValidUrl5 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=1163&creditcard=1163&next=Next", mainURL);
    private String goldValidUrl6 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=0&creditcard=1163&next=Next", mainURL);
    private String goldInvalidUrl7 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=01163&next=Next", mainURL);
    private String goldInvalidUrl8 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=1163&creditcard=0&next=Next", mainURL);
    private String goldInvalidUrl9 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=02213&next=Next", mainURL);
    private String goldInvalidUrl10 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=00830&next=Next", mainURL);
    private String goldInvalidUrl11 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=1&creditcard=1163&next=Next", mainURL);
    private String goldInvalidUrl12 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&creditcard=1163&debitcard=1&next=Next", mainURL);

    private String goldValidUrl7 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=1163&next=Next", mainURL);
    private String goldValidUrl8 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=1163&creditcard=1163&next=Next", mainURL);
    private String goldValidUrl9 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=0&creditcard=1163&next=Next", mainURL);
    private String goldInvalidUrl13 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=01163&next=Next", mainURL);
    private String goldInvalidUrl14 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=1163&creditcard=0&next=Next", mainURL);
    private String goldInvalidUrl15 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=02213&next=Next", mainURL);
    private String goldInvalidUrl16 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=00830&next=Next", mainURL);
    private String goldInvalidUrl17 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=1&creditcard=1163&next=Next", mainURL);
    private String goldInvalidUrl18 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&creditcard=1163&debitcard=1&next=Next", mainURL);

    private String creditCardUrl = String.format("%s/credit-card", mainURL);

    @Test
    public void verifyIssueNumber32_34_35Test() {
        String[] validUrlList = {platValidUrl, platValidUrl2, platValidUrl3, platValidUrl4, platValidUrl5, platValidUrl6, platValidUrl7, platValidUrl8, platValidUrl9, goldValidUrl, goldValidUrl2, goldValidUrl3, goldValidUrl4, goldValidUrl5, goldValidUrl6, goldValidUrl7, goldValidUrl8, goldValidUrl9};
        for(String url:validUrlList) {
            driver.get(url);
            loader().waitForLoaderNotVisible();
            assertFalse(seleniumExtension().isTextPresent("Page not Found."));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));
        }

        String[] notFoundUrlList = {platInvalidUrl5, platInvalidUrl6, platInvalidUrl11, platInvalidUrl12, platInvalidUrl17, platInvalidUrl18, goldInvalidUrl5, goldInvalidUrl6, goldInvalidUrl11, goldInvalidUrl12, goldInvalidUrl17, goldInvalidUrl18};
        for(String url:notFoundUrlList) {
            driver.get(url);
            loader().waitForLoaderNotVisible();
            assertTrue(seleniumExtension().isTextPresent("Page not Found."));
            String pageTitle = driver.getTitle();
            assertEquals(pageTitle, "Error 404 Page Not Found");
            assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));
        }

        String[] urlList = {platInvalidUrl, platInvalidUrl2, platInvalidUrl3, platInvalidUrl4, platInvalidUrl7, platInvalidUrl8, platInvalidUrl9, platInvalidUrl10, platInvalidUrl13, platInvalidUrl14, platInvalidUrl15, platInvalidUrl16, goldInvalidUrl, goldInvalidUrl2, goldInvalidUrl3, goldInvalidUrl4, goldInvalidUrl7, goldInvalidUrl8, goldInvalidUrl9, goldInvalidUrl10, goldInvalidUrl13, goldInvalidUrl14, goldInvalidUrl15, goldInvalidUrl16};
        for(String url:urlList) {
            driver.get(url);
            loader().waitForLoaderNotVisible();
            sleep(2000);

            seleniumExtension().waitForElementVisible("xpath", locatorsBanner().invalidCreditCardProdIDModal());
            assertTrue(seleniumExtension().getAttribute(locatorsBanner().invalidCreditCardProdIDModal(), "style").contains("block"));
            assertTrue(seleniumExtension().isTextPresent("Warning!"));
            assertTrue(seleniumExtension().isTextPresent("\n" +
                    "                  Invalid Credit Card Product ID, please choose between\n" +
                    "                  "));
            assertTrue(seleniumExtension().isTextPresent("Cebu Pacific GetGo Gold Credit Card"));
            assertTrue(seleniumExtension().isTextPresent(" and\n" +
                    "                  "));
            assertTrue(seleniumExtension().isTextPresent("Cebu Pacific GetGo Platinum Credit Card!"));

            String currentUrl = driver.getCurrentUrl();
            assertEquals(currentUrl, creditCardUrl);

            assertFalse(seleniumExtension().isTextPresent("Page not Found."));
            assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));

            if(url.equals(platInvalidUrl16)) {
                verifyIssueNumber34_PlatinumTest();
            }

            if(url.equals(goldInvalidUrl16)) {
                verifyIssueNumber34_GoldTest();
            }
        }
    }

    public void verifyIssueNumber34_PlatinumTest() {
        assertTrue(banner().clickCloseInvalidProductId());
        assertTrue(banner().clickPlatinum());
        assertTrue(banner().clickApplyForPlatinum());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());
        apply();
    }

    public void verifyIssueNumber34_GoldTest() {
        assertTrue(banner().clickCloseInvalidProductId());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));
        apply();
    }
    
    public void apply() {
        cardApplication()
                .selectSalutation(generateFakeData().title())
                .setFirstName(generateFakeData().firstName())
                .setMiddleName(generateFakeData().middleName())
                .setLastName(generateFakeData().lastName())
                .selectBirthDate(generateFakeData().birthMonth(), generateFakeData().birthYear(), generateFakeData().birthDay())
                .setPlaceOfBirth(generateFakeData().placeOfBirth())
                .selectNationalityOrCitizenship(generateFakeData().nationality())
                .selectCivilStatus(generateFakeData().civilStatus())
                .setMothersMaidenName(String.format("%s %s %s", generateFakeData().firstName(), "B", generateFakeData().lastName()))
                .setPresentAddress(generateFakeData().address())
                .selectPresentProvince("Metro Manila")
                .selectPresentCity("Makati City")
                .checkSameAsPresentAddress()
                .selectHomeOwnership(generateFakeData().homeOwnership())
                .setYearsOfStay(generateFakeData().yearsOfStay())
                .setEmailAddress(generateFakeData().email())
                .setMobileNumberAreaCode(generateFakeData().mobileAreaCode())
                .setMobileNumber(generateFakeData().mobileNumber())
                .selectEmploymentStatus(generateFakeData().employmentStatus())
                .setEmployerOrBusinessName(generateFakeData().companyName())
                .selectOccupationGroup(generateFakeData().occupationGroup())
                .selectOccupationOrPosition(generateFakeData().occupation())
                .selectBusinessIndustry(generateFakeData().businessIndustry())
                .setBusinessAddress(generateFakeData().address())
                .selectWorkProvince("Metro Manila")
                .selectWorkCity("Manila")
                .setTotalYearsInWorkOrBusiness(generateFakeData().yearsOfStay())
                .setWorkPhoneNumberAreaCode(generateFakeData().phoneAreaCode())
                .setWorkPhoneNumber(generateFakeData().phoneNumber())
                .clickTIN()
                .setTIN(generateFakeData().tin())
                .setGrossAnnualIncome(generateFakeData().grossAnnualIncome())
                .checkPension()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUsePresentAddress()
                .checkAgreement();
        cardApplication().checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

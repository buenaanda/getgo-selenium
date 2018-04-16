package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_8 extends Seleniumbase {

    /** QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg **/

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = generateFakeData().middleName();
    private String lastName = generateFakeData().lastName();
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Metro Manila";
    private String presentCity = "Makati City";
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();
    private String mothersMaidenName = String.format("%s %s %s", generateFakeData().firstName(), "M", generateFakeData().lastName());

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Metro Manila";
    private String businessCity = "Manila";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String tin = generateFakeData().tin();

    private String occupationGroup = generateFakeData().occupationGroup();
    private String totalYearsInWorkOrBusiness = generateFakeData().yearsOfStay();
    private String grossAnnualIncome = generateFakeData().grossAnnualIncome();
    private String homeOwnership = generateFakeData().homeOwnership();
    private String yearsOfStay = generateFakeData().yearsOfStay();

    private String baseUrl =String.format("%s/", url);
    private String successUrl = String.format("%s%s", baseUrl, "apply/registration/success");
    private String reviewUrl = String.format("%s%s", baseUrl, "apply/registration/review");
    private String applyGoldCardMemberNoUrl = String.format("%s%s", baseUrl, "apply/registration?member=no&ggn=&con_ggn=&creditcard=1163&next=Next");
    private String applyGoldCardMemberYesUrl = String.format("%s%s", baseUrl, "apply/registration?member=yes&ggn=&con_ggn=&creditcard=1163&next=Next");
    private String applyGoldCardMemberIdkUrl = String.format("%s%s", baseUrl, "apply/registration?member=idk&ggn=&con_ggn=&creditcard=1163&next=Next");
    private String applyPlatinumCardMemberNoUrl = String.format("%s%s", baseUrl, "apply/registration?member=no&ggn=&con_ggn=&creditcard=2213&next=Next");
    private String applyPlatinumCardMemberYesUrl = String.format("%s%s", baseUrl, "apply/registration?member=yes&ggn=&con_ggn=&creditcard=2213&next=Next");
    private String applyPlatinumCardMemberIdkUrl = String.format("%s%s", baseUrl, "apply/registration?member=idk&ggn=&con_ggn=&creditcard=2213&next=Next");

    @Test
    public void verifyIssueNumber43Test() {
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

        apply();

        String currentUrl = driver.getCurrentUrl();
        driver.get(currentUrl);
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }

    @Test(dependsOnMethods = "verifyIssueNumber43Test")
    public void doNotShowSuccessPageToUserWithoutSubmittingAnApplicationTest() {
        driver.get(successUrl);
        assertTrue(driver.getCurrentUrl().equals(baseUrl));

        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickPlatinum());
        assertTrue(banner().clickApplyForPlatinum());
        assertTrue(banner().clickYes());
        assertTrue(banner().clickNext());
        apply();
        driver.get(successUrl);
        assertTrue(driver.getCurrentUrl().equals(baseUrl));

        driver.navigate().back();
        assertTrue(reviewApplication().clickSubmitForm());

        driver.navigate().back();
        assertFalse(reviewApplication().clickSubmitForm());
        assertTrue(driver.getCurrentUrl().equals(baseUrl));
    }

    @Test(dependsOnMethods = "doNotShowSuccessPageToUserWithoutSubmittingAnApplicationTest")
    public void doNotShowReviewPageToUserWithoutSubmittingAnApplicationTest() {
        driver.get(reviewUrl);
        assertTrue(driver.getCurrentUrl().equals(baseUrl));

        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNotSure());
        assertTrue(banner().clickNext());
        apply();

        driver.navigate().back();
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().submitFormButton()));
        driver.navigate().forward();
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }

    @Test(dependsOnMethods = "doNotShowReviewPageToUserWithoutSubmittingAnApplicationTest")
    public void applyGoldCardUrlTest() {
        String[] urlList = {applyGoldCardMemberNoUrl, applyGoldCardMemberYesUrl, applyGoldCardMemberIdkUrl};
        for(String url:urlList) {
            driver.get(url);
            apply();
            assertTrue(reviewApplication().clickSubmitForm());
            assertTrue(reviewApplication().clickContinue());
        }
    }

    @Test(dependsOnMethods = "applyGoldCardUrlTest")
    public void applyPlatinumCardUrlTest() {
        String[] urlList = {applyPlatinumCardMemberNoUrl, applyPlatinumCardMemberYesUrl, applyPlatinumCardMemberIdkUrl};
        for(String url:urlList) {
            driver.get(url);
            apply();
            assertTrue(reviewApplication().clickSubmitForm());
            assertTrue(reviewApplication().clickContinue());
        }
    }

    private void apply() {
        cardApplication()
                .selectSalutation(title)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .selectBirthDate(generateFakeData().birthMonth(), generateFakeData().birthYear(), generateFakeData().birthDay())
                .setPlaceOfBirth(placeOfBirth)
                .selectNationalityOrCitizenship(nationalityOrCitizenship)
                .selectCivilStatus(civilStatus)
                .setMothersMaidenName(mothersMaidenName)
                .setPresentAddress(presentAddress)
                .selectPresentProvince(presentProvince)
                .selectPresentCity(presentCity)
                .checkSameAsPresentAddress()
                .selectHomeOwnership(homeOwnership)
                .setYearsOfStay(yearsOfStay)
                .setEmailAddress(emailAddress)
                .setMobileNumberAreaCode(mobileNumberAreaCode)
                .setMobileNumber(mobileNumber)
                .selectEmploymentStatus(employmentStatus)
                .setEmployerOrBusinessName(employerOrBusinessName)
                .selectOccupationGroup(occupationGroup)
                .selectOccupationOrPosition(occupationOrPosition)
                .selectBusinessIndustry(businessIndustry)
                .setBusinessAddress(businessAddress)
                .selectWorkProvince(businessProvince)
                .selectWorkCity(businessCity)
                .setTotalYearsInWorkOrBusiness(totalYearsInWorkOrBusiness)
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber(businessPhoneNumber)
                .clickGSIS()
                .setGSIS("123")
                .clickTIN()
                .setTIN(tin)
                .setGrossAnnualIncome(grossAnnualIncome)
                .checkPension()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUsePresentAddress()
                .checkAgreement();
        cardApplication().checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());
    }
}

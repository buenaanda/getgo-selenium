package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.Loader.loader;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DebitCardApplicationTest_11 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg
    private String mainURL = url;
    private String validUrl = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=1&next=Next", mainURL);
    private String validUrl2 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=01&next=Next", mainURL);
    private String validUrl3 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=1163&next=Next", mainURL);
    private String validUrl4 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=2213&next=Next", mainURL);
    private String validUrl5 = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=0830&next=Next", mainURL);
    private String validUrl6 =  String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=1&debitcard=1&next=Next", mainURL);
    private String invalid = String.format("%s/apply/registration?member=no&ggn=&con_ggn=&debitcard=1&creditcard=1163&next=Next", mainURL);

    private String validUrl7 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=1&next=Next", mainURL);
    private String validUrl8 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=01&next=Next", mainURL);
    private String validUrl9 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=1163&next=Next", mainURL);
    private String validUrl10 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=2213&next=Next", mainURL);
    private String validUrl11 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=0830&next=Next", mainURL);
    private String validUrl12 =  String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=1&debitcard=1&next=Next", mainURL);
    private String invalid2 = String.format("%s/apply/registration?member=yes&ggn=&con_ggn=&debitcard=1&creditcard=1163&next=Next", mainURL);

    private String validUrl13 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=1&next=Next", mainURL);
    private String validUrl14 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=01&next=Next", mainURL);
    private String validUrl15 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=1163&next=Next", mainURL);
    private String validUrl16 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=2213&next=Next", mainURL);
    private String validUrl17 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=0830&next=Next", mainURL);
    private String validUrl18 =  String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=1&debitcard=1&next=Next", mainURL);
    private String invalid3 = String.format("%s/apply/registration?member=idk&ggn=&con_ggn=&debitcard=1&creditcard=1163&next=Next", mainURL);

    @Test
    public void verifyIssueNumber32_34_35Test() {
        String[] urlList = {validUrl, validUrl2, validUrl3, validUrl4, validUrl5, validUrl6, validUrl7, validUrl8, validUrl9, validUrl10, validUrl11, validUrl12, validUrl13, validUrl14, validUrl15, validUrl16, validUrl17, validUrl18};
        for(String url:urlList) {
            driver.get(url);
            loader().waitForLoaderNotVisible();
            assertFalse(seleniumExtension().isTextPresent("Page not Found."));
            if(url.equals(validUrl18)) {
                apply();
            }
        }

        String[] invalidUrlList = {invalid, invalid2, invalid3};
        for(String invalidUrl:invalidUrlList) {
            driver.get(invalidUrl);
            loader().waitForLoaderNotVisible();
            sleep(3000);
            assertTrue(seleniumExtension().isTextPresent("Page not Found."));
            String pageTitle = driver.getTitle();
            assertEquals(pageTitle, "Error 404 Page Not Found");
            assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));
        }
    }

    public void apply() {
        cardApplication()
                .selectSalutation(generateFakeData().title())
                .setFirstName(generateFakeData().firstName())
                .setMiddleName(generateFakeData().middleName())
                .setLastName(generateFakeData().lastName())
                .selectBirthDate(generateFakeData().birthMonth(), generateFakeData().birthYear(), generateFakeData().birthDay())
                .setPlaceOfBirth(generateFakeData().placeOfBirth())
                .setNationalityOrCitizenship(generateFakeData().nationality())
                .selectCivilStatus(generateFakeData().civilStatus())
                .setPresentAddress(generateFakeData().address())
                .selectPresentProvince("Metro Manila")
                .selectPresentCity("Kalookan City")
                .checkSameAsPresentAddress()
                .setEmailAddress(generateFakeData().email())
                .setMobileNumberAreaCode(generateFakeData().mobileAreaCode())
                .setMobileNumber(generateFakeData().mobileNumber())
                .selectEmploymentStatus(generateFakeData().employmentStatus())
                .setEmployerOrBusinessName(generateFakeData().companyName())
                .selectOccupationOrPosition(generateFakeData().occupation())
                .selectBusinessIndustry(generateFakeData().businessIndustry())
                .setBusinessAddress(generateFakeData().address())
                .selectWorkProvince("Metro Manila")
                .selectWorkCity("Manila")
                .setWorkPhoneNumberAreaCode(generateFakeData().phoneAreaCode())
                .setWorkPhoneNumber(generateFakeData().phoneNumber())
                .clickTIN()
                .setTIN(generateFakeData().tin())
                .checkSalary()
                .clickUsePresentAddress();

        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DebitCardApplicationTest_12 extends Seleniumbase {

    /** QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg **/

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = generateFakeData().middleName();
    private String lastName = generateFakeData().lastName();
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Tawi-Tawi";
    private String presentCity = "Tandu Bas";
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Pangasinan";
    private String businessCity = "Alaminos";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String sss = generateFakeData().sssNumber();

    @Test
    public void verifyIssueNumber30_Retired_Test() {
        assertTrue(navigationMenu().clickDebitCard());
        assertTrue(banner().clickDebitCardApplyNow());
        assertTrue(banner().clickNotSure());
        assertTrue(banner().clickNext());

        cardApplication()
                .selectSalutation(title)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .selectBirthDate(generateFakeData().birthMonth(), generateFakeData().birthYear(), generateFakeData().birthDay())
                .setPlaceOfBirth(placeOfBirth)
                .setNationalityOrCitizenship(nationalityOrCitizenship)
                .selectCivilStatus(civilStatus)
                .setPresentAddress(presentAddress)
                .selectPresentProvince(presentProvince)
                .selectPresentCity(presentCity)
                .checkSameAsPresentAddress()
                .setEmailAddress(emailAddress)
                .setMobileNumberAreaCode(mobileNumberAreaCode)
                .setMobileNumber(mobileNumber)
                .selectEmploymentStatus(employmentStatus)
                .setEmployerOrBusinessName(employerOrBusinessName)
                .selectOccupationOrPosition(occupationOrPosition)
                .selectBusinessIndustry(businessIndustry)
                .setBusinessAddress(businessAddress)
                .selectWorkProvince(businessProvince)
                .selectWorkCity(businessCity)
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber("123")
                .clickSSS()
                .setSSS(sss)
                .checkInvestment()
                .clickUsePresentAddress()
                .selectEmploymentStatus("Retired");

        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatus()), "RETIRED");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employerOrBusinessName()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPosition()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustry()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessAddress1()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workPhoneNumber()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().idPresented()), sss);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().sourceOfFunds()), "Investment");

        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

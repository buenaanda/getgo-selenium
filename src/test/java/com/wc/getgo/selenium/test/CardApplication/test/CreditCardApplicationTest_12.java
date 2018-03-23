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

public class CreditCardApplicationTest_12 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Buena";
    private String lastName = generateFakeData().lastName();
    private String mothersMaidenName = String.format("%s %s %s", generateFakeData().firstName(), "M", generateFakeData().lastName());
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Metro Manila";
    private String presentCity = "Valenzuela";
    private String homeOwnership = generateFakeData().homeOwnership();
    private String yearsOfStay = generateFakeData().yearsOfStay();
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();
    private String employmentStatus = "Retired";
    private String sss = generateFakeData().sssNumber();
    private String grossAnualIncome = generateFakeData().grossAnnualIncome();

    @Test
    public void verifyIssueNumber30_Retired_Test() {
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickPlatinum());
        assertTrue(banner().clickApplyForPlatinum());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

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
                .clickSSS()
                .setSSS(sss)
                .setGrossAnnualIncome(grossAnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUsePresentAddress()
                .checkAgreement()
                .checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatus()), "RETIRED");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employerOrBusinessName()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationGroup()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPosition()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustry()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessAddress1()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workPhoneNumber()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().idPresentedCreditCard()), sss);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().sourceOfFunds()), "Investment, Salary");

        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

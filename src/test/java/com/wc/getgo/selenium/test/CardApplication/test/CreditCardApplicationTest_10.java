package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_10 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Buena";
    private String lastName = generateFakeData().lastName();
    private String mothersMaidenName = String.format("%s %s %s", generateFakeData().firstName(), "M", generateFakeData().lastName());
    private String placeOfBirth = "Nueva Ecija";
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
    public void verifyCustomerAgreementTest() {
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
                .clickCardDeliveryUsePresentAddress();

        cardApplication().checkAgreement();
        cardApplication().uncheckAgreement();
        cardApplication().checkImNotARobot();

        assertFalse(cardApplication().clickSubmitForm());

        String errorAgreementXpathLocator = "//small[@data-bv-for='agree' and @data-bv-result='INVALID']";
        assertEquals(seleniumExtension().getText("xpath", errorAgreementXpathLocator), "Please accept the agreement.");

        cardApplication().checkAgreement();
        assertTrue(cardApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

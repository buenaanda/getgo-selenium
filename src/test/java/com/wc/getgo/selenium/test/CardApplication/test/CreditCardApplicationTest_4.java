package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;

import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
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

public class CreditCardApplicationTest_4 extends Seleniumbase {

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
    private String presentProvince = "Siquijor";
    private String presentCity = "Larena";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Sarangani";
    private String permanentCity = "Kiamba";
    private String homeOwnership = generateFakeData().homeOwnership();
    private String yearsOfStay = generateFakeData().yearsOfStay();
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();
    private String supSalutation = generateFakeData().supTitle();
    private String supFirstName = generateFakeData().firstName();
    private String supMiddleName = "Anda";
    private String supLastName = generateFakeData().lastName();
    private String supBMonth = generateFakeData().birthMonth();
    private String supBYear = generateFakeData().birthYear();
    private String supDay = generateFakeData().birthDay();
    private String relationshipWithThePrincipal = generateFakeData().relationshipWithPrincipal();
    private String supPresentAddress = generateFakeData().address();
    private String supPermanentAddress = generateFakeData().address();
    private String supEmailAddress = generateFakeData().email();
    private String supMobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String supMobileNumber = generateFakeData().mobileNumber();
    private String supPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String supPhoneNumber = generateFakeData().phoneNumber();
    private String supGsis = generateFakeData().gsisNumber();
    private String subLimit = generateFakeData().subLimitAmount();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationGroup = generateFakeData().occupationGroup();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Batanes";
    private String businessCity = "Itbayat";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String gsis = generateFakeData().gsisNumber();
    private String totalYearsInWorkOrBusiness = generateFakeData().yearsOfStay();
    private String grossAnualIncome = generateFakeData().grossAnnualIncome();

    private String cardBankName1 = "Citibank";
    private String cardBankName2 = "Banco De Oro";
    private String cardBankNumber1 = generateFakeData().creditCardNumber();
    private String cardBankNumber2 = generateFakeData().creditCardNumber();

    @Test
    public void verifyIssueNumber36_47_41Test() {
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
                .setPermanentAddress(permanentAddress)
                .selectPermanentProvince(permanentProvince)
                .selectPermanentCity(permanentCity)
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
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUseWorkAddress()
                .clickGSIS()
                .setGSIS(gsis)
                .setGrossAnnualIncome(grossAnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickExistingCreditCardholderYes()
                .selectCardBankName1(cardBankName1)
                .setCreditCardNumber1(cardBankNumber1)
                .clickAdd()
                .selectCardBankName2(cardBankName2)
                .setCreditCardNumber2(cardBankNumber2)
                .setPhoneNumberAreaCode(phoneNumberAreaCode)
                .setPhoneNumber(phoneNumber)
                .clickAvailSupplementaryCardYes()
                .selectSupSalutation(supSalutation)
                .setSupFirstName(supFirstName)
                .setSupMiddleName(supMiddleName)
                .setSupLastName(supLastName)
                .selectSupBirthDate(supBMonth, supBYear, supDay)
                .setRelationshipWithPrincipal(relationshipWithThePrincipal)
                .setSupPresentAddress(supPresentAddress)
                .setSupPermanentAddress(supPermanentAddress)
                .setSupEmailAddress(supEmailAddress)
                .setSupMobileNumberAreaCode(supMobileNumberAreaCode)
                .setSupMobileNumber(supMobileNumber)
                .setSupPhoneNumberAreaCode(supPhoneNumberAreaCode)
                .setSupPhoneNumber(supPhoneNumber)
                .clickSupGSIS()
                .setSupGSIS(supGsis)
                .setSubLimit(subLimit)
                .checkAgreement()
                .checkImNotARobot();
        sleep(180000);
        assertFalse(cardApplication().clickSubmitForm());
        cardApplication()
                .uncheckAgreement()
                .checkAgreement()
                .checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());
    }

    @Test(dependsOnMethods = "verifyIssueNumber36_47_41Test")
    public void verifyIssueNumber40Test() {
        sleep(180000);
        assertFalse(reviewApplication().clickSubmitForm());
        assertEquals(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()), businessPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().workPhoneNumberTextfield()), businessPhoneNumber);
        cardApplication()
                .uncheckAgreement()
                .checkAgreement()
                .checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

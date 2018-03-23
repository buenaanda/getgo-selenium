package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_3 extends Seleniumbase {

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
    private String presentProvince = "Aklan";
    private String presentCity = "Balite";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Biliran Sub-Province";
    private String permanentCity = "Biliran";
    private String homeOwnership = generateFakeData().homeOwnership();
    private String yearsOfStay = generateFakeData().yearsOfStay();
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationGroup = generateFakeData().occupationGroup();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Benguet";
    private String businessCity = "Atok";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String sss = generateFakeData().sssNumber();
    private String totalYearsInWorkOrBusiness = generateFakeData().yearsOfStay();
    private String grossAnualIncome = generateFakeData().grossAnnualIncome();

    private Date date = new Date();
    private SimpleDateFormat bdayMonthFormat = new SimpleDateFormat("MMM");
    private SimpleDateFormat bdayDayFormat = new SimpleDateFormat("d");
    private SimpleDateFormat bdayYearFormat = new SimpleDateFormat("YYYY");

    private String supSalutation = generateFakeData().supTitle();
    private String supFirstName = generateFakeData().firstName();
    private String supMiddleName = "Anda";
    private String supLastName = generateFakeData().lastName();
    private String supNameToAppearOnCard = String.format("%s %s %s", supFirstName, supMiddleName.substring(0, 1), supLastName);
    private String supBMonth = bdayMonthFormat.format(date);
    private String supBYear = bdayYearFormat.format(date);
    private String supDay = bdayDayFormat.format(date);
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

    @Test
    public void verifyIssueNumber38Test() {
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
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
                .clickSSS()
                .setSSS(sss)
                .setGrossAnnualIncome(grossAnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUseWorkAddress()
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
                .checkAgreement();

        cardApplication().checkImNotARobot();
        cardApplication().clickSubmitForm();
        sleep(180000);
        reviewApplication().clickSubmitForm();
        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();
        cardApplication().clickSubmitForm();
        assertTrue(reviewApplication().clickEditAdditionalOptions());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supNameToAppearOnCardTextfield()), supNameToAppearOnCard.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyIssueNumber38Test")
    public void verifyIssueNumber39Test() {
        assertTrue(reviewApplication().clickEditPersonalInformation());
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().nationalityOrCitizenshipDropdown()));
    }

    @Test(dependsOnMethods = "verifyIssueNumber39Test")
    public void verifyIssueNumber37Test() {
        assertTrue(seleniumExtension().isTextPresent("Relationship with Principal"));
        assertFalse(seleniumExtension().isTextPresent("Relationshp with Principal"));
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

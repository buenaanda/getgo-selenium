package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DebitCardApplicationTest_2 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Buena";
    private String lastName = generateFakeData().lastName();
    private String birthDate = "1993-08-30";
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Metro Manila";
    private String presentCity = "Valenzuela";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Nueva Ecija";
    private String permanentCity = "Cuyapo";
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Metro Manila";
    private String businessCity = "Marikina";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String sss = generateFakeData().sssNumber();
    private String sourceOfFunds = "Salary";
    private String mailingAddress = "Use Present Address";

    @Test
    public void verifyIssueNumber3Test() {
        assertTrue(navigationMenu().clickDebitCard());
        assertTrue(banner().clickDebitCardApplyNow());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

        cardApplication()
                .selectSalutation(title)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .selectBirthDate("Aug", "1993", "30")
                .setPlaceOfBirth(placeOfBirth)
                .setNationalityOrCitizenship(nationalityOrCitizenship)
                .selectCivilStatus(civilStatus)
                .setPresentAddress(presentAddress)
                .selectPresentProvince(presentProvince)
                .selectPresentCity(presentCity)
                .setPermanentAddress(permanentAddress)
                .selectPermanentProvince(permanentProvince)
                .selectPermanentCity(permanentCity)
                .setEmailAddress(emailAddress)
                .setMobileNumberAreaCode(mobileNumberAreaCode)
                .setMobileNumber(mobileNumber);
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().personalInfoProgress(), "class").contains("count pcheck"));
    }

    @Test(dependsOnMethods = "verifyIssueNumber3Test")
    public void verifyIssueNumber31Test() {
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().contactDetailsProgress(), "class").contains("count pcheck"));
        cardApplication()
                .setPhoneNumberAreaCode(phoneNumberAreaCode).setPhoneNumber(phoneNumber);
    }

    @Test(dependsOnMethods = "verifyIssueNumber31Test")
    public void verifyIssueNumber4Test() {
        cardApplication()
                .selectEmploymentStatus(employmentStatus)
                .setEmployerOrBusinessName(employerOrBusinessName)
                .selectOccupationOrPosition(occupationOrPosition)
                .selectBusinessIndustry(businessIndustry)
                .setBusinessAddress(businessAddress)
                .selectWorkProvince(businessProvince)
                .selectWorkCity(businessCity)
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber(businessPhoneNumber);
        cardApplication().clickUseWorkAddress();
        cardApplication().selectEmploymentStatus("Retired").clickSSS().setSSS(sss).checkSalary();

        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();
        cardApplication().clickSubmitForm();
    }

    @Test(dependsOnMethods = "verifyIssueNumber4Test")
    public void verifyReviewPersonalInformationTest() {
        String cardHoldersName = String.format("%s %s %s %s", title, firstName.toUpperCase(), middleName.toUpperCase(), lastName.toUpperCase());
        String middleInitial = middleName.substring(0, 1);
        String nameToAppearOnCard = String.format("%s %s %s", firstName, middleInitial, lastName);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().cardHoldersName()), cardHoldersName);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().nameToAppearOnCard()), nameToAppearOnCard.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().birthdate()), birthDate);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().placeOfBirth()), placeOfBirth.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().nationalityOrCitizenship()), nationalityOrCitizenship.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().civilStatus()), civilStatus.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyIssueNumber4Test")
    public void verifyReviewContactDetailsTest() {
        String presentAddress2 = String.format("%s, %s", presentCity, presentProvince);
        String mobile = String.format("+63%s-%s", mobileNumberAreaCode, mobileNumber);
        String phone = String.format("%s-%s", phoneNumberAreaCode, phoneNumber);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentAddress1()), presentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentAddress2()), presentAddress2.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentAddress1()), permanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().emailAddress()), emailAddress);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().mobileNumber()), mobile);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().phoneNumber()), phone);
    }

    @Test(dependsOnMethods = "verifyIssueNumber4Test")
    public void verifyReviewIssueNumber18Test() {
        String permanentAddress2 = String.format("%s, %s", permanentCity, permanentProvince);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentAddress2()), permanentAddress2.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyIssueNumber4Test")
    public void verifyReviewFinancialInformationRetiredTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatus()), "RETIRED");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employerOrBusinessName()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPosition()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustry()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessAddress1()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workPhoneNumber()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().idPresented()), sss);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().sourceOfFunds()), sourceOfFunds);

    }

    @Test(dependsOnMethods = "verifyReviewFinancialInformationRetiredTest")
    public void verifyReviewOtherInstructionsTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().mailingAddress()), mailingAddress);
    }

    @Test(dependsOnMethods = "verifyReviewOtherInstructionsTest")
    public void submitReviewApplicationTest() {
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

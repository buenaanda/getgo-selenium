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
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DebitCardApplicationTest_7 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = generateFakeData().middleName();
    private String lastName = generateFakeData().lastName();
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Metro Manila";
    private String presentCity = "Pasig";
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();

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

    @Test
    public void verifyReviewFinancialInformationWithCompanyTest() {
        assertTrue(navigationMenu().clickDebitCard());
        assertTrue(banner().clickDebitCardApplyNow());
        assertTrue(banner().clickYes());
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
                .setWorkPhoneNumber(businessPhoneNumber)
                .clickSSS()
                .setSSS(sss)
                .checkSalary()
                .clickUsePresentAddress();

        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatus()), employmentStatus.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employerOrBusinessName()), employerOrBusinessName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPosition()), occupationOrPosition.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustry()), businessIndustry.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessAddress1()), businessAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().sourceOfFunds()), "Salary");
    }

    @Test(dependsOnMethods = "verifyReviewFinancialInformationWithCompanyTest")
    public void verifyIssueNumber26Test() {
        String workPhoneNumber = String.format("%s-%s", businessPhoneNumberAreaCode, businessPhoneNumber);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workPhoneNumber()), workPhoneNumber);
    }

    @Test(dependsOnMethods = "verifyIssueNumber26Test")
    public void verifyIssueNumber24Test() {
        String businessAddress2 = String.format("%s, %s", businessCity, businessProvince);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessAddress2()), businessAddress2.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyIssueNumber24Test")
    public void verifyIssueNumber22Test() {
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));
    }
}

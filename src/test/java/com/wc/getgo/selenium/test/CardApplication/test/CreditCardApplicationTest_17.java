package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_17 extends Seleniumbase {

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
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();
    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationGroup = generateFakeData().occupationGroup();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Metro Manila";
    private String businessCity = "Marikina";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = "01324343";
    private String totalYearsInWorkOrBusiness = generateFakeData().yearsOfStay();
    private String sss = generateFakeData().sssNumber();
    private String grossAnnualIncome = generateFakeData().grossAnnualIncome();

    private String supSalutation = generateFakeData().supTitle();
    private String supFirstName = generateFakeData().firstName();
    private String supMiddleName = "Anda";
    private String supLastName = generateFakeData().lastName();
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
    public void verifyBugNumber43_RegistrationTest() {
        /** https://trello.com/c/fBwzSDyH/43-bug-credit-card-registration-review-application-unable-to-submit-form **/
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNotSure());
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
                .setPhoneNumberAreaCode(phoneNumberAreaCode)
                .setPhoneNumber(phoneNumber)
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
                .setGrossAnnualIncome(grossAnnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUsePresentAddress();

        assertFalse(cardApplication()
                .clickAvailSupplementaryCardYes()
                .setSupMobileNumberAreaCode(supMobileNumberAreaCode)
                .checkAgreement()
                .checkImNotARobot()
                .clickSubmitForm());
        assertTrue(cardApplication()
                .clickAvailSupplementaryCardNo()
                .clickSubmitForm());
    }

    @Test(dependsOnMethods = "verifyBugNumber43_RegistrationTest")
    public void verifyBugNumber41Test() {
        /** https://trello.com/c/zboLL4K9/41-bug-credit-card-edit-review-application-additional-options-error-the-supplementary-salutation-must-be-an-array-appeared-upon-sub **/
        assertTrue(reviewApplication().clickEditAdditionalOptions());
        assertTrue(reviewApplication()
                .clickAvailSupplementaryCardYes()
                .selectSupSalutation(supSalutation)
                .setSupFirstName(supFirstName)
                .setSupMiddleName(supMiddleName)
                .setSupLastName(supLastName)
                .selectSupBirthDate(generateFakeData().birthMonth(), generateFakeData().birthYear(), generateFakeData().birthDay())
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
                .clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }

    @Test(dependsOnMethods = "verifyBugNumber41Test")
    public void verifyBugNumber43_ReviewTest() {
        /** https://trello.com/c/fBwzSDyH/43-bug-credit-card-registration-review-application-unable-to-submit-form **/
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNotSure());
        assertTrue(banner().clickNext());

        assertTrue(cardApplication()
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
                .setPhoneNumberAreaCode(phoneNumberAreaCode)
                .setPhoneNumber(phoneNumber)
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
                .setGrossAnnualIncome(grossAnnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUsePresentAddress()
                .checkAgreement()
                .checkImNotARobot()
                .clickSubmitForm());
        assertTrue(reviewApplication().clickEditAdditionalOptions());
        assertFalse(reviewApplication()
                .clickAvailSupplementaryCardYes()
                .setSupMobileNumberAreaCode(supMobileNumberAreaCode)
                .clickSubmitForm());
        assertTrue(reviewApplication()
                .clickAvailSupplementaryCardNo()
                .clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

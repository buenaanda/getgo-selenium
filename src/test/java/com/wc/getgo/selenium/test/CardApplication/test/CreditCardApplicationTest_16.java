package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.AlertErrorMessage.alertErrorMessage;
import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_16 extends Seleniumbase {

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
    public void verifyBugNumber39Test() {
        /** https://trello.com/c/yiFKA8Bg/39-bug-edit-review-application-able-to-submit-invalid-inputs **/
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
                .clickCardDeliveryUsePresentAddress()
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
                .checkAgreement()
                .checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());

        assertTrue(reviewApplication().clickEditContactDetails());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByName('mob_area_code')[0].setAttribute('value', 'aaa')");
        js.executeScript("document.getElementsByName('mob_num')[0].setAttribute('value', 'aaaaaaa')");
        js.executeScript("document.getElementsByName('tel_area_code')[0].setAttribute('value', 'bbbb')");
        js.executeScript("document.getElementsByName('tel_num')[0].setAttribute('value', 'bbbbbbb')");

        assertTrue(reviewApplication().clickEditFinancialInformation());
        js.executeScript("document.getElementsByName('wtel_area_code')[0].setAttribute('value', 'cccc')");
        js.executeScript("document.getElementsByName('wtel_num')[0].setAttribute('value', 'ccccccc')");
        js.executeScript("document.getElementById('reviewsss').setAttribute('value', 'dddddddddd')");

        assertTrue(reviewApplication().clickEditAdditionalOptions());
        js.executeScript("document.getElementsByName('supmob_area_code[]')[0].setAttribute('value', 'fff')");
        js.executeScript("document.getElementsByName('supmob_num[]')[0].setAttribute('value', 'ggggggg')");
        js.executeScript("document.getElementsByName('suptel_area_code[]')[0].setAttribute('value', 'hhhh')");
        js.executeScript("document.getElementsByName('suptel_num[]')[0].setAttribute('value', 'iiiiiii')");
        js.executeScript("document.getElementById('supgsis').setAttribute('value', 'jjjjjjjjjjj')");
        js.executeScript("document.getElementsByName('supcreditlimit[]')[0].setAttribute('value', 'kkkkkkkkkkkk')");

        assertFalse(reviewApplication().clickSubmitForm());
        assertEquals(alertErrorMessage().getAlertErrorMessage(), "Warning: Please fill out all required fields and check the input fields again.\n" +
                "The Mobile Area Code format is invalid.\n" +
                "The Mobile Number format is invalid.\n" +
                "The Telephone Area Code format is invalid.\n" +
                "The Telephone Number format is invalid.\n" +
                "The Work Phone Area Code format is invalid.\n" +
                "The Work Phone Number format is invalid.\n" +
                "The SSS format is invalid.\n" +
                "The Supplementary: Mobile Area Code format is invalid.\n" +
                "The Supplementary: Mobile Number format is invalid.\n" +
                "The Supplementary: Telephone Area Code format is invalid.\n" +
                "The Supplementary: Telephone Number format is invalid.\n" +
                "The Supplementary: GSIS format is invalid.\n" +
                "The Supplementary: Credit Limit format is invalid.\n" +
                "Note: If you have an uploaded file, please check if it is still in the field.");

        assertTrue(cardApplication()
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber(businessPhoneNumber)
                .setSupGSIS(supGsis)
                .setSubLimit(subLimit)
                .checkAgreement()
                .checkImNotARobot()
                .clickSubmitForm());
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

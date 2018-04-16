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

public class DebitCardApplicationTest_14 extends Seleniumbase {

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
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Pangasinan";
    private String businessCity = "Alaminos";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String sss = generateFakeData().sssNumber();

    @Test
    public void debitCardApplicationTest() {
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
                .setPhoneNumberAreaCode(phoneNumberAreaCode)
                .setPhoneNumber(phoneNumber)
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
                .checkInvestment()
                .clickUsePresentAddress();

        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();
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

        assertFalse(reviewApplication().clickSubmitForm());
        assertEquals(alertErrorMessage().getAlertErrorMessage(), "Warning: Please fill out all required fields and check the input fields again.\n" +
                "The Mobile Area Code format is invalid.\n" +
                "The Mobile Number format is invalid.\n" +
                "The Telephone Area Code format is invalid.\n" +
                "The Telephone Number format is invalid.\n" +
                "The Work Phone Area Code format is invalid.\n" +
                "The Work Phone Number format is invalid.\n" +
                "The SSS format is invalid.\n" +
                "Note: If you have an uploaded file, please check if it is still in the field.");

        assertTrue(cardApplication()
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber(businessPhoneNumber)
                .setSSS(sss)
                .checkAgreement()
                .checkImNotARobot()
                .clickSubmitForm());

        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

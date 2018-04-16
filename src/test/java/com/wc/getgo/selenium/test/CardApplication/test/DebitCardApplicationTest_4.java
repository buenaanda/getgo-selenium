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

public class DebitCardApplicationTest_4 extends Seleniumbase {

    /** QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg **/

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Blue";
    private String lastName = generateFakeData().lastName();
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Bulacan Province";
    private String presentCity = "Meycauayan";
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Batanes";
    private String businessCity = "Sabtang";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String gsis = generateFakeData().gsisNumber();

    @Test
    public void verifyIssueNumber20Test() {
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
                .clickGSIS()
                .setGSIS(gsis)
                .selectEmploymentStatus("Student")
                .checkSalary()
                .clickUseWorkAddress();
        cardApplication().checkAgreement();
        cardApplication().checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());

        assertTrue(reviewApplication().clickEditFinancialInformation());
        assertFalse(reviewApplication()
                .selectEmploymentStatus(generateFakeData().employmentStatus())
                .setEmployerOrBusinessName(employerOrBusinessName)
                .selectOccupationOrPosition(occupationOrPosition)
                .selectBusinessIndustry(businessIndustry)
                .setBusinessAddress(businessAddress)
                .selectWorkProvince(businessProvince)
                .selectWorkCity(businessCity)
                .clickSubmitForm());
        String idPresentedErrorLocator = "//small[@data-bv-for='tinsssgsis']";
        assertEquals(seleniumExtension().getText("xpath", idPresentedErrorLocator), "Please choose a presented ID.");

        reviewApplication().clickGSIS().setGSIS(gsis);
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }

    @Test(dependsOnMethods = "verifyIssueNumber20Test")
    public void verifyIssueNumber40_47_50Test() {
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
                .clickGSIS()
                .setGSIS(gsis)
                .checkSalary()
                .clickUseWorkAddress()
                .checkAgreement();
        assertFalse(cardApplication().clickSubmitForm());
        cardApplication().checkAgreement().checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());
        sleep(180000);
        assertFalse(reviewApplication().clickSubmitForm());
        cardApplication()
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber(businessPhoneNumber)
                .checkAgreement()
                .checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());
        sleep(180000);
        assertFalse(reviewApplication().clickSubmitForm());
        assertEquals(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()), businessPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().workPhoneNumberTextfield()), businessPhoneNumber);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workCityDropdown()).toUpperCase(), businessCity.toUpperCase());
        cardApplication()
                .checkAgreement()
                .checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

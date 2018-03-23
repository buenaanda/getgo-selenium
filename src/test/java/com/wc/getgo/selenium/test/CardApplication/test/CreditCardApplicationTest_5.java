package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_5 extends Seleniumbase {

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
    private String presentProvince = "Bukidnon";
    private String presentCity = "Damulog";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Cagayan";
    private String permanentCity = "Aparri";
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
    private String businessProvince = "Camarines Norte";
    private String businessCity = "Vinzons";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String tin = generateFakeData().tin();
    private String totalYearsInWorkOrBusiness = generateFakeData().yearsOfStay();
    private String grossAnualIncome = generateFakeData().grossAnnualIncome();

    @Test
    public void verifyIssueNumber21Test() throws FindFailed {
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickYes());
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
                .clickTIN()
                .setTIN(tin)
                .setGrossAnnualIncome(grossAnualIncome)
                .checkPension()
                .clickExistingCreditCardholderYes()
                .selectCardBankName1("Banco De Oro")
                .setCreditCardNumber1(generateFakeData().creditCardNumber());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,950)", "");
        sleep(2000);

        cardApplication().clickUploadProofOfIncome();
        cardApplication().searchFile("proofOfIncome.jpg");
        cardApplication().clickFile("images/proofOfIncome.png");

        cardApplication().checkAgreement().checkImNotARobot();
        assertFalse(cardApplication().clickSubmitForm());

        String employmentStatusError = "//small[@data-bv-for='empbizstatus' and @data-bv-result='INVALID']";
        String billingAddressError = "//small[@data-bv-for='billingaddress' and @data-bv-result='INVALID']";
        String deliveryAddressError = "//small[@data-bv-for='deliveryaddress' and @data-bv-result='INVALID']";
        assertEquals(seleniumExtension().getText("xpath", employmentStatusError), "Please select a Employment status.");
        assertEquals(seleniumExtension().getText("xpath", billingAddressError), "Please select Billing Address.");
        assertEquals(seleniumExtension().getText("xpath", deliveryAddressError), "Please select delivery address.");

        cardApplication()
                .selectEmploymentStatus(employmentStatus)
                .clickBillingUsePresentAddress()
                .clickCardDeliveryUsePresentAddress()
                .clickSubmitForm();

        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }
}

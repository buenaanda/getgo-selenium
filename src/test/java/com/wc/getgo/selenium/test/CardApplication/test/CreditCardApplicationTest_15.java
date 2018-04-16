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

public class CreditCardApplicationTest_15 extends Seleniumbase {

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
    private String employmentStatus = "Retired";
    private String sss = generateFakeData().sssNumber();
    private String grossAnnualIncome = generateFakeData().grossAnnualIncome();
    private String cardName1ErrorLocator = "//*[@id=\"card_0\"]/div[1]/small[@data-bv-for='cardbankname[]' and @data-bv-result='INVALID']";
    private String cardNumber1ErrorLocator = "//*[@id=\"card_0\"]/div[2]/small[2][@data-bv-for='cardnumber[]' and @data-bv-result='INVALID']";
    private String cardName2ErrorLocator = "//*[@id=\"card_1\"]/div[1]/small[@data-bv-for='cardbankname[]' and @data-bv-result='INVALID']";
    private String cardNumber2ErrorLocator = "//*[@id=\"card_1\"]/div[2]/small[2][@data-bv-for='cardnumber[]' and @data-bv-result='INVALID']";


    @Test
    public void verifyBugNumber40_37Test() {
        /** https://trello.com/c/iumlHd3w/40-bug-edit-review-application-unable-to-submit-form **/
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickPlatinum());
        assertTrue(banner().clickApplyForPlatinum());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

        creditCardRegistration();

        assertTrue(reviewApplication().clickEditFinancialInformation());
        reviewApplication().clickExistingCreditCardholderYes().clickAdd();//2 credit card
        assertFalse(reviewApplication().clickSubmitForm());

        /** Verify BugNumber 37 **/
        /** https://trello.com/c/obiLXIfJ/37-bug-credit-card-display-error-when-submitting-blank-card-name-and-number **/
        assertEquals(seleniumExtension().getText("xpath", cardName1ErrorLocator), "The card bank name is required.");
        assertEquals(seleniumExtension().getText("xpath", cardNumber1ErrorLocator), "The card number is required.");
        assertEquals(seleniumExtension().getText("xpath", cardName2ErrorLocator), "The card bank name is required.");
        assertEquals(seleniumExtension().getText("xpath", cardNumber2ErrorLocator), "The card number is required.");


        reviewApplication().clickExistingCreditCardholderNo();
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());

        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickPlatinum());
        assertTrue(banner().clickApplyForPlatinum());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

        creditCardRegistration();

        assertTrue(reviewApplication().clickEditFinancialInformation());
        reviewApplication().clickExistingCreditCardholderYes();//1 credit card
        assertFalse(reviewApplication().clickSubmitForm());

        /** Verify BugNumber 37 **/
        /** https://trello.com/c/obiLXIfJ/37-bug-credit-card-display-error-when-submitting-blank-card-name-and-number **/
        assertEquals(seleniumExtension().getText("xpath", cardName1ErrorLocator), "The card bank name is required.");
        assertEquals(seleniumExtension().getText("xpath", cardNumber1ErrorLocator), "The card number is required.");

        reviewApplication().clickExistingCreditCardholderNo();
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }

    public void creditCardRegistration() {
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
                .setGrossAnnualIncome(grossAnnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUsePresentAddress()
                .checkAgreement()
                .checkImNotARobot();

        assertTrue(cardApplication().clickSubmitForm());
    }
}

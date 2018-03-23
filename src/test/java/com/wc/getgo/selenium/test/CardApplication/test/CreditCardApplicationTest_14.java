package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import java.text.ParseException;
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
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_14 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg

    private SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    private SimpleDateFormat birthDateFormat = new SimpleDateFormat("yyyy-MMM-dd");

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Middle";
    private String lastName = generateFakeData().lastName();
    private String nameToAppearOnCard = String.format("%s %s %s", firstName, middleName.substring(0, 1), lastName);
    private String birthMonth = generateFakeData().birthMonth();
    private String birthYear = generateFakeData().birthYear();
    private String birthDay = generateFakeData().birthDay();
    private String actualDate = String.format("%s-%s-%s", birthYear, birthMonth, birthDay);
    private Date date = birthDateFormat.parse(actualDate);
    private String birthDate = String.format("%s-%s-%s", birthYear, monthFormat.format(date), birthDay);
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = "CAPE VERDE";//CPV
    private String civilStatus = generateFakeData().civilStatus();
    private String mothersMaidenName = String.format("%s %s", generateFakeData().firstName(), generateFakeData().lastName());

    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Rizal Province";
    private String presentCity = "Cainta";
    private String presentPostalCode = "1900";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Metro Manila";
    private String permanentCity = "Navotas City";
    private String permanentPostalCode = "1409";
    private String homeOwnersip = generateFakeData().homeOwnership();
    private String yearsOfStay = generateFakeData().yearsOfStay();
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = "0008389";
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationGroup = generateFakeData().occupationGroup();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Tarlac";
    private String businessCity = "Concepcion";
    private String businessPostalCode = "2316";
    private String totalYearsInWork = generateFakeData().yearsOfStay();
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String tin = generateFakeData().tin();
    private String grossAnnualIncome = generateFakeData().grossAnnualIncome();

    private String bankName1 = "UNIONBANK OF THE PHILIPPINES";//UBP
    private String cardNumber1 = generateFakeData().creditCardNumber();
    private String bankName2 = "DINERS CLUB";//DINERS
    private String cardNumber2 = generateFakeData().creditCardNumber();

    private String supSalutation = generateFakeData().supTitle();
    private String supFirstName = generateFakeData().firstName();
    private String supMiddleName = "Lany";
    private String supLastName = generateFakeData().lastName();
    private String supNameToAppearOnCard = String.format("%s %s %s", supFirstName, supMiddleName.substring(0, 1), supLastName);
    private String supBirthMonth = generateFakeData().birthMonth();
    private String supBirthYear = generateFakeData().birthYear();
    private String supBirthDay = generateFakeData().birthDay();
    private String supActualDate = String.format("%s-%s-%s", supBirthYear, supBirthMonth, supBirthDay);
    private Date supDate = birthDateFormat.parse(supActualDate);
    private String supBirthDate = String.format("%s-%s-%s", supBirthYear, monthFormat.format(supDate), supBirthDay);
    private String relationshipWithThePrincipal = generateFakeData().relationshipWithPrincipal();
    private String supPresentAddress = generateFakeData().address();
    private String supPermanentAddress = generateFakeData().address();
    private String supEmailAddress = generateFakeData().email();
    private String supMobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String supMobileNumber = generateFakeData().mobileNumber();
    private String supPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String supPhoneNumber = generateFakeData().phoneNumber();
    private String supSSS = generateFakeData().sssNumber();
    private String subLimit = generateFakeData().subLimitAmount();

    private String updatedTitle = generateFakeData().title();
    private String updatedFirstName = generateFakeData().firstName();
    private String updatedMiddleName = "Final";
    private String updatedLastName = generateFakeData().lastName();
    private String updatedNameToAppearOnCard = String.format("%s %s", updatedFirstName, updatedLastName);
    private String updatedBirthMonth = generateFakeData().birthMonth();
    private String updatedBirthYear = generateFakeData().birthYear();
    private String updatedBirthDay = generateFakeData().birthDay();
    private String updatedActualDate = String.format("%s-%s-%s", updatedBirthYear, updatedBirthMonth, updatedBirthDay);
    private Date updatedDate = birthDateFormat.parse(updatedActualDate);
    private String updatedBirthDate = String.format("%s-%s-%s", updatedBirthYear, monthFormat.format(updatedDate), updatedBirthDay);
    private String updatedPlaceOfBirth = generateFakeData().placeOfBirth();
    private String updatedNationalityOrCitizenship = "ALGERIA";//DZA
    private String updatedCivilStatus = generateFakeData().civilStatus();
    private String updateMothersMaidenName = String.format("%s %s", generateFakeData().firstName(), generateFakeData().lastName());

    private String updatedPresentAddress = generateFakeData().address();
    private String updatedPresentProvince = "Metro Manila";
    private String updatedPresentCity = "Kalookan City";
    private String updatedPresentPostalCode = "1400";
    private String updatedPermanentAddress = generateFakeData().address();
    private String updatedPermanentProvince = "Metro Manila";
    private String updatedPermanentCity = "Mandaluyong City";
    private String updatedPermanentPostalCode = "1550";
    private String updatedHomeOwnership = generateFakeData().homeOwnership();
    private String updatedYearsOfStay = generateFakeData().yearsOfStay();
    private String updatedEmailAddress = generateFakeData().email();
    private String updatedMobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String updatedMobileNumber = generateFakeData().mobileNumber();
    private String updatedPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String updatedPhoneNumber = generateFakeData().phoneNumber();

    private String updatedEmploymentStatus = generateFakeData().employmentStatus();
    private String updatedEmployerOrBusinessName = generateFakeData().companyName();
    private String updatedOccupationGroup = generateFakeData().occupationGroup();
    private String updatedOccupationOrPosition = generateFakeData().occupation();
    private String updatedBusinessIndustry = generateFakeData().businessIndustry();
    private String updatedBusinessAddress = generateFakeData().address();
    private String updatedBusinessProvince = "Metro Manila";
    private String updatedBusinessCity = "Taguig";
    private String updatedBusinessPostalCode = "1630";
    private String updatedTotalYearsInWork = generateFakeData().yearsOfStay();
    private String updatedBusinessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String updatedBusinessPhoneNumber = generateFakeData().phoneNumber();
    private String sss = generateFakeData().sssNumber();
    private String updatedGrossAnnualIncome = generateFakeData().grossAnnualIncome();
    private String others = "Lending";

    private String updatedBankName1 = "MAYBANK";//MPI
    private String updatedCardNumber1 = generateFakeData().creditCardNumber();
    private String updatedBankName2 = "SECURITY BANK";//SB
    private String updatedCardNumber2 = generateFakeData().creditCardNumber();

    private String updatedSupSalutation = generateFakeData().supTitle();
    private String updatedSupFirstName = generateFakeData().firstName();
    private String updatedSupMiddleName = "Lany";
    private String updatedSupLastName = generateFakeData().lastName();
    private String updatedSupNameToAppearOnCard = String.format("%s %s", updatedSupFirstName, updatedSupLastName);
    private String updatedSupBirthMonth = generateFakeData().birthMonth();
    private String updatedSupBirthYear = generateFakeData().birthYear();
    private String updatedSupBirthDay = generateFakeData().birthDay();
    private String updatedSupActualDate = String.format("%s-%s-%s", supBirthYear, supBirthMonth, supBirthDay);
    private Date updatedSupDate = birthDateFormat.parse(updatedSupActualDate);
    private String updatedSupBirthDate = String.format("%s-%s-%s", supBirthYear, monthFormat.format(supDate), supBirthDay);
    private String updatedRelationshipWithThePrincipal = generateFakeData().relationshipWithPrincipal();
    private String updatedSupPresentAddress = generateFakeData().address();
    private String updatedSupPermanentAddress = generateFakeData().address();
    private String updatedSupEmailAddress = generateFakeData().email();
    private String updatedSupMobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String updatedSupMobileNumber = generateFakeData().mobileNumber();
    private String updatedSupPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String updatedSupPhoneNumber = generateFakeData().phoneNumber();
    private String supTin = generateFakeData().tin();
    private String updatedSubLimit = generateFakeData().subLimitAmount();

    public CreditCardApplicationTest_14() throws ParseException {
    }

    @Test
    public void creditCardApplicationTest() throws FindFailed {
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickApplyForGold());
        assertTrue(banner().clickNotSure());
        assertTrue(banner().clickNext());

        cardApplication()
                .selectSalutation(title)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .selectBirthDate(birthMonth, birthYear, birthDay)
                .setPlaceOfBirth(placeOfBirth)
                .selectNationalityOrCitizenship(nationalityOrCitizenship)
                .selectCivilStatus(civilStatus)
                .setMothersMaidenName(mothersMaidenName)
                .setPresentAddress(presentAddress)
                .selectPresentProvince(presentProvince)
                .selectPresentCity(presentCity)
                .selectHomeOwnership(homeOwnersip)
                .setYearsOfStay(yearsOfStay)
                .setPermanentAddress(permanentAddress)
                .selectPermanentProvince(permanentProvince)
                .selectPermanentCity(permanentCity)
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
                .setTotalYearsInWorkOrBusiness(totalYearsInWork)
                .setWorkPhoneNumberAreaCode(businessPhoneNumberAreaCode)
                .setWorkPhoneNumber(businessPhoneNumber)
                .clickTIN()
                .setTIN(tin)
                .setGrossAnnualIncome(grossAnnualIncome)
                .checkInvestment()
                .clickExistingCreditCardholderYes()
                .selectCardBankName1(bankName1)
                .setCreditCardNumber1(cardNumber1)
                .clickAdd()
                .selectCardBankName2(bankName2)
                .setCreditCardNumber2(cardNumber2);

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        sleep(1000);

        cardApplication()
                .clickUploadProofOfIncome().searchFile("proofOfIncome.jpg").clickFile("images/proofOfIncome.png");

        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        sleep(1000);

        cardApplication()
                .clickUploadAcceptableIds().searchFile("validID.jpg").clickFile("images/validID.png");*/

        cardApplication()
                .clickBillingUsePresentAddress()
                .clickCardDeliveryUsePresentAddress()
                /*.clickAvailSupplementaryCardYes()
                .selectSupSalutation(supSalutation)
                .setSupFirstName(supFirstName)
                .setSupMiddleName(supMiddleName)
                .setSupLastName(supLastName)
                .selectSupBirthDate(supBirthMonth, supBirthYear, supBirthDay)
                .setRelationshipWithPrincipal(relationshipWithThePrincipal)
                .setSupPresentAddress(supPresentAddress)
                .setSupPermanentAddress(supPermanentAddress)
                .setSupEmailAddress(supEmailAddress)
                .setSupMobileNumberAreaCode(supMobileNumberAreaCode)
                .setSupMobileNumber(supMobileNumber)
                .setSupPhoneNumberAreaCode(supPhoneNumberAreaCode)
                .setSupPhoneNumber(supPhoneNumber)
                .clickSupSSS()
                .setSupSSS(supSSS)
                .setSubLimit(subLimit)*/
                .checkAgreement();
        cardApplication().checkImNotARobot();
        cardApplication().clickSubmitForm();
    }

    @Test(dependsOnMethods = "creditCardApplicationTest")
    public void verifyEditPersonalInformationTest() {
        reviewApplication().clickEditPersonalInformation();
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().selectedSalutation()), title);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().firstNameTextfield()), firstName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().middleNameTextfield()), middleName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().lastNameTextfield()), lastName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nameToAppearOnCardTextfield()), nameToAppearOnCard.toUpperCase());
        if(birthDay.length() == 1) {
            birthDate = String.format("%s-%s-0%s", birthYear, monthFormat.format(date), birthDay);
        }
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().birthdateTextfield()), birthDate);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().placeOfBirthTextfield()), placeOfBirth.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nationalityOrCitizenshipDropdown()), "CPV");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().civilStatusDropdown()).toUpperCase(), civilStatus.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mothersMaidenNameTextfield()), mothersMaidenName.toUpperCase());

        reviewApplication()
                .selectSalutation(updatedTitle)
                .setFirstName(updatedFirstName)
                .setMiddleName(updatedMiddleName)
                .setLastName(updatedLastName)
                .setNameToAppearOnCard(updatedNameToAppearOnCard)
                .selectBirthDate(updatedBirthMonth, updatedBirthYear, updatedBirthDay)
                .setPlaceOfBirth(updatedPlaceOfBirth)
                .selectNationalityOrCitizenship(updatedNationalityOrCitizenship)
                .selectCivilStatus(updatedCivilStatus)
                .setMothersMaidenName(updateMothersMaidenName);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().selectedSalutation()), updatedTitle);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().firstNameTextfield()), updatedFirstName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().middleNameTextfield()), updatedMiddleName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().lastNameTextfield()), updatedLastName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nameToAppearOnCardTextfield()), updatedNameToAppearOnCard.toUpperCase());
        if(updatedBirthDay.length() == 1) {
            updatedBirthDate = String.format("%s-%s-0%s", updatedBirthYear, monthFormat.format(updatedDate), updatedBirthDay);
        }
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().birthdateTextfield()), updatedBirthDate);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().placeOfBirthTextfield()), updatedPlaceOfBirth.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nationalityOrCitizenshipDropdown()),  "DZA");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().civilStatusDropdown()), updatedCivilStatus.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mothersMaidenNameTextfield()), updateMothersMaidenName.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyEditPersonalInformationTest")
    public void verifyEditContactDetailsTest() {
        reviewApplication().clickEditContactDetails();
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().presentAddressTextfield()), presentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentProvinceDropdown()), presentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentCityDropdown()), presentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().presentPostalCodeTextfield()), presentPostalCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().permanentAddressTextfield()), permanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentProvinceDropdown()), permanentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentCityDropdown()), permanentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().permanentPostalCodeTextfield()), permanentPostalCode);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().homeOwnershipDropdown()), homeOwnersip);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().yearsOfStayTextfield()), yearsOfStay);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().emailAddressTextfield()), emailAddress);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()), mobileNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberTextfield()), mobileNumber);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()), phoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberTextfield()), phoneNumber);

        reviewApplication()
                .setPresentAddress(updatedPresentAddress)
                .selectPresentProvince(updatedPresentProvince)
                .selectPresentCity(updatedPresentCity)
                .setPermanentAddress(updatedPermanentAddress)
                .selectPermanentProvince(updatedPermanentProvince)
                .selectPermanentCity(updatedPermanentCity)
                .selectHomeOwnership(updatedHomeOwnership)
                .setYearsOfStay(updatedYearsOfStay)
                .setEmailAddress(updatedEmailAddress)
                .setMobileNumberAreaCode(updatedMobileNumberAreaCode)
                .setMobileNumber(updatedMobileNumber)
                .setPhoneNumberAreaCode(updatedPhoneNumberAreaCode)
                .setPhoneNumber(updatedPhoneNumber);

        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().presentAddressTextfield()), updatedPresentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentProvinceDropdown()), updatedPresentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentCityDropdown()), updatedPresentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().presentPostalCodeTextfield()), updatedPresentPostalCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().permanentAddressTextfield()), updatedPermanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentProvinceDropdown()), updatedPermanentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentCityDropdown()), updatedPermanentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().permanentPostalCodeTextfield()), updatedPermanentPostalCode);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().homeOwnershipDropdown()), updatedHomeOwnership);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().yearsOfStayTextfield()), updatedYearsOfStay);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().emailAddressTextfield()), updatedEmailAddress);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()), updatedMobileNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberTextfield()), updatedMobileNumber);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()), updatedPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberTextfield()), updatedPhoneNumber);
    }

    @Test(dependsOnMethods = "verifyEditContactDetailsTest")
    public void verifyEditFinancialInformationTest() {
        reviewApplication().clickEditFinancialInformation();
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatusDropdown()), employmentStatus.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().employerOrBusinessNameTextfield()), employerOrBusinessName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationGroupDropdown()), occupationGroup.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPositionDropdown()), occupationOrPosition.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustryDropdown()), businessIndustry.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().businessAddressTextfield()), businessAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workProvinceDropdown()), businessProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workCityDropdown()), businessCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().totalYearsInWorkOrBusinessTextfield()), totalYearsInWork);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPostCodeTextfield()), businessPostalCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()), businessPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberTextfield()), businessPhoneNumber);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().grossAnnualIncomeTextfield()), grossAnnualIncome);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().tinRadioButton()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().tinTextfield()), tin);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().investmentCheckbox()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().cardBankName1Dropdown()), "UBP");
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().creditCardNumber1Textfield()), cardNumber1);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().cardBankName2Dropdown()), "DINERS");
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().creditCardNumber2Textfield()), cardNumber2);

        reviewApplication()
                .selectEmploymentStatus(updatedEmploymentStatus)
                .setEmployerOrBusinessName(updatedEmployerOrBusinessName)
                .selectOccupationGroup(occupationGroup)
                .selectOccupationOrPosition(updatedOccupationOrPosition)
                .selectBusinessIndustry(updatedBusinessIndustry)
                .setBusinessAddress(updatedBusinessAddress)
                .selectWorkProvince(updatedBusinessProvince)
                .selectWorkCity(updatedBusinessCity)
                .setTotalYearsInWorkOrBusiness(updatedTotalYearsInWork)
                .setWorkPhoneNumberAreaCode(updatedBusinessPhoneNumberAreaCode)
                .setWorkPhoneNumber(updatedBusinessPhoneNumber)
                .setGrossAnnualIncome(updatedGrossAnnualIncome)
                .clickSSS()
                .setSSS(sss)
                .uncheckInvestment()
                .checkOthers()
                .setOthers(others)
                .selectCardBankName1(updatedBankName1)
                .setCreditCardNumber1(updatedCardNumber1)
                .selectCardBankName2(updatedBankName2)
                .setCreditCardNumber2(updatedCardNumber2);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatusDropdown()), updatedEmploymentStatus.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().employerOrBusinessNameTextfield()), updatedEmployerOrBusinessName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationGroupDropdown()), updatedOccupationGroup.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPositionDropdown()), updatedOccupationOrPosition.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustryDropdown()), updatedBusinessIndustry.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().businessAddressTextfield()), updatedBusinessAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workProvinceDropdown()), updatedBusinessProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workCityDropdown()), updatedBusinessCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().totalYearsInWorkOrBusinessTextfield()), updatedTotalYearsInWork);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPostCodeTextfield()), updatedBusinessPostalCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()), updatedBusinessPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberTextfield()), updatedBusinessPhoneNumber);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().grossAnnualIncomeTextfield()), updatedGrossAnnualIncome);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().tinRadioButton()).isUnselected());
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().sssRadioButton()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().sssTextfield()), sss);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().investmentCheckbox()).isUnselected());
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().othersCheckbox()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().othersTextfield()), others);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().cardBankName1Dropdown()), "MPI");
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().creditCardNumber1()), updatedCardNumber1);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().cardBankName2Dropdown()), "SB");
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().creditCardNumber2()), updatedCardNumber2);
    }

    /*@Test(dependsOnMethods = "verifyEditFinancialInformationTest")
    public void verifyEditUploadDocumentsTest() throws FindFailed {
        reviewApplication().clickEditUploadDocuments();
        cardApplication()
                .clickUploadAcceptableIds().searchFile("validID.jpg").clickFile("images/validID.png");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)", "");
        sleep(1000);

        cardApplication()
                .clickUploadProofOfIncome().searchFile("proofOfIncome.jpg").clickFile("images/proofOfIncome.png");
    }

    @Test(dependsOnMethods = "verifyEditUploadDocumentsTest")
    public void verifyEditOtherInstructionsTest() {
        reviewApplication().clickEditOtherInstructions();
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().useBillingPresentAddressRadioButton()).isSelected());
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().useDeliveryPresentAddressRadioButton()).isSelected());

        reviewApplication().clickBillingWorkAddress().clickDeliveryWorkAddress();
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().useBillingWorkAddressRadioButton()).isSelected());
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().useDeliveryWorkAddressRadioButton()).isSelected());
    }

    @Test(dependsOnMethods = "verifyEditOtherInstructionsTest")
    public void verifyEditAdditionalOptionsTest() {
        reviewApplication().clickEditAdditionalOptions();
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().selectedSupSalutation()), supSalutation);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryFirstNameTextfield()), supFirstName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryMiddleNameTextfield()), supMiddleName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryLastNameTextfield()), supLastName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supNameToAppearOnCardTextfield()), supNameToAppearOnCard.toUpperCase());
        if(supBirthDay.length() == 1) {
            supBirthDate = String.format("%s-%s-0%s", supBirthYear, monthFormat.format(supDate), supBirthDay);
        }
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryBirthdateTextfield()), supBirthDate);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().relationshipWithPrincipalTextfield()), relationshipWithThePrincipal.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPresentAddressTextfield()), supPresentAddress.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPermanentAddressTextfield()), supPermanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryEmailAddressTextfield()), supEmailAddress.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryMobileNumberAreaCodeTextfield()), supMobileNumberAreaCode.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryMobileNumberTextfield()), supMobileNumber.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPhoneNumberAreaCodeTextfield()), supPhoneNumberAreaCode.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementarySssTextfield()), supSSS);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().subCreditLimit()), subLimit);

        cardApplication()
                .clickBillingUsePresentAddress()
                .selectSupSalutation(updatedSupSalutation)
                .setSupFirstName(updatedSupFirstName)
                .setSupMiddleName(updatedSupMiddleName)
                .setSupLastName(updatedSupLastName)
                .setSupNameToAppearOnCard(updatedSupNameToAppearOnCard)
                .selectSupBirthDate(updatedSupBirthMonth, updatedSupBirthYear, updatedSupBirthDay)
                .setRelationshipWithPrincipal(updatedRelationshipWithThePrincipal)
                .setSupPresentAddress(updatedSupPresentAddress)
                .setSupPermanentAddress(updatedSupPermanentAddress)
                .setSupEmailAddress(updatedSupEmailAddress)
                .setSupMobileNumberAreaCode(updatedSupMobileNumberAreaCode)
                .setSupMobileNumber(updatedSupMobileNumber)
                .setSupPhoneNumberAreaCode(updatedSupPhoneNumberAreaCode)
                .setSupPhoneNumber(updatedSupPhoneNumber)
                .clickTIN()
                .setSupTIN(supTin)
                .setSubLimit(updatedSubLimit);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().selectedSupSalutation()), updatedSupSalutation);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryFirstNameTextfield()), updatedSupFirstName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryMiddleNameTextfield()), updatedSupMiddleName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryLastNameTextfield()), updatedSupLastName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supNameToAppearOnCardTextfield()), updatedSupNameToAppearOnCard.toUpperCase());
        if(supBirthDay.length() == 1) {
            supBirthDate = String.format("%s-%s-0%s", updatedSupBirthMonth, monthFormat.format(updatedSupDate), updatedSupBirthDay);
        }
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryBirthdateTextfield()), updatedSupBirthDate);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().relationshipWithPrincipalTextfield()), updatedRelationshipWithThePrincipal.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPresentAddressTextfield()), updatedSupPresentAddress.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPermanentAddressTextfield()), updatedSupPermanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryEmailAddressTextfield()), updatedSupEmailAddress.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryMobileNumberAreaCodeTextfield()), updatedSupMobileNumberAreaCode.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryMobileNumberTextfield()), updatedSupMobileNumber.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPhoneNumberAreaCodeTextfield()), updatedSupPhoneNumberAreaCode.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryPhoneNumberTextfield()), updatedSupPhoneNumber.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().supplementaryTinTextfield()), supTin);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().subCreditLimit()), updatedSubLimit);
    }

    @Test(dependsOnMethods = "verifyEditAdditionalOptionsTest")
    public void submitApplicationTest() {
        reviewApplication().clickSubmitForm();
        reviewApplication().clickContinue();
    }*/
}

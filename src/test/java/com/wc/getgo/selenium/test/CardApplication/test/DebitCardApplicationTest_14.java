package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DebitCardApplicationTest_14 extends Seleniumbase {

    //QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg

    private SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    private SimpleDateFormat birthDateFormat = new SimpleDateFormat("yyyy-MMM-dd");

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Rogers";
    private String lastName = generateFakeData().lastName();
    private String middleInitial = middleName.substring(0, 1);
    private String nameToAppearOnCard = String.format("%s %s %s", firstName, middleInitial, lastName);
    private String birthMonth = generateFakeData().birthMonth();
    private String birthYear = generateFakeData().birthYear();
    private String birthDay = generateFakeData().birthDay();
    private String actualDate = String.format("%s-%s-%s", birthYear, birthMonth, birthDay);
    private Date date = birthDateFormat.parse(actualDate);
    private String birthDate = String.format("%s-%s-%s", birthYear, monthFormat.format(date), birthDay);
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();

    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Rizal Province";
    private String presentCity = "Cainta";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Metro Manila";
    private String permanentCity = "Navotas City";
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = "0008389";
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Tarlac";
    private String businessCity = "Concepcion";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String tin = generateFakeData().tin();

    private String updatedTitle = generateFakeData().title();
    private String updatedFirstName = generateFakeData().firstName();
    private String updatedMiddleName = "Years";
    private String updatedLastName = generateFakeData().lastName();
    private String updatedNameToAppearOnCard = String.format("%s %s", updatedFirstName, updatedLastName);
    private String updatedBirthMonth = generateFakeData().birthMonth();
    private String updatedBirthYear = generateFakeData().birthYear();
    private String updatedBirthDay = generateFakeData().birthDay();
    private String updatedActualDate = String.format("%s-%s-%s", updatedBirthYear, updatedBirthMonth, updatedBirthDay);
    private Date updatedDate = birthDateFormat.parse(updatedActualDate);
    private String updatedBirthDate = String.format("%s-%s-%s", updatedBirthYear, monthFormat.format(updatedDate), updatedBirthDay);
    private String updatedPlaceOfBirth = generateFakeData().placeOfBirth();
    private String updatedNationalityOrCitizenship = generateFakeData().nationality();
    private String updatedCivilStatus = generateFakeData().civilStatus();
    private String updatedPresentAddress = generateFakeData().address();
    private String updatedPresentProvince = "Metro Manila";
    private String updatedPresentCity = "Kalookan City";
    private String updatedPermanentAddress = generateFakeData().address();
    private String updatedPermanentProvince = "Metro Manila";
    private String updatedPermanentCity = "Mandaluyong City";
    private String updatedEmailAddress = generateFakeData().email();
    private String updatedMobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String updatedMobileNumber = generateFakeData().mobileNumber();
    private String updatedPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String updatedPhoneNumber = generateFakeData().phoneNumber();

    private String updatedEmploymentStatus = generateFakeData().employmentStatus();
    private String updatedEmployerOrBusinessName = generateFakeData().companyName();
    private String updatedOccupationOrPosition = generateFakeData().occupation();
    private String updatedBusinessIndustry = generateFakeData().businessIndustry();
    private String updatedBusinessAddress = generateFakeData().address();
    private String updatedBusinessProvince = "Metro Manila";
    private String updatedBusinessCity = "Taguig";
    private String updatedBusinessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String updatedBusinessPhoneNumber = generateFakeData().phoneNumber();
    private String sss = generateFakeData().sssNumber();
    private String others = "Lending";

    public DebitCardApplicationTest_14() throws ParseException {
    }

    @Test
    public void debitCardApplicationTest() {
        assertTrue(navigationMenu().clickDebitCard());
        assertTrue(banner().clickDebitCardApplyNow());
        assertTrue(banner().clickYes());
        assertTrue(banner().clickNext());

        cardApplication()
                .selectSalutation(title)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .selectBirthDate(birthMonth, birthYear, birthDay)
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
                .clickTIN()
                .setTIN(tin)
                .checkInvestment()
                .clickUsePresentAddress()
                .checkAgreement();

        cardApplication().checkImNotARobot();
        assertTrue(cardApplication().clickSubmitForm());
    }

    @Test(dependsOnMethods = "debitCardApplicationTest")
    public void verifyEditPersonalInformationTest() {
        reviewApplication().clickEditPersonalInformation();
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().selectedSalutation()),  title);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().firstNameTextfield()),  firstName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().middleNameTextfield()),  middleName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().lastNameTextfield()),  lastName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nameToAppearOnCardTextfield()),  nameToAppearOnCard.toUpperCase());
        if(birthDay.length() == 1) {
            birthDate = String.format("%s-%s-0%s", birthYear, monthFormat.format(date), birthDay);
        }
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().birthdateTextfield()),  birthDate);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().placeOfBirthTextfield()),  placeOfBirth.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nationalityOrCitizenshipTextfield()),  nationalityOrCitizenship.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().civilStatusDropdown()),  civilStatus.toUpperCase());

        reviewApplication()
                .selectSalutation(updatedTitle)
                .setFirstName(updatedFirstName)
                .setMiddleName(updatedMiddleName)
                .setLastName(updatedLastName)
                .setNameToAppearOnCard(updatedNameToAppearOnCard)
                .selectBirthDate(updatedBirthMonth, updatedBirthYear, updatedBirthDay)
                .setPlaceOfBirth(updatedPlaceOfBirth)
                .setNationalityOrCitizenship(updatedNationalityOrCitizenship)
                .selectCivilStatus(updatedCivilStatus);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().selectedSalutation()),  updatedTitle);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().firstNameTextfield()),  updatedFirstName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().middleNameTextfield()),  updatedMiddleName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().lastNameTextfield()),  updatedLastName.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nameToAppearOnCardTextfield()),  updatedNameToAppearOnCard.toUpperCase());
        if(updatedBirthDay.length() == 1) {
            updatedBirthDate = String.format("%s-%s-0%s", updatedBirthYear, monthFormat.format(updatedDate), updatedBirthDay);
        }
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().birthdateTextfield()),  updatedBirthDate);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().placeOfBirthTextfield()),  updatedPlaceOfBirth.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().nationalityOrCitizenshipTextfield()),  updatedNationalityOrCitizenship.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().civilStatusDropdown()),  updatedCivilStatus.toUpperCase());
    }

    @Test(dependsOnMethods = "debitCardApplicationTest")
    public void verifyEditContactDetailsTest() {
        reviewApplication().clickEditContactDetails();
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().presentAddressTextfield()),  presentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentProvinceDropdown()),  presentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentCityDropdown()),  presentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().permanentAddressTextfield()),  permanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentProvinceDropdown()),  permanentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentCityDropdown()),  permanentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().emailAddressTextfield()),  emailAddress);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()),  mobileNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberTextfield()),  mobileNumber);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()),  phoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberTextfield()),  phoneNumber);

        reviewApplication()
                .setPresentAddress(updatedPresentAddress)
                .selectPresentProvince(updatedPresentProvince)
                .selectPresentCity(updatedPresentCity)
                .setPermanentAddress(updatedPermanentAddress)
                .selectPermanentProvince(updatedPermanentProvince)
                .selectPermanentCity(updatedPermanentCity)
                .setEmailAddress(updatedEmailAddress)
                .setMobileNumberAreaCode(updatedMobileNumberAreaCode)
                .setMobileNumber(updatedMobileNumber)
                .setPhoneNumberAreaCode(updatedPhoneNumberAreaCode)
                .setPhoneNumber(updatedPhoneNumber);


        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().presentAddressTextfield()),  updatedPresentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentProvinceDropdown()),  updatedPresentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentCityDropdown()),  updatedPresentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().permanentAddressTextfield()),  updatedPermanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentProvinceDropdown()),  updatedPermanentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentCityDropdown()),  updatedPermanentCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().emailAddressTextfield()),  updatedEmailAddress);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()),  updatedMobileNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberTextfield()),  updatedMobileNumber);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()),  updatedPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberTextfield()),  updatedPhoneNumber);
    }

    @Test(dependsOnMethods = "debitCardApplicationTest")
    public void verifyEditFinancialInformationTest() {
        reviewApplication().clickEditFinancialInformation();
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatusDropdown()),  employmentStatus.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().employerOrBusinessNameTextfield()),  employerOrBusinessName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPositionDropdown()),  occupationOrPosition.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustryDropdown()),  businessIndustry.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().businessAddressTextfield()),  businessAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workProvinceDropdown()),  businessProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workCityDropdown()),  businessCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()),  businessPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberTextfield()), businessPhoneNumber);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().tinRadioButton()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().tinTextfield()),  tin);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().investmentCheckbox()).isSelected());

        reviewApplication()
                .selectEmploymentStatus(updatedEmploymentStatus)
                .setEmployerOrBusinessName(updatedEmployerOrBusinessName)
                .selectOccupationOrPosition(updatedOccupationOrPosition)
                .selectBusinessIndustry(updatedBusinessIndustry)
                .setBusinessAddress(updatedBusinessAddress)
                .selectWorkProvince(updatedBusinessProvince)
                .selectWorkCity(updatedBusinessCity)
                .setWorkPhoneNumberAreaCode(updatedBusinessPhoneNumberAreaCode)
                .setWorkPhoneNumber(updatedBusinessPhoneNumber)
                .clickSSS()
                .setSSS(sss)
                .uncheckInvestment()
                .checkOthers()
                .setOthers(others);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatusDropdown()),  updatedEmploymentStatus.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().employerOrBusinessNameTextfield()),  updatedEmployerOrBusinessName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPositionDropdown()),  updatedOccupationOrPosition.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustryDropdown()),  updatedBusinessIndustry.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().businessAddressTextfield()),  updatedBusinessAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workProvinceDropdown()),  updatedBusinessProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workCityDropdown()),  updatedBusinessCity.toUpperCase());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()),  updatedBusinessPhoneNumberAreaCode);
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberTextfield()), updatedBusinessPhoneNumber);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().sssRadioButton()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().sssTextfield()),  sss);
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().investmentCheckbox()).isUnselected());
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().othersCheckbox()).isSelected());
        assertEquals(seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().othersTextfield()), others.toUpperCase());
    }

    @Test(dependsOnMethods = "debitCardApplicationTest")
    public void verifyEditOtherInstructionsTest() {
        reviewApplication().clickEditOtherInstructions();
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().usePresentAddressRadioButton()).isSelected());

        reviewApplication().clickUseWorkAddress();
        assertTrue(seleniumExtension().xpath(locatorsReviewApplicationPage().useWorkAddressRadioButton()).isSelected());
    }

    @Test(dependsOnMethods = "verifyEditOtherInstructionsTest")
    public void submitApplicationTest() {
        reviewApplication().clickSubmitForm();
        reviewApplication().clickContinue();
    }
}

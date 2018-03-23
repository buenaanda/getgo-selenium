package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class DebitCardApplicationTest extends Seleniumbase {

    private String specialNumericalCharacters = "123!@#$%^&**";
    private String alpha = "qwerty";
    private String firstName = generateFakeData().firstName();
    private String middleName = "Garcia";
    private String lastName = generateFakeData().lastName();
    private String birthMonth = "Aug";
    private String birthMonth2 = "08";
    private String birthYear = "1993";
    private String birthDay = "30";
    private String birthdate = String.format("%s-%s-%s", birthYear, birthMonth2, birthDay);
    private String presentProvince = "Metro Manila";
    private String presentCity = "Valenzuela";
    private String permanentProvince = "Nueva Ecija";
    private String permanentCity = "Cuyapo";
    private String emailAddress = generateFakeData().email();
    private String occupation = "PILOT";
    private String businessIndustry = generateFakeData().businessIndustry();
    private String workProvince = "Antique";
    private String workCity = "Culasi";
    private String othersTextfieldXpathWithClassLocator =  locatorsCardApplicationPage().othersTextfieldClass();
    private static Calendar cal = Calendar.getInstance();
    private static Date date = new Date();

    @Test
    public void verifyPersonalInformationTest() {
        assertTrue(navigationMenu().clickDebitCard());
        assertTrue(banner().clickDebitCardApplyNow());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salutationDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().firstNameTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().middleNameTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().lastNameTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().nameToAppearOnCardTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().birthdateTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().placeOfBirthTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().nationalityOrCitizenshipTextfield()));
    }

    @Test(dependsOnMethods = "verifyPersonalInformationTest")
    public void verifyContactDetailsTest() {
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().civilStatusDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().presentAddressTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().presentProvinceDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().presentCityDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().sameAsPresentAddressCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().permanentAddressTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().permanentProvinceDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().permanentCityDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().emailAddressTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().mobileNumberAreaCodeTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().mobileNumberTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().phoneNumberAreaCodeTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().phoneNumberTextfield()));
    }

    @Test(dependsOnMethods = "verifyContactDetailsTest")
    public void verifyFinancialInformationTest() {
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().employmentStatusDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().employerOrBusinessNameTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().occupationOrPositionDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().businessIndustryDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().businessAddressTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workProvinceDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workCityDropdown()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workPhoneNumberTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().tinRadioButton()));
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().tinTextfield()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().sssRadioButton()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().gsisRadioButton()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().businessIncomeCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().rentalIncomeCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().investmentCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().personalSavingsCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().salaryCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().inheritanceCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().saleOfPropertyCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().pensionCheckbox()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().othersCheckbox()));
    }

    @Test(dependsOnMethods = "verifyContactDetailsTest")
    public void verifyOtherInstructionsTest() {
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().usePresentAddressRadioButton()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().useWorkAddressRadioButton()));
    }

    @Test(dependsOnMethods = "verifyContactDetailsTest")
    public void verifyCustomerDeclarationTest() {
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().agreementCheckbox()));
    }

    @Test(dependsOnMethods = "verifyContactDetailsTest")
    public void verifyButtonsTest() {
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().saveForLaterButton()));
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().submitFormButton()));
    }

    @Test(dependsOnMethods = "verifyButtonsTest")
    public void verifyCardHoldersNameTest() {
        cardApplication().selectSalutation("Ms.");
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().selectedSalutation()), "Ms.");
        cardApplication().selectSalutation("Mr.");
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().selectedSalutation()), "Mr.");
    }

    @Test(dependsOnMethods = "verifyCardHoldersNameTest")
    public void verifyFirstNameTextfieldTest() {
        cardApplication().setFirstName(specialNumericalCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().firstNameTextfield()), "");
    }

    @Test(dependsOnMethods = "verifyFirstNameTextfieldTest")
    public void verifyMiddleNameTextfieldTest() {
        cardApplication().setMiddleName(specialNumericalCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().middleNameTextfield()), "");
    }

    @Test(dependsOnMethods = "verifyMiddleNameTextfieldTest")
    public void verifyLastNameTextfieldTest() {
        cardApplication().setLastName(specialNumericalCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().lastNameTextfield()), "");
    }

    @Test(dependsOnMethods = "verifyLastNameTextfieldTest")
    public void verifyNameToAppearOnCardTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().nameToAppearOnCardTextfield()), "");

        cardApplication().setFirstName(firstName).setMiddleName(middleName).setLastName(lastName);
        String middleInitial = middleName.substring(0, 1);
        String fullName = String.format("%s %s %s", firstName, middleInitial, lastName);
        assertEquals(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().nameToAppearOnCardTextfield()), fullName.toUpperCase());

        cardApplication().setNameToAppearOnCard("qwertyuiopasdfghjklzxc");
        String nameToAppearOnCardValue = seleniumExtension().getValue("xpath", locatorsCardApplicationPage().nameToAppearOnCardTextfield());
        assertEquals(nameToAppearOnCardValue.length(), 19);
    }

    @Test(dependsOnMethods = "verifyNameToAppearOnCardTest")
    public void verifyBirthdateTextfieldTest() {
        cardApplication().selectBirthDate(birthMonth, birthYear, birthDay);
        assertEquals(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().birthdateTextfield()), birthdate);

        String invalidAgeErrorLocator = "//small[@data-bv-result='INVALID' and contains(text(), 'The age must be 18 and above.')]";
        assertFalse(seleniumExtension().isElementVisible("xpath", invalidAgeErrorLocator));

        SimpleDateFormat yearFormat = new SimpleDateFormat("YYYY");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MMM");
        SimpleDateFormat dayFormat = new SimpleDateFormat("d");

        String currentMonth = monthFormat.format(date);
        String currentDay = dayFormat.format(date);
        cal.add(Calendar.YEAR, -18);
        String birthYear = yearFormat.format(cal.getTime());

        cardApplication().selectBirthDate(currentMonth, birthYear, currentDay);
        assertFalse(seleniumExtension().isElementVisible("xpath", invalidAgeErrorLocator));

        cal.add(Calendar.DAY_OF_MONTH, 1);
        String dayTomorrow = dayFormat.format(cal.getTime());

        cardApplication().selectBirthDate(currentMonth, birthYear, dayTomorrow);
        assertTrue(seleniumExtension().isElementVisible("xpath", invalidAgeErrorLocator));
    }

    @Test(dependsOnMethods = "verifyBirthdateTextfieldTest")
    public void verifyPlaceOfBirthTest() {
        cardApplication().setPlaceOfBirth(specialNumericalCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().placeOfBirthTextfield()), "");
    }

    @Test(dependsOnMethods = "verifyPlaceOfBirthTest")
    public void verifyNationalityOrCitizenshipTest() {
        cardApplication().setNationalityOrCitizenship(specialNumericalCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().placeOfBirthTextfield()), "");
    }

    @Test(dependsOnMethods = "verifyNationalityOrCitizenshipTest")
    public void verifyCivilStatusTest() {
        String[] civilStatusList = {"SINGLE", "MARRIED", "SEPARATED", "WIDOWED"};
        for(String civilStatus:civilStatusList) {
            cardApplication().selectCivilStatus(civilStatus);
            assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().civilStatusDropdown()), civilStatus);
        }
    }

    @Test(dependsOnMethods = "verifyCivilStatusTest")
    public void verifyPresentAddressTest() {
        cardApplication().setPresentAddress(specialNumericalCharacters);
        assertFalse(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().presentAddressTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyPresentAddressTest")
    public void verifyPresentProvinceTest() {
        cardApplication().selectPresentProvince(presentProvince.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().presentProvinceDropdown()), presentProvince.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyPresentProvinceTest")
    public void verifyPresentCityTest() {
        cardApplication().selectPresentCity(presentCity.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().presentCityDropdown()), presentCity.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyPresentCityTest")
    public void verifySameAsPresentAddressCheckboxTest() {
        cardApplication().checkSameAsPresentAddress();
        String permanentAddressXpath = "//div[@id='permanent-add']";
        assertTrue(seleniumExtension().getAttribute(permanentAddressXpath, "style").contains("none"));

        cardApplication().uncheckSameAsPresentAddress();
        assertTrue(seleniumExtension().getAttribute(permanentAddressXpath, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifySameAsPresentAddressCheckboxTest")
    public void verifyPermanentAddressTest() {
        cardApplication().setPermanentAddress(specialNumericalCharacters);
        assertFalse(seleniumExtension().getValue("xpath", locatorsCardApplicationPage().permanentAddressTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyPermanentAddressTest")
    public void verifyPermanentProvinceTest() {
        cardApplication().selectPermanentProvince(permanentProvince);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().permanentProvinceDropdown()), permanentProvince.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyPermanentProvinceTest")
    public void verifyPermanentCityTest() {
        cardApplication().selectPermanentCity(permanentCity);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().permanentCityDropdown()), permanentCity.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyPermanentCityTest")
    public void verifyEmailAddressTextfield() {
        String invalidEmailErrorLocator = "//small[@data-bv-result='INVALID' and contains(text(), 'The value is not a valid email address')]";

        cardApplication().setEmailAddress("buena.anda.com");
        assertTrue(seleniumExtension().isElementVisible("xpath", invalidEmailErrorLocator));

        cardApplication().setEmailAddress("buena.anda@");
        assertTrue(seleniumExtension().isElementVisible("xpath", invalidEmailErrorLocator));

        cardApplication().setEmailAddress(emailAddress);
        assertFalse(seleniumExtension().isElementVisible("xpath", invalidEmailErrorLocator));
    }

    @Test(dependsOnMethods = "verifyEmailAddressTextfield")
    public void verifyMobileNumberAreaCodeTextfield() {
        cardApplication().setMobileNumberAreaCode(alpha);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().mobileNumberAreaCodeTextfield()), "");

        cardApplication().setMobileNumberAreaCode(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().mobileNumberAreaCodeTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyMobileNumberAreaCodeTextfield")
    public void verifyMobileNumberTextfield() {
        cardApplication().setMobileNumber(alpha);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().mobileNumberTextfield()), "");

        cardApplication().setMobileNumber(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().mobileNumberTextfield()).equals(specialNumericalCharacters));

        String invalidMobileNumberErrorLocator = "//small[@data-bv-result='INVALID' and contains(text(), 'The mobile number must be 10 digits not including country code.')]";

        cardApplication().setMobileNumber("2008");
        assertTrue(seleniumExtension().isElementVisible("xpath", invalidMobileNumberErrorLocator));
    }

    @Test(dependsOnMethods = "verifyMobileNumberTextfield")
    public void verifyPhoneNumberAreaCodeTextfield() {
        cardApplication().setPhoneNumberAreaCode(alpha);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().phoneNumberAreaCodeTextfield()), "");

        cardApplication().setPhoneNumberAreaCode(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().phoneNumberAreaCodeTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyPhoneNumberAreaCodeTextfield")
    public void verifyPhoneNumberTextfield() {
        cardApplication().setPhoneNumber(alpha);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().phoneNumberTextfield()), "");

        cardApplication().setPhoneNumber(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().phoneNumberTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyPhoneNumberTextfield")
    public void verifyEmploymentStatusDropdownTest() {
        String[] employmentStatusList = {"REGULAR", "PROBATIONARY", "CONTRACTUAL", "SELF-EMPLOYED", "OTHERS"};
        for(String employmentStatus:employmentStatusList) {
            cardApplication().selectEmploymentStatus(employmentStatus);
            assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().employmentStatusDropdown()), employmentStatus);
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().employerOrBusinessNameTextfield()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().occupationOrPositionDropdown()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().businessIndustryDropdown()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().businessAddressTextfield()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workProvinceDropdown()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workCityDropdown()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().workPhoneNumberTextfield()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().tinRadioButton()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().sssRadioButton()));
            assertTrue(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().gsisRadioButton()));
            assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().tinTextfield()));
        }

        cardApplication().selectEmploymentStatus("RETIRED");
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().employmentStatusDropdown()), "RETIRED");
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().employerOrBusinessNameTextfield()).isDisabled());
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().occupationOrPositionDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().businessIndustryDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().businessAddressTextfield()).isDisabled());
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().workProvinceDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().workCityDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()).isDisabled());
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().workPhoneNumberTextfield()).isDisabled());
        assertFalse(seleniumExtension().xpath(locatorsCardApplicationPage().tinRadioButton()).isDisabled());
        assertFalse(seleniumExtension().xpath(locatorsCardApplicationPage().sssRadioButton()).isDisabled());
        assertFalse(seleniumExtension().xpath(locatorsCardApplicationPage().gsisRadioButton()).isDisabled());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().tinTextfield()));

        cardApplication().selectEmploymentStatus("STUDENT");
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().employmentStatusDropdown()), "STUDENT");
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().employerOrBusinessNameTextfield()).isDisabled());
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().occupationOrPositionDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().businessIndustryDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().businessAddressTextfield()).isDisabled());
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().workProvinceDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().workCityDropdown(), "class").contains("disabled"));
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()).isDisabled());
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().workPhoneNumberTextfield()).isDisabled());
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().tinRadioButton()).isDisabled());
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().sssRadioButton()).isDisabled());
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().gsisRadioButton()).isDisabled());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsCardApplicationPage().tinTextfield()));
    }

    @Test(dependsOnMethods = "verifyEmploymentStatusDropdownTest")
    public void verifyEmployerOrBusinessNameTextfieldTest() {
        cardApplication().selectEmploymentStatus("REGULAR").setEmployerOrBusinessName(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().employerOrBusinessNameTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyEmployerOrBusinessNameTextfieldTest")
    public void verifyOccupationOrPositionDropdownTest() {
        cardApplication().selectOccupationOrPosition(occupation);
        assertTrue(seleniumExtension().getText("xpath", locatorsCardApplicationPage().occupationOrPositionDropdown()).equals(occupation));
    }

    @Test(dependsOnMethods = "verifyOccupationOrPositionDropdownTest")
    public void verifyBusinessIndustryDropdownTest() {
        cardApplication().selectBusinessIndustry(businessIndustry);
        assertTrue(seleniumExtension().getText("xpath", locatorsCardApplicationPage().businessIndustryDropdown()).equals(businessIndustry.toUpperCase()));
    }

    @Test(dependsOnMethods = "verifyBusinessIndustryDropdownTest")
    public void verifyBusinessAddressTextfieldTest() {
        cardApplication().setBusinessAddress(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().businessAddressTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyBusinessAddressTextfieldTest")
    public void verifyWorkProvinceDropdownTest() {
        cardApplication().selectWorkProvince(workProvince);
        assertTrue(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workProvinceDropdown()).equals(workProvince.toUpperCase()));
    }

    @Test(dependsOnMethods = "verifyWorkProvinceDropdownTest")
    public void verifyWorkCityDropdownTest() {
        cardApplication().selectWorkCity(workCity);
        assertTrue(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workCityDropdown()).equals(workCity.toUpperCase()));
    }

    @Test(dependsOnMethods = "verifyWorkCityDropdownTest")
    public void verifyWorkPhoneNumberAreaCodeTextfield() {
        cardApplication().setWorkPhoneNumberAreaCode(alpha);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()), "");

        cardApplication().setWorkPhoneNumberAreaCode(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()).equals(specialNumericalCharacters));
    }

    @Test(dependsOnMethods = "verifyWorkPhoneNumberAreaCodeTextfield")
    public void verifyWorkPhoneNumberTextfield() {
        cardApplication().setWorkPhoneNumber(alpha);
        assertEquals(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workPhoneNumberTextfield()), "");

        cardApplication().setWorkPhoneNumber(specialNumericalCharacters);
        assertFalse(seleniumExtension().getText("xpath", locatorsCardApplicationPage().workPhoneNumberTextfield()).equals(specialNumericalCharacters));

        String invalidWorkPhoneNumberErrorLocator = "//small[@data-bv-result='INVALID' and contains(text(), 'The contact number must be between 8 and 11 digits.')]";

        cardApplication().setMobileNumber("2008");
        assertTrue(seleniumExtension().isElementVisible("xpath", invalidWorkPhoneNumberErrorLocator));
    }

    @Test(dependsOnMethods = "verifyWorkPhoneNumberTextfield")
    public void verifyTinTest() {
        cardApplication().clickTIN();
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().tinTextfield(), "class").contains("show"));
        assertFalse(seleniumExtension().getAttribute(locatorsCardApplicationPage().sssTextfield(), "class").contains("show"));
        assertFalse(seleniumExtension().getAttribute(locatorsCardApplicationPage().gsisTextfield(), "class").contains("show"));
    }

    @Test(dependsOnMethods = "verifyTinTest")
    public void verifySSSTest() {
        cardApplication().clickSSS();
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().sssTextfield(), "class").contains("show"));
        assertFalse(seleniumExtension().getAttribute(locatorsCardApplicationPage().tinTextfield(), "class").contains("show"));
        assertFalse(seleniumExtension().getAttribute(locatorsCardApplicationPage().gsisTextfield(), "class").contains("show"));
    }

    @Test(dependsOnMethods = "verifySSSTest")
    public void verifyGSISTest() {
        cardApplication().clickGSIS();
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().gsisTextfield(), "class").contains("show"));
        assertFalse(seleniumExtension().getAttribute(locatorsCardApplicationPage().tinTextfield(), "class").contains("show"));
        assertFalse(seleniumExtension().getAttribute(locatorsCardApplicationPage().sssTextfield(), "class").contains("show"));
    }

    @Test(dependsOnMethods = "verifyGSISTest")
    public void verifyBusinessIncomeCheckboxTest() {
        cardApplication().checkBusinessIncome();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().businessIncomeCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckBusinessIncome();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().businessIncomeCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifyBusinessIncomeCheckboxTest")
    public void verifyRentalIncomeCheckboxTest() {
        cardApplication().checkRentalIncome();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().rentalIncomeCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckRentalIncome();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().rentalIncomeCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifyRentalIncomeCheckboxTest")
    public void verifyInvestmentCheckboxTest() {
        cardApplication().checkInvestment();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().investmentCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckInvestment();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().investmentCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifyInvestmentCheckboxTest")
    public void verifyPersonalSavingsCheckboxTest() {
        cardApplication().checkPersonalSavings();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().personalSavingsCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckPersonalSavings();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().personalSavingsCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifyPersonalSavingsCheckboxTest")
    public void verifySalarySavingsCheckboxTest() {
        cardApplication().checkSalary();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().salaryCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckSalary();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().salaryCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifySalarySavingsCheckboxTest")
    public void verifyInheritanceCheckboxTest() {
        cardApplication().checkInheritance();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().inheritanceCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckInheritance();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().inheritanceCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifyInheritanceCheckboxTest")
    public void verifySaleOfPropertyCheckboxTest() {
        cardApplication().checkSaleOfProperty();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().saleOfPropertyCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckSaleOfProperty();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().saleOfPropertyCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifySaleOfPropertyCheckboxTest")
    public void verifyPensionCheckboxTest() {
        cardApplication().checkPension();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().pensionCheckbox()).isSelected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));

        cardApplication().uncheckPension();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().pensionCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }

    @Test(dependsOnMethods = "verifyPensionCheckboxTest")
    public void verifyOthersCheckboxTest() {
        cardApplication().checkOthers();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().othersCheckbox()).isSelected());
        assertTrue(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));


        cardApplication().uncheckOthers();
        assertTrue(seleniumExtension().xpath(locatorsCardApplicationPage().othersCheckbox()).isUnselected());
        assertFalse(seleniumExtension().getAttribute(othersTextfieldXpathWithClassLocator, "style").contains("block"));
    }
}

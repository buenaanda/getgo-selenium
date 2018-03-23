package com.wc.getgo.selenium.test.ReviewApplication.method;

import org.openqa.selenium.NoSuchElementException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.object.Checkbox.checkbox;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.object.DatePicker.datePicker;
import static com.wc.getgo.selenium.object.Dropdown.dropdown;
import static com.wc.getgo.selenium.object.SelectizeDropdown.selectizeDropdown;
import static com.wc.getgo.selenium.object.Textfield.textfield;
import static com.wc.getgo.selenium.test.Banner.locator.LocatorsBanner.locatorsBanner;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;

public class ReviewApplication {

    public static ReviewApplication reviewApplication() {
        return new ReviewApplication();
    }

    private Screen screen = new Screen();

    public Boolean clickEditPersonalInformation() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().editPersonalInformationButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().salutationDropdown());
    }

    public Boolean clickEditContactDetails() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().editContactDetailsButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().presentAddressTextfield());
    }

    public Boolean clickEditFinancialInformation() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().editFinancialInformationButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().employmentStatusDropdown());
    }

    public Boolean clickEditUploadDocuments() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().editUploadDocumentsButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().employmentStatusDropdown());
    }

    public Boolean clickEditOtherInstructions() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().editOtherInstructionsButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().usePresentAddressRadioButton());
    }

    public Boolean clickEditAdditionalOptions() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().editAdditionalOptionsButton()).click();
        sleep(1000);
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().supNameToAppearOnCardTextfield());
    }

    public ReviewApplication selectSalutation(String title) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().salutationDropdown()).setText(title).select();
        return this;
    }

    public ReviewApplication setFirstName(String firstName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().firstNameTextfield()).setText(firstName);
        return this;
    }

    public ReviewApplication setMiddleName(String middleName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().middleNameTextfield()).setText(middleName);
        return this;
    }

    public ReviewApplication setLastName(String lastName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().lastNameTextfield()).setText(lastName);
        return this;
    }

    public ReviewApplication setNameToAppearOnCard(String nameToAppearOnCard) {
        textfield(driver).xpath(locatorsReviewApplicationPage().nameToAppearOnCardTextfield()).setText(nameToAppearOnCard);
        return this;
    }

    public ReviewApplication selectBirthDate(String month, String year, String day) {
        clickButton(driver).xpath(locatorsReviewApplicationPage().birthdateTextfield()).click();
        sleep(1000);
        String monthDropdownLocator = "//select[@class='ui-datepicker-month']";
        String yearDropdownLocator = "//select[@class='ui-datepicker-year']";
        dropdown(driver).dropdownLocator(monthDropdownLocator).selectValue(month).select();
        sleep(1000);
        dropdown(driver).dropdownLocator(yearDropdownLocator).selectValue(year).select();
        sleep(1000);
        String dayLocator = String.format("//a[contains(@class, 'ui-state') and contains(text(), '%s')]", day);
        clickButton(driver).xpath(dayLocator).click();
        sleep(1000);
        return this;
    }

    public ReviewApplication setPlaceOfBirth(String placeOfBirth) {
        textfield(driver).xpath(locatorsReviewApplicationPage().placeOfBirthTextfield()).setText(placeOfBirth);
        return this;
    }

    public ReviewApplication setNationalityOrCitizenship(String nationalityOrCitizenship) {
        textfield(driver).xpath(locatorsReviewApplicationPage().nationalityOrCitizenshipTextfield()).setText(nationalityOrCitizenship);
        return this;
    }

    public ReviewApplication selectNationalityOrCitizenship(String nationalityOrCitizenship) {
        dropdown(driver).dropdownLocator(locatorsReviewApplicationPage().nationalityOrCitizenshipDropdown()).selectValue(nationalityOrCitizenship.toUpperCase()).select();
        return this;
    }

    public ReviewApplication selectCivilStatus(String civilStatus) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().civilStatusDropdown()).setText(civilStatus).select();
        return this;
    }

    public ReviewApplication setMothersMaidenName(String mothersMaidenName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().mothersMaidenNameTextfield()).setText(mothersMaidenName);
        return this;
    }

    public ReviewApplication setPresentAddress(String presentAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().presentAddressTextfield()).setText(presentAddress);
        return this;
    }

    public ReviewApplication selectPresentProvince(String province) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().presentProvinceDropdown()).setText(province).select();
        return this;
    }

    public ReviewApplication selectPresentCity(String city) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().presentCityDropdown()).setText(city).select();
        return this;
    }

    public ReviewApplication checkSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().sameAsPresentAddressCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().sameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public ReviewApplication uncheckSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().sameAsPresentAddressCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().sameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public ReviewApplication setPermanentAddress(String permanentAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().permanentAddressTextfield()).setText(permanentAddress);
        return this;
    }

    public ReviewApplication selectPermanentProvince(String permanentProvince) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().permanentProvinceDropdown()).setText(permanentProvince).select();
        return this;
    }

    public ReviewApplication selectHomeOwnership(String homeOwnership) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().homeOwnershipDropdown()).setText(homeOwnership).select();
        return this;
    }

    public ReviewApplication setYearsOfStay(String yearsOfStay) {
        textfield(driver).xpath(locatorsReviewApplicationPage().yearsOfStayTextfield()).setText(yearsOfStay);
        return this;
    }

    public ReviewApplication selectPermanentCity(String permanentCity) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().permanentCityDropdown()).setText(permanentCity).select();
        return this;
    }

    public ReviewApplication setEmailAddress(String emailAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().emailAddressTextfield()).setText(emailAddress);
        return this;
    }

    public ReviewApplication setMobileNumberAreaCode(String mobileNumberAreaCode) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().mobileNumberAreaCodeTextfield()).setText(mobileNumberAreaCode);
        return this;
    }

    public ReviewApplication setMobileNumber(String mobileNumber) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().mobileNumberTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().mobileNumberTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().mobileNumberTextfield()).setText(mobileNumber);
        return this;
    }

    public ReviewApplication setPhoneNumberAreaCode(String phoneNumberAreaCode) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().phoneNumberAreaCodeTextfield()).setText(phoneNumberAreaCode);
        return this;
    }

    public ReviewApplication setPhoneNumber(String phoneNumber) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().phoneNumberTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().phoneNumberTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().phoneNumberTextfield()).setText(phoneNumber);
        return this;
    }

    public ReviewApplication selectEmploymentStatus(String employmentStatus) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().employmentStatusDropdown()).setText(employmentStatus).select();
        return this;
    }

    public ReviewApplication setEmployerOrBusinessName(String employerOrBusinessName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().employerOrBusinessNameTextfield()).setText(employerOrBusinessName);
        return this;
    }

    public ReviewApplication selectOccupationGroup(String occupationGroup) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().occupationGroupDropdown()).setText(occupationGroup.toUpperCase()).select();
        return this;
    }

    public ReviewApplication selectOccupationOrPosition(String occupationOrPosition) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().occupationOrPositionDropdown()).setText(occupationOrPosition).select();
        return this;
    }

    public ReviewApplication selectBusinessIndustry(String businessIndustry) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().businessIndustryDropdown()).setText(businessIndustry).select();
        return this;
    }

    public ReviewApplication setBusinessAddress(String businessAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().businessAddressTextfield()).setText(businessAddress);
        return this;
    }

    public ReviewApplication selectWorkProvince(String workProvince) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().workProvinceDropdown()).setText(workProvince).select();
        return this;
    }

    public ReviewApplication selectWorkCity(String workCity) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().workCityDropdown()).setText(workCity).select();
        return this;
    }

    public ReviewApplication setTotalYearsInWorkOrBusiness(String totalYearsInWorkOrBusiness) {
        textfield(driver).xpath(locatorsReviewApplicationPage().totalYearsInWorkOrBusinessTextfield()).setText(totalYearsInWorkOrBusiness);
        return this;
    }

    public ReviewApplication setWorkPhoneNumberAreaCode(String workPhoneNumberAreaCode) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().workPhoneNumberAreaCodeTextfield()).setText(workPhoneNumberAreaCode);
        return this;
    }

    public ReviewApplication setWorkPhoneNumber(String workPhoneNumber) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().workPhoneNumberTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().workPhoneNumberTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().workPhoneNumberTextfield()).setText(workPhoneNumber);
        return this;
    }

    public ReviewApplication setGrossAnnualIncome(String grossAnnualIncome) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsReviewApplicationPage().grossAnnualIncomeTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsReviewApplicationPage().grossAnnualIncomeTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsReviewApplicationPage().grossAnnualIncomeTextfield()).setText(grossAnnualIncome);
        return this;
    }

    public ReviewApplication clickTIN() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().tinRadioButton()).click();
        return this;
    }

    public ReviewApplication setTIN(String tin) {
        textfield(driver).xpath(locatorsReviewApplicationPage().tinTextfield()).setText(tin);
        return this;
    }

    public ReviewApplication clickSSS() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().sssRadioButton()).click();
        return this;
    }

    public ReviewApplication setSSS(String sss) {
        textfield(driver).xpath(locatorsReviewApplicationPage().sssTextfield()).setText(sss);
        return this;
    }

    public ReviewApplication clickGSIS() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().gsisRadioButton()).click();
        return this;
    }

    public ReviewApplication setGSIS(String gsis) {
        textfield(driver).xpath(locatorsReviewApplicationPage().gsisTextfield()).setText(gsis);
        return this;
    }

    public ReviewApplication checkBusinessIncome() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().businessIncomeCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().businessIncomeCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckBusinessIncome() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().businessIncomeCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().businessIncomeCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkRentalIncome() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().rentalIncomeCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().rentalIncomeCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckRentalIncome() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().rentalIncomeCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().rentalIncomeCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkInvestment() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().investmentCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().investmentCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckInvestment() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().investmentCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().investmentCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkPersonalSavings() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().personalSavingsCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().personalSavingsCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckPersonalSavings() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().personalSavingsCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().personalSavingsCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkSalary() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().salaryCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().salaryCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckSalary() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().salaryCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().salaryCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkInheritance() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().inheritanceCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().inheritanceCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckInheritance() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().inheritanceCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().inheritanceCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkSaleOfProperty() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().saleOfPropertyCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().saleOfPropertyCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckSaleOfProperty() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().saleOfPropertyCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().saleOfPropertyCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkPension() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().pensionCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().pensionCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckPension() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().pensionCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().pensionCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication checkOthers() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().othersCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().othersCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication uncheckOthers() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().othersCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().othersCheckbox()).check();
        }
        return this;
    }

    public ReviewApplication setOthers(String others) {
        textfield(driver).xpath(locatorsReviewApplicationPage().othersTextfield()).setText(others);
        return this;
    }

    public ReviewApplication selectCardBankName1(String cardBankName1) {
        try {
            dropdown(driver).dropdownLocator(locatorsReviewApplicationPage().cardBankName1Dropdown()).selectValue(cardBankName1).select();
        } catch (NoSuchElementException e) {
            dropdown(driver).dropdownLocator(locatorsReviewApplicationPage().cardBankName1Dropdown()).selectValue(cardBankName1.toUpperCase()).select();
        }
        return this;
    }

    public ReviewApplication selectCardBankName2(String cardBankName2) {
        try {
            dropdown(driver).dropdownLocator(locatorsReviewApplicationPage().cardBankName2Dropdown()).selectValue(cardBankName2).select();
        } catch (NoSuchElementException e) {
            dropdown(driver).dropdownLocator(locatorsReviewApplicationPage().cardBankName2Dropdown()).selectValue(cardBankName2.toUpperCase()).select();
        }
        return this;
    }

    public ReviewApplication setCreditCardNumber1(String creditCardNumber1) {
        textfield(driver).xpath(locatorsReviewApplicationPage().creditCardNumber1Textfield()).setText(creditCardNumber1);
        return this;
    }

    public ReviewApplication setCreditCardNumber2(String creditCardNumber2) {
        textfield(driver).xpath(locatorsReviewApplicationPage().creditCardNumber2Textfield()).setText(creditCardNumber2);
        return this;
    }

    public ReviewApplication clickAdd() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().addCreditCardButton()).click();
        sleep(2000);
        return this;
    }

    public ReviewApplication clickRemove() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().removeCreditCardButton()).click();
        return this;
    }

    public ReviewApplication clickUploadAcceptableIds() throws FindFailed {
        try {
            screen.mouseMove("images/chooseFile.png");
        } catch(Exception e) {
            screen.mouseMove("images/browse.png");
        }
        screen.doubleClick();
        sleep(8000);
        return this;
    }

    public ReviewApplication searchFile(String filename) {
        screen.type(locatorsReviewApplicationPage().searchField(), filename);
        sleep(5000);
        return this;
    }

    public ReviewApplication clickFile(String filePath) throws FindFailed {
        screen.doubleClick(filePath);
        sleep(3000);
        return this;
    }

    public ReviewApplication clickUploadProofOfIncome() throws FindFailed {
        try {
            screen.mouseMove("images/chooseFile.png");
        } catch(Exception e) {
            screen.mouseMove("images/browse.png");
        }
        screen.doubleClick();
        sleep(8000);
        return this;
    }

    public ReviewApplication clickUsePresentAddress() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().usePresentAddressRadioButton()).click();
        textfield(driver).xpath(locatorsReviewApplicationPage().usePresentAddressRadioButton()).pageDown();
        return this;
    }

    public ReviewApplication clickUseWorkAddress() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().useWorkAddressRadioButton()).click();
        return this;
    }

    public ReviewApplication clickBillingPresentAddress() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().useBillingPresentAddressRadioButton()).click();
        return this;
    }

    public ReviewApplication clickBillingWorkAddress() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().useBillingWorkAddressRadioButton()).click();
        return this;
    }

    public ReviewApplication clickDeliveryPresentAddress() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().useDeliveryPresentAddressRadioButton()).click();
        return this;
    }

    public ReviewApplication clickDeliveryWorkAddress() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().useDeliveryWorkAddressRadioButton()).click();
        return this;
    }

    public ReviewApplication selectSupSalutation(String supSalutation) {
        selectizeDropdown(driver).dropdownLocator(locatorsReviewApplicationPage().supplementarySalutationDropdown()).setText(supSalutation).select();
        return this;
    }

    public ReviewApplication setSupFirstName(String supFirstName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryFirstNameTextfield()).setText(supFirstName);
        return this;
    }

    public ReviewApplication setSupMiddleName(String supMiddleName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryMiddleNameTextfield()).setText(supMiddleName);
        return this;
    }

    public ReviewApplication setSupLastName(String supLastName) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryLastNameTextfield()).setText(supLastName);
        return this;
    }

    public ReviewApplication setSupNameToAppearOnCard(String supNameToAppearOnCard) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryNameToAppearOnCardTextfield()).setText(supNameToAppearOnCard);
        return this;
    }

    public ReviewApplication selectSupBirthDate(String month, String year, String day) {
        datePicker()
                .locator(locatorsReviewApplicationPage().supplementaryBirthdateTextfield())
                .click()
                .selectMonth(month)
                .selectYear(year)
                .selectDay(day);
        return this;
    }

    public ReviewApplication setRelationshipWithPrincipal(String relationshipWithPrincipal) {
        textfield(driver).xpath(locatorsReviewApplicationPage().relationshipWithPrincipalTextfield()).setText(relationshipWithPrincipal);
        return this;
    }

    public ReviewApplication setSupPresentAddress(String supPresentAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryPresentAddressTextfield()).setText(supPresentAddress);
        return this;
    }

    public ReviewApplication checkSupSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().supplementarySameAsPresentAddressCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().supplementarySameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public ReviewApplication uncheckSupSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsReviewApplicationPage().supplementarySameAsPresentAddressCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsReviewApplicationPage().supplementarySameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public ReviewApplication setSupPermanentAddress(String supPermanentAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryPermanentAddressTextfield()).setText(supPermanentAddress);
        return this;
    }

    public ReviewApplication setSupEmailAddress(String supEmailAddress) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryEmailAddressTextfield()).setText(supEmailAddress);
        return this;
    }

    public ReviewApplication setSupMobileNumberAreaCode(String supMobileNumberAreaCode) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryMobileNumberAreaCodeTextfield()).setText(supMobileNumberAreaCode);
        return this;
    }

    public ReviewApplication setSupMobileNumber(String supMobileNumber) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryMobileNumberTextfield()).setText(supMobileNumber);
        return this;
    }

    public ReviewApplication setSupPhoneNumberAreaCode(String supPhoneNumberAreaCode) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryPhoneNumberAreaCodeTextfield()).setText(supPhoneNumberAreaCode);
        return this;
    }

    public ReviewApplication setSupPhoneNumber(String supPhoneNumber) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryPhoneNumberTextfield()).setText(supPhoneNumber);
        return this;
    }

    public ReviewApplication clickSupTIN() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().supplementaryTinRadioButton()).click();
        return this;
    }

    public ReviewApplication setSupTIN(String supTIN) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryTinTextfield()).setText(supTIN);
        return this;
    }

    public ReviewApplication clickSupSSS() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().supplementarySssRadioButton()).click();
        return this;
    }

    public ReviewApplication setSupSSS(String supSSS) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementarySssTextfield()).setText(supSSS);
        return this;
    }

    public ReviewApplication clickSupGSIS() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().supplementaryGsisRadioButton()).click();
        return this;
    }

    public ReviewApplication setSupGSIS(String supGSIS) {
        textfield(driver).xpath(locatorsReviewApplicationPage().supplementaryGsisTextfield()).setText(supGSIS);
        return this;
    }

    public ReviewApplication setSubLimit(String subLimit) {
        textfield(driver).xpath(locatorsReviewApplicationPage().subLimitTextfield()).setText(subLimit);
        return this;
    }
    
    public Boolean clickSubmitForm() {
        seleniumExtension().waitForElementVisible("xpath", locatorsReviewApplicationPage().submitFormButton());
        clickButton(driver).xpath(locatorsReviewApplicationPage().submitFormButton()).click();
        seleniumExtension().waitForElementVisible("xpath", locatorsReviewApplicationPage().continueButton());
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().continueButton());
    }

    public Boolean clickContinue() {
        clickButton(driver).xpath(locatorsReviewApplicationPage().continueButton()).click();
        seleniumExtension().waitForElementVisible("xpath", locatorsBanner().applyNowButton());
        return seleniumExtension().isElementVisible("xpath", locatorsBanner().applyNowButton());
    }
}

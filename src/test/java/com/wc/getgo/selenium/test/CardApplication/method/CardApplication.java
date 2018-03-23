package com.wc.getgo.selenium.test.CardApplication.method;

import org.openqa.selenium.NoSuchElementException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.global.Loader.loader;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.SikuliExtension.sikuliExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.object.Checkbox.checkbox;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.object.DatePicker.datePicker;
import static com.wc.getgo.selenium.object.Dropdown.dropdown;
import static com.wc.getgo.selenium.object.SelectizeDropdown.selectizeDropdown;
import static com.wc.getgo.selenium.object.Textfield.textfield;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;

public class CardApplication {

    private Screen screen = new Screen();

    public static CardApplication cardApplication() {
        return new CardApplication();
    }

    public CardApplication selectSalutation(String title) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().salutationDropdown()).setText(title).select();
        return this;
    }

    public CardApplication setFirstName(String firstName) {
        textfield(driver).xpath(locatorsCardApplicationPage().firstNameTextfield()).setText(firstName);
        return this;
    }

    public CardApplication setMiddleName(String middleName) {
        textfield(driver).xpath(locatorsCardApplicationPage().middleNameTextfield()).setText(middleName);
        return this;
    }

    public CardApplication setLastName(String lastName) {
        textfield(driver).xpath(locatorsCardApplicationPage().lastNameTextfield()).setText(lastName);
        return this;
    }

    public CardApplication setNameToAppearOnCard(String nameToAppearOnCard) {
        textfield(driver).xpath(locatorsCardApplicationPage().nameToAppearOnCardTextfield()).setText(nameToAppearOnCard);
        return this;
    }

    public CardApplication selectBirthDate(String month, String year, String day) {
        datePicker()
                .locator(locatorsCardApplicationPage().birthdateTextfield())
                .click()
                .selectMonth(month)
                .selectYear(year)
                .selectDay(day);
        return this;
    }

    public CardApplication setPlaceOfBirth(String placeOfBirth) {
        textfield(driver).xpath(locatorsCardApplicationPage().placeOfBirthTextfield()).setText(placeOfBirth);
        return this;
    }

    public CardApplication setNationalityOrCitizenship(String nationalityOrCitizenship) {
        textfield(driver).xpath(locatorsCardApplicationPage().nationalityOrCitizenshipTextfield()).setText(nationalityOrCitizenship);
        return this;
    }

    public CardApplication selectNationalityOrCitizenship(String nationalityOrCitizenship) {
        dropdown(driver).dropdownLocator(locatorsCardApplicationPage().nationalityOrCitizenshipDropdown()).selectValue(nationalityOrCitizenship.toUpperCase()).select();
        return this;
    }

    public CardApplication selectCivilStatus(String civilStatus) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().civilStatusDropdown()).setText(civilStatus).select();
        return this;
    }

    public CardApplication setMothersMaidenName(String mothersMaidenName) {
        textfield(driver).xpath(locatorsCardApplicationPage().mothersMaidenNameTextfield()).setText(mothersMaidenName);
        return this;
    }

    public CardApplication setPresentAddress(String presentAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().presentAddressTextfield()).setText(presentAddress);
        return this;
    }

    public CardApplication selectPresentProvince(String province) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().presentProvinceDropdown()).setText(province).select();
        return this;
    }

    public CardApplication selectPresentCity(String city) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().presentCityDropdown()).setText(city).select();
        return this;
    }

    public CardApplication setPresentPostalCode(String postalCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().presentPostalCode()).setText(postalCode);
        return this;
    }

    public CardApplication checkSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().sameAsPresentAddressCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().sameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public CardApplication uncheckSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().sameAsPresentAddressCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().sameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public CardApplication setPermanentAddress(String permanentAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().permanentAddressTextfield()).setText(permanentAddress);
        return this;
    }

    public CardApplication selectPermanentProvince(String permanentProvince) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().permanentProvinceDropdown()).setText(permanentProvince).select();
        return this;
    }

    public CardApplication selectPermanentCity(String permanentCity) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().permanentCityDropdown()).setText(permanentCity).select();
        return this;
    }

    public CardApplication setPermanentPostalCode(String postalCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().permanentPostalCodeTextfield()).setText(postalCode);
        return this;
    }

    public CardApplication selectHomeOwnership(String homeOwnership) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().homeOwnershipDropdown()).setText(homeOwnership).select();
        return this;
    }

    public CardApplication setYearsOfStay(String yearsOfStay) {
        textfield(driver).xpath(locatorsCardApplicationPage().yearsOfStayTextfield()).setText(yearsOfStay);
        return this;
    }

    public CardApplication setEmailAddress(String emailAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().emailAddressTextfield()).setText(emailAddress);
        return this;
    }

    public CardApplication setMobileNumberAreaCode(String mobileNumberAreaCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().mobileNumberAreaCodeTextfield()).setText(mobileNumberAreaCode);
        return this;
    }

    public CardApplication setMobileNumber(String mobileNumber) {
        textfield(driver).xpath(locatorsCardApplicationPage().mobileNumberTextfield()).setText(mobileNumber);
        return this;
    }

    public CardApplication setPhoneNumberAreaCode(String phoneNumberAreaCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().phoneNumberAreaCodeTextfield()).setText(phoneNumberAreaCode);
        return this;
    }

    public CardApplication setPhoneNumber(String phoneNumber) {
        textfield(driver).xpath(locatorsCardApplicationPage().phoneNumberTextfield()).setText(phoneNumber);
        return this;
    }

    public CardApplication selectEmploymentStatus(String employmentStatus) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().employmentStatusDropdown()).setText(employmentStatus).select();
        return this;
    }

    public CardApplication setEmployerOrBusinessName(String employerOrBusinessName) {
        textfield(driver).xpath(locatorsCardApplicationPage().employerOrBusinessNameTextfield()).setText(employerOrBusinessName);
        return this;
    }

    public CardApplication selectOccupationGroup(String occupationGroup) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().occupationGroupDropdown()).setText(occupationGroup.toUpperCase()).select();
        return this;
    }

    public CardApplication selectOccupationOrPosition(String occupationOrPosition) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().occupationOrPositionDropdown()).setText(occupationOrPosition).select();
        return this;
    }

    public CardApplication selectBusinessIndustry(String businessIndustry) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().businessIndustryDropdown()).setText(businessIndustry).select();
        return this;
    }

    public CardApplication setBusinessAddress(String businessAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().businessAddressTextfield()).setText(businessAddress);
        return this;
    }

    public CardApplication selectWorkProvince(String workProvince) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().workProvinceDropdown()).setText(workProvince).select();
        return this;
    }

    public CardApplication selectWorkCity(String workCity) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().workCityDropdown()).setText(workCity).select();
        return this;
    }

    public CardApplication setWorkPostalCode(String workPostalCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().workPostalCodeTextfield()).setText(workPostalCode);
        return this;
    }

    public CardApplication setTotalYearsInWorkOrBusiness(String totalYearsInWorkOrBusiness) {
        textfield(driver).xpath(locatorsCardApplicationPage().totalYearsInWorkOrBusinessTextfield()).setText(totalYearsInWorkOrBusiness);
        return this;
    }

    public CardApplication setWorkPhoneNumberAreaCode(String workPhoneNumberAreaCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().workPhoneNumberAreaCodeTextfield()).setText(workPhoneNumberAreaCode);
        return this;
    }

    public CardApplication setWorkPhoneNumber(String workPhoneNumber) {
        textfield(driver).xpath(locatorsCardApplicationPage().workPhoneNumberTextfield()).setText(workPhoneNumber);
        return this;
    }

    public CardApplication clickTIN() {
        clickButton(driver).xpath(locatorsCardApplicationPage().tinRadioButton()).click();
        return this;
    }

    public CardApplication setTIN(String tin) {
        textfield(driver).xpath(locatorsCardApplicationPage().tinTextfield()).setText(tin);
        return this;
    }

    public CardApplication clickSSS() {
        clickButton(driver).xpath(locatorsCardApplicationPage().sssRadioButton()).click();
        return this;
    }

    public CardApplication setSSS(String sss) {
        textfield(driver).xpath(locatorsCardApplicationPage().sssTextfield()).setText(sss);
        return this;
    }

    public CardApplication clickGSIS() {
        clickButton(driver).xpath(locatorsCardApplicationPage().gsisRadioButton()).click();
        return this;
    }

    public CardApplication setGSIS(String gsis) {
        textfield(driver).xpath(locatorsCardApplicationPage().gsisTextfield()).setText(gsis);
        return this;
    }

    public CardApplication setGrossAnnualIncome(String grossAnnualIncome) {
        int lengthText = seleniumExtension().getValue("xpath", locatorsCardApplicationPage().grossAnnualIncomeTextfield()).length();
        if(lengthText != 0) {
            for(int i=1;i<=lengthText;i++) {
                textfield(driver).xpath(locatorsCardApplicationPage().grossAnnualIncomeTextfield()).backspace();
            }
        }
        textfield(driver).xpath(locatorsCardApplicationPage().grossAnnualIncomeTextfield()).setText(grossAnnualIncome);
        return this;
    }

    public CardApplication checkBusinessIncome() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().businessIncomeCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().businessIncomeCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckBusinessIncome() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().businessIncomeCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().businessIncomeCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkRentalIncome() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().rentalIncomeCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().rentalIncomeCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckRentalIncome() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().rentalIncomeCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().rentalIncomeCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkInvestment() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().investmentCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().investmentCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckInvestment() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().investmentCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().investmentCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkPersonalSavings() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().personalSavingsCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().personalSavingsCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckPersonalSavings() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().personalSavingsCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().personalSavingsCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkSalary() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().salaryCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().salaryCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckSalary() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().salaryCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().salaryCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkInheritance() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().inheritanceCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().inheritanceCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckInheritance() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().inheritanceCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().inheritanceCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkSaleOfProperty() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().saleOfPropertyCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().saleOfPropertyCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckSaleOfProperty() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().saleOfPropertyCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().saleOfPropertyCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkPension() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().pensionCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().pensionCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckPension() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().pensionCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().pensionCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkOthers() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().othersCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().othersCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckOthers() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().othersCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().othersCheckbox()).check();
        }
        return this;
    }

    public CardApplication setOthers(String others) {
        textfield(driver).xpath(locatorsCardApplicationPage().othersTextfield()).setText(others);
        return this;
    }

    public CardApplication clickExistingCreditCardholderYes() {
        clickButton(driver).xpath(locatorsCardApplicationPage().existingCreditCardholderYesRadioButton()).click();
        return this;
    }

    public CardApplication clickExistingCreditCardholderNo() {
        clickButton(driver).xpath(locatorsCardApplicationPage().existingCreditCardholderNoRadioButton()).click();
        return this;
    }

    public CardApplication selectCardBankName1(String cardBankName1) {
        try {
            dropdown(driver).dropdownLocator(locatorsCardApplicationPage().cardBankName1Dropdown()).selectValue(cardBankName1).select();
        } catch (NoSuchElementException e) {
            dropdown(driver).dropdownLocator(locatorsCardApplicationPage().cardBankName1Dropdown()).selectValue(cardBankName1.toUpperCase()).select();
        }
        return this;
    }

    public CardApplication selectCardBankName2(String cardBankName2) {
        try {
            dropdown(driver).dropdownLocator(locatorsCardApplicationPage().cardBankName2Dropdown()).selectValue(cardBankName2).select();
        } catch (NoSuchElementException e) {
            dropdown(driver).dropdownLocator(locatorsCardApplicationPage().cardBankName2Dropdown()).selectValue(cardBankName2.toUpperCase()).select();
        }
        return this;
    }

    public CardApplication setCreditCardNumber1(String creditCardNumber1) {
        textfield(driver).xpath(locatorsCardApplicationPage().creditCardNumber1Textfield()).setText(creditCardNumber1);
        return this;
    }

    public CardApplication setCreditCardNumber2(String creditCardNumber2) {
        textfield(driver).xpath(locatorsCardApplicationPage().creditCardNumber2Textfield()).setText(creditCardNumber2);
        return this;
    }

    public CardApplication clickAdd() {
        clickButton(driver).xpath(locatorsCardApplicationPage().addCreditCardButton()).click();
        sleep(2000);
        return this;
    }

    public CardApplication clickRemove() {
        clickButton(driver).xpath(locatorsCardApplicationPage().removeCreditCardButton()).click();
        return this;
    }

    public CardApplication clickUploadAcceptableIds() throws FindFailed {
        try {
            screen.mouseMove("images/chooseFile.png");
        } catch(Exception e) {
            screen.mouseMove("images/browse.png");
        }
        screen.doubleClick();
        sleep(8000);
        return this;
    }

    public CardApplication searchFile(String filename) {
        screen.type(locatorsCardApplicationPage().searchField(), filename);
        sleep(5000);
        return this;
    }

    public CardApplication clickFile(String filePath) throws FindFailed {
        screen.doubleClick(filePath);
        sleep(3000);
        return this;
    }

    public CardApplication clickUploadProofOfIncome() throws FindFailed {
        try {
            screen.mouseMove("images/chooseFile.png");
        } catch(Exception e) {
            screen.mouseMove("images/browse.png");
        }
        screen.doubleClick();
        sleep(8000);
        return this;
    }

    public CardApplication clickUsePresentAddress() {
        clickButton(driver).xpath(locatorsCardApplicationPage().usePresentAddressRadioButton()).click();
        textfield(driver).xpath(locatorsCardApplicationPage().usePresentAddressRadioButton()).pageDown();
        return this;
    }

    public CardApplication clickUseWorkAddress() {
        clickButton(driver).xpath(locatorsCardApplicationPage().useWorkAddressRadioButton()).click();
        return this;
    }

    public CardApplication clickBillingUsePresentAddress() {
        clickButton(driver).xpath(locatorsCardApplicationPage().billingAddressUsePresentAddressRadioButton()).click();
        return this;
    }

    public CardApplication clickBillingUseWorkAddress() {
        clickButton(driver).xpath(locatorsCardApplicationPage().billingAddressUseWorkAddressRadioButton()).click();
        return this;
    }

    public CardApplication clickCardDeliveryUsePresentAddress() {
        clickButton(driver).xpath(locatorsCardApplicationPage().cardDeliveryUsePresentAddressRadioButton()).click();
        return this;
    }

    public CardApplication clickCardDeliveryUseWorkAddress() {
        clickButton(driver).xpath(locatorsCardApplicationPage().cardDeliveryUseWorkAddressRadioButton()).click();
        return this;
    }

    public CardApplication clickAvailSupplementaryCardNo() {
        clickButton(driver).xpath(locatorsCardApplicationPage().availSupplementaryCardNoRadioButton()).click();
        sleep(1000);
        return this;
    }

    public CardApplication clickAvailSupplementaryCardYes() {
        clickButton(driver).xpath(locatorsCardApplicationPage().availSupplementaryCardYesRadioButton()).click();
        sleep(2000);
        return this;
    }

    public CardApplication selectSupSalutation(String supSalutation) {
        selectizeDropdown(driver).dropdownLocator(locatorsCardApplicationPage().supplementarySalutationDropdown()).setText(supSalutation).select();
        return this;
    }

    public CardApplication setSupFirstName(String supFirstName) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryFirstNameTextfield()).setText(supFirstName);
        return this;
    }

    public CardApplication setSupMiddleName(String supMiddleName) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryMiddleNameTextfield()).setText(supMiddleName);
        return this;
    }

    public CardApplication setSupLastName(String supLastName) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryLastNameTextfield()).setText(supLastName);
        return this;
    }

    public CardApplication setSupNameToAppearOnCard(String supNameToAppearOnCard) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryNameToAppearOnCardTextfield()).setText(supNameToAppearOnCard);
        return this;
    }

    public CardApplication selectSupBirthDate(String month, String year, String day) {
        datePicker()
                .locator(locatorsCardApplicationPage().supplementaryBirthdateTextfield())
                .click()
                .selectMonth(month)
                .selectYear(year)
                .selectDay(day);
        return this;
    }

    public CardApplication setRelationshipWithPrincipal(String relationshipWithPrincipal) {
        textfield(driver).xpath(locatorsCardApplicationPage().relationshipWithPrincipalTextfield()).setText(relationshipWithPrincipal);
        return this;
    }

    public CardApplication setSupPresentAddress(String supPresentAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryPresentAddressTextfield()).setText(supPresentAddress);
        return this;
    }

    public CardApplication checkSupSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().supplementarySameAsPresentAddressCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().supplementarySameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public CardApplication uncheckSupSameAsPresentAddress() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().supplementarySameAsPresentAddressCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().supplementarySameAsPresentAddressCheckbox()).check();
            sleep(2000);
        }
        return this;
    }

    public CardApplication setSupPermanentAddress(String supPermanentAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryPermanentAddressTextfield()).setText(supPermanentAddress);
        return this;
    }

    public CardApplication setSupEmailAddress(String supEmailAddress) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryEmailAddressTextfield()).setText(supEmailAddress);
        return this;
    }

    public CardApplication setSupMobileNumberAreaCode(String supMobileNumberAreaCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryMobileNumberAreaCodeTextfield()).setText(supMobileNumberAreaCode);
        return this;
    }

    public CardApplication setSupMobileNumber(String supMobileNumber) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryMobileNumberTextfield()).setText(supMobileNumber);
        return this;
    }

    public CardApplication setSupPhoneNumberAreaCode(String supPhoneNumberAreaCode) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryPhoneNumberAreaCodeTextfield()).setText(supPhoneNumberAreaCode);
        return this;
    }

    public CardApplication setSupPhoneNumber(String supPhoneNumber) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryPhoneNumberTextfield()).setText(supPhoneNumber);
        return this;
    }

    public CardApplication clickSupTIN() {
        clickButton(driver).xpath(locatorsCardApplicationPage().supplementaryTinRadioButton()).click();
        return this;
    }

    public CardApplication setSupTIN(String supTIN) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryTinTextfield()).setText(supTIN);
        return this;
    }

    public CardApplication clickSupSSS() {
        clickButton(driver).xpath(locatorsCardApplicationPage().supplementarySssRadioButton()).click();
        return this;
    }

    public CardApplication setSupSSS(String supSSS) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementarySssTextfield()).setText(supSSS);
        return this;
    }

    public CardApplication clickSupGSIS() {
        clickButton(driver).xpath(locatorsCardApplicationPage().supplementaryGsisRadioButton()).click();
        return this;
    }

    public CardApplication setSupGSIS(String supGSIS) {
        textfield(driver).xpath(locatorsCardApplicationPage().supplementaryGsisTextfield()).setText(supGSIS);
        return this;
    }

    public CardApplication setSubLimit(String subLimit) {
        textfield(driver).xpath(locatorsCardApplicationPage().subLimitTextfield()).setText(subLimit);
        return this;
    }

    public CardApplication checkAgreement() {
        textfield(driver).xpath(locatorsCardApplicationPage().agreementCheckbox()).pageDown();
        if(seleniumExtension().xpath(locatorsCardApplicationPage().agreementCheckbox()).isSelected() == false) {
            checkbox(driver).xpath(locatorsCardApplicationPage().agreementCheckbox()).check();
        }
        return this;
    }

    public CardApplication uncheckAgreement() {
        if(seleniumExtension().xpath(locatorsCardApplicationPage().agreementCheckbox()).isSelected() == true) {
            checkbox(driver).xpath(locatorsCardApplicationPage().agreementCheckbox()).check();
        }
        return this;
    }

    public CardApplication checkImNotARobot() {
        sikuliExtension().screenshot(locatorsCardApplicationPage().imNotARobotCheckbox()).mouseMove().doubleClick();
        sleep(5000);
        return this;
    }

    public Boolean clickSubmitForm() {
        clickButton(driver).xpath(locatorsCardApplicationPage().submitFormButton()).click();
        sleep(2000);
        loader().waitForLoaderNotVisible();
        seleniumExtension().waitForElementVisible("xpath", locatorsReviewApplicationPage().editPersonalInformationButton());
        return seleniumExtension().isElementVisible("xpath", locatorsReviewApplicationPage().editPersonalInformationButton());
    }
}

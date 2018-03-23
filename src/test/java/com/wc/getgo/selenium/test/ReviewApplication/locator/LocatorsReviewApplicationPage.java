package com.wc.getgo.selenium.test.ReviewApplication.locator;

public class LocatorsReviewApplicationPage {

    public static LocatorsReviewApplicationPage locatorsReviewApplicationPage() {
        return new LocatorsReviewApplicationPage();
    }

    //PERSONAL INFORMATION
    public String editPersonalInformationButton() {
        return "//a[@data-target='#personal-info']/span";
    }

    public String cardHoldersName() {
        return "//*[@id=\"personal-info\"]/div[2]/div[1]/div[2]/span";
    }

    public String nameToAppearOnCard() {
        return "//*[@id=\"personal-info\"]/div[2]/div[2]/div[2]/span";
    }

    public String birthdate() {
        return "//*[@id=\"personal-info\"]/div[2]/div[3]/div[1]/span";
    }

    public String placeOfBirth() {
        return "//*[@id=\"personal-info\"]/div[2]/div[3]/div[2]/span";
    }

    public String nationalityOrCitizenship() {
        return "//*[@id=\"personal-info\"]/div[2]/div[3]/div[3]/span";
    }

    public String civilStatus() {
        return "//*[@id=\"personal-info\"]/div[2]/div[3]/div[4]/span";
    }

    public String mothersMaidenName() {
        return "//*[@id=\"personal-info\"]/div[2]/div[4]/div[2]/span";
    }

    public String salutationDropdown() {
        return "//select[@name='title']/following-sibling::div/div";
    }

    public String selectedSalutation() {
        return "//select[@name='title']/following-sibling::div/div/div";
    }

    public String firstNameTextfield() {
        return "//input[@name='fname']";
    }

    public String middleNameTextfield() {
        return "//input[@name='mname']";
    }

    public String lastNameTextfield() {
        return "//input[@name='lname']";
    }

    public String nameToAppearOnCardTextfield() {
        return "//input[@name='embossname1']";
    }

    public String birthdateTextfield() {
        return "//input[@id='bday']";
    }

    public String placeOfBirthTextfield() {
        return "//input[@name='bPlace']";
    }

    public String nationalityOrCitizenshipTextfield() {
        return "//input[@name='nationality']";
    }

    public String nationalityOrCitizenshipDropdown() {
        return "//select[@name='nationality']";
    }

    public String civilStatusDropdown() {
        return "//select[@name='civilstat']/following-sibling::div/div";
    }

    public String mothersMaidenNameTextfield() {
        return "//input[@name='mothermaidenname']";
    }

    //CONTACT DETAILS
    public String editContactDetailsButton() {
        return "//a[@data-target='#contact-info']/span";
    }

    public String presentAddress1() {
        return "//*[@id=\"contact-info\"]/div[2]/div[1]/div[2]/p[1]";
    }

    public String presentAddress2() {
        return "//*[@id=\"contact-info\"]/div[2]/div[1]/div[2]/p[2]";
    }

    public String permanentAddress1() {
        return "//*[@id=\"contact-info\"]/div[2]/div[2]/div[2]/p[1]";
    }

    public String permanentAddress2() {
        return "//*[@id=\"contact-info\"]/div[2]/div[2]/div[2]/p[2]";
    }

    public String homeOwnership() {
        return "//*[@id=\"contact-info\"]/div[2]/div[3]/div[1]/span";
    }

    public String yearsOfStay() {
        return "//*[@id=\"lengthofstay_y\"]";
    }

    public String emailAddress() {
        return "//*[@id=\"email\"]";
    }

    public String mobileNumber() {
        return "//*[@id=\"contact-info\"]/div[2]/div[4]/div[2]/span";
    }

    public String phoneNumber() {
        return "//*[@id=\"contact-info\"]/div[2]/div[4]/div[3]/span";
    }

    public String presentAddressTextfield() {
        return "//input[@name='resadd1']";
    }

    public String presentProvinceDropdown() {
        return "//select[@id='revProvince']/following-sibling::div/div";
    }

    public String selectedPresentProvince() {
        return "//select[@name='revProvince']/following-sibling::div/div/div";
    }

    public String presentCityDropdown() {
        return "//select[@id='revRescity']/following-sibling::div/div";
    }

    public String presentPostalCodeTextfield() {
        return "//input[@id='revRepostalcode']";
    }

    public String homeOwnershipDropdown() {
        return "//select[@name='res_ownership']/following-sibling::div/div";
    }

    public String yearsOfStayTextfield() {
        return "//input[@name='lengthofstay_y']";
    }

    public String selectedPresentCity() {
        return "//select[@name='revResCity']/following-sibling::div/div/div";
    }

    public String sameAsPresentAddressCheckbox() {
        return "//input[@id='res_same']";
    }

    public String permanentAddressTextfield() {
        return "//input[@id='revPermanentAddress']";
    }

    public String permanentProvinceDropdown() {
        return "//select[@id='revAltresprovince']/following-sibling::div/div";
    }

    public String permanentCityDropdown() {
        return "//select[@id='revAltrescity']/following-sibling::div/div";
    }

    public String permanentPostalCodeTextfield() {
        return "//input[@id='revAltrepostalcode']";
    }

    public String emailAddressTextfield() {
        return "//input[@name='email']";
    }

    public String mobileNumberAreaCodeTextfield() {
        return "//input[@name='mob_area_code']";
    }

    public String mobileNumberTextfield() {
        return "//input[@name='mob_num']";
    }

    public String phoneNumberAreaCodeTextfield() {
        return "//input[@name='tel_area_code']";
    }

    public String phoneNumberTextfield() {
        return "//input[@name='tel_num']";
    }

    //FINANCIAL INFORMATION
    public String editFinancialInformationButton() {
        return "//a[@data-target='#financial-info']/span";
    }

    public String employmentStatus() {
        return "//span[@id='empbizstatus']";
    }

    public String employerOrBusinessName() {
        return "//span[@id='empbizname']";
    }

    public String occupationGroup() {
        return "//*[@id=\"empbizposgroup\"]";
    }

    public String occupationOrPosition() {
        return "//span[@id='jobpos']";
    }

    public String businessIndustry() {
        return "//span[@id='empbizindustry']";
    }

    public String yearsOfStayWork() {
        return "//*[@id=\"empbiz_y\"]";
    }

    public String businessAddress1() {
        return "//form/div/div[3]/div[2]/div[2]/div[2]/p";
    }

    public String businessAddress2() {
        return "//*[@id=\"financial-info\"]/div[2]/div[2]/div[2]/p[2]";
    }

    public String workPhoneNumber() {
        return "//span[@id='empbizphone']";
    }

    public String idPresented() {
        return "//*[@id=\"financial-info\"]/div[2]/div[3]/div[2]/div/span";
    }

    public String idPresentedCreditCard() {
        return "//*[@id=\"financial-info\"]/div[2]/div[4]/div[2]/div/span";
    }

    public String grossAnnualIncome() {
        return "//*[@id=\"empbizannualincome\"]";
    }

    public String sourceOfFunds() {
        return "//span[@id='fund_src']";
    }

    public String existingCreditCardholder() {
        return "//*[@id=\"cardsotherbank\"]";
    }

    public String creditCardRowNumber1() {
        return "//*[@id=\"financial-info\"]/div[2]/div[5]/div[2]/div[2]/div[1]/span";
    }

    public String creditCardRowNumber2() {
        return "//*[@id=\"financial-info\"]/div[2]/div[5]/div[2]/div[3]/div[1]/span";
    }

    public String creditCardBankName1() {
        return "//*[@id=\"financial-info\"]/div[2]/div[5]/div[2]/div[2]/div[2]/span";
    }

    public String creditCardBankName2() {
        return "//*[@id=\"financial-info\"]/div[2]/div[5]/div[2]/div[3]/div[2]/span";
    }

    public String creditCardNumber1() {
        return "//*[@id=\"financial-info\"]/div[2]/div[5]/div[2]/div[2]/div[3]/span";
    }

    public String creditCardNumber2() {
        return "//*[@id=\"financial-info\"]/div[2]/div[5]/div[2]/div[3]/div[3]/span";
    }

    public String acceptableID() {
        return "//*[@id=\"upload-docs\"]/div[2]/div[1]/div[2]/p";
    }

    public String noProofOfIncomeUploaded() {
        return "//*[@id=\"upload-docs\"]/div[2]/div[2]/div[2]/span";
    }

    public String employmentStatusDropdown() {
        return "//select[@id='empbizstatus']/following-sibling::div/div";
    }

    public String employerOrBusinessNameTextfield() {
        return "//input[@name='empbizname']";
    }

    public String occupationGroupDropdown() {
        return "//select[@name='empbizposgroup']/following-sibling::div/div";
    }

    public String occupationOrPositionDropdown() {
        return "//select[@name='jobpos']/following-sibling::div/div";
    }

    public String businessIndustryDropdown() {
        return "//select[@name='empbizindustry']/following-sibling::div/div";
    }

    public String businessAddressTextfield() {
        return "//input[@name='empbizaddress']";
    }

    public String workProvinceDropdown() {
        return "//select[@id='revEmpbizaddprovince']/following-sibling::div/div";
    }

    public String workCityDropdown() {
        return "//select[@id='revEmpbizaddcity']/following-sibling::div/div";
    }

    public String  totalYearsInWorkOrBusinessTextfield() {
        return "//input[@name='empbiz_y']";
    }

    public String workPostCodeTextfield() {
        return "//input[@id='revEmpbizaddpostalcode']";
    }

    public String workPhoneNumberAreaCodeTextfield() {
        return "//input[@name='wtel_area_code']";
    }

    public String workPhoneNumberTextfield() {
        return "//input[@name='wtel_num']";
    }

    public String grossAnnualIncomeTextfield() {
        return "//input[@name='empbizannualincome']";
    }

    public String tinRadioButton() {
        return "//input[@value='tin']";
    }

    public String tinTextfield() {
        return "//input[@id='reviewtin']";
    }

    public String sssRadioButton() {
        return "//input[@value='sss']";
    }

    public String sssTextfield() {
        return "//input[@id='reviewsss']";
    }

    public String gsisRadioButton() {
        return "//input[@value='gsis']";
    }

    public String gsisTextfield() {
        return "//input[@id='reviewgsis']";
    }

    public String businessIncomeCheckbox() {
        return "//input[@value='0|Business Income']";
    }

    public String rentalIncomeCheckbox() {
        return "//input[@value='1|Rental Income']";
    }

    public String investmentCheckbox() {
        return "//input[@value='2|Investment']";
    }

    public String personalSavingsCheckbox() {
        return "//input[@value='3|Personal Savings']";
    }

    public String salaryCheckbox() {
        return "//input[@value='4|Salary']";
    }

    public String inheritanceCheckbox() {
        return "//input[@value='5|Inheritance']";
    }

    public String saleOfPropertyCheckbox() {
        return "//input[@value='6|Sale of Property']";
    }

    public String pensionCheckbox() {
        return "//input[@value='7|Pension']";
    }

    public String othersCheckbox() {
        return "//input[@id='others']";
    }

    public String othersTextfield() {
        return "//input[@id='otherDetails']";
    }

    public String othersTextfieldClass() {
        return "//div[contains(@class, 'form-group col-sm-4 otherDetails')]";
    }

    public String cardBankName1Dropdown() {
        return "//div[@class='row card' and @id='card_0']/div/select";
    }

    public String creditCardNumber1Textfield() {
        return "//*[@id=\"card_0\"]/div[2]/div/input[@id='cardno_0']";
    }

    public String cardBankName2Dropdown() {
        return "//*[@id=\"card_1\"]/div/select";
    }

    public String creditCardNumber2Textfield() {
        return "//*[@id=\"card_1\"]/div[2]/div/input[@id='cardno_0']";
    }

    public String addCreditCardButton() {
        return "//button[@class='btn btn-primary add_other_card']";
    }

    public String removeCreditCardButton() {
        return "//*[@id=\"card_1\"]/div[3]/button";
    }

    //Documents
    public String editUploadDocumentsButton() {
        return "//*[@id=\"upload-docs\"]/h2/a/span";
    }

    public String searchField() {
        return "images/searchField.png";
    }

    //OTHER INSTRUCTIONS
    public String editOtherInstructionsButton() {
        return "//a[@data-target='#other-instructions']";
    }

    public String usePresentAddressRadioButton() {
        return "//input[@id='billingaddress1']";
    }

    public String useWorkAddressRadioButton() {
        return "//input[@id='billingaddress2']";
    }

    public String mailingAddress() {
        return "//*[@id=\"other-instructions\"]/div[2]/div/div[2]/span";
    }

    public String billingAddress() {
        return "//*[@id=\"other-instructions\"]/div[2]/div[1]/div[2]/span";
    }

    public String deliveryAddress() {
        return "//*[@id=\"other-instructions\"]/div[2]/div[2]/div[2]/span";
    }

    public String useBillingPresentAddressRadioButton() {
        return "//*[@id=\"billingaddress1\"]";
    }

    public String useDeliveryPresentAddressRadioButton() {
        return "//*[@id=\"deliveryaddress1\"]";
    }

    public String useBillingWorkAddressRadioButton() {
        return "//*[@id=\"billingaddress2\"]";
    }

    public String useDeliveryWorkAddressRadioButton() {
        return "//*[@id=\"deliveryaddress2\"]";
    }

    //ADDITIONAL OPTIONS
    public String editAdditionalOptionsButton() {
        return "//a[@data-target='#additional-options']/span";
    }

    public String supNameToAppearOnCardTextfield() {
        return "//input[@name='supemboss[]']";
    }

    public String availSupplementaryCard() {
        return "//*[@id=\"additional-options\"]/div[2]/div[1]/div[2]/span";
    }

    public String supSalutation() {
        return "//span[1][@id=\"supfname\"]";
    }

    public String supFirstname() {
        return "//span[2][@id=\"supfname\"]";
    }

    public String supMiddlename() {
        return "//span[3][@id=\"supmname\"]";
    }

    public String supLastname() {
        return "//span[4][@id=\"supfname\"]";
    }

    public String supNameToAppearOnCard() {
        return "//form/div[6]/div[2]/div[2]/div[1]/div/div[4]/span[@class='supemboss']";
    }

    public String supNameBirthdate() {
        return "//*[@id=\"supplementary_fields0\"]/div/div[6]/span";
    }

    public String relationshipWithPrincipal() {
        return "//*[@id=\"supplementary_fields0\"]/div/div[8]/span";
    }

    public String supPresentAddress() {
        return "//*[@id=\"supplementary_fields0\"]/div/div[10]/span";
    }

    public String supPermanentAddress() {
        return "//*[@id=\"suppermaddress\"]";
    }

    public String supPhoneNumber() {
        return "//*[@id=\"supplementary_fields0\"]/div/div[14]/span";
    }

    public String supMobileNumber() {
        return "//*[@id=\"supmobile\"]";
    }

    public String supEmailAddress() {
        return "//*[@id=\"supemail\"]";
    }

    public String supIdNumberPresented() {
        return "//*[@id=\"supplementary_fields0\"]/div/div[20]/span";
    }

    public String subCreditLimit() {
        return "//*[@id=\"supplementary_fields0\"]/div/div[22]/span";
    }

    public String availSupplementaryCardYesRadioButton() {
        return "//input[@name='withsupplementary' and @value='1']";
    }

    public String availSupplementaryCardNoRadioButton() {
        return "//input[@name='withsupplementary' and @value='0']";
    }

    public String supplementarySalutationDropdown() {
        return "//select[@name='supsalutation[]']/following-sibling::div/div";
    }

    public String selectedSupSalutation() {
        return "//select[@name='supsalutation[]']/following-sibling::div/div/div";
    }

    public String supplementaryFirstNameTextfield() {
        return "//input[@name='supfname[]']";
    }

    public String supplementaryMiddleNameTextfield() {
        return "//input[@name='supmname[]']";
    }

    public String supplementaryLastNameTextfield() {
        return "//input[@name='suplname[]']";
    }

    public String supplementaryNameToAppearOnCardTextfield() {
        return "//input[@name='supemboss[]']";
    }

    public String supplementaryBirthdateTextfield() {
        return "//input[@name='supDOB[]']";
    }

    public String relationshipWithPrincipalTextfield() {
        return "//input[@name='suprelationship[]']";
    }

    public String supplementaryPresentAddressTextfield() {
        return "//input[@name='suppresentaddress[]']";
    }

    public String supplementarySameAsPresentAddressCheckbox() {
        return "//input[@name='supres_same[]']";
    }

    public String supplementaryPermanentAddressTextfield() {
        return "//input[@name='suppermaddress[]']";
    }

    public String supplementaryEmailAddressTextfield() {
        return "//input[@name='supemail[]']";
    }

    public String supplementaryMobileNumberAreaCodeTextfield() {
        return "//input[@name='supmob_area_code[]']";
    }

    public String supplementaryMobileNumberTextfield() {
        return "//input[@name='supmob_num[]']";
    }

    public String supplementaryPhoneNumberAreaCodeTextfield() {
        return "//input[@name='suptel_area_code[]']";
    }

    public String supplementaryPhoneNumberTextfield() {
        return "//input[@name='suptel_num[]']";
    }

    public String supplementaryTinRadioButton() {
        return "//input[@value='suptin']";
    }

    public String supplementaryTinTextfield() {
        return "//input[@id='suptin']";
    }

    public String supplementarySssRadioButton() {
        return "//input[@value='supsss']";
    }

    public String supplementarySssTextfield() {
        return "//input[@id='supsss']";
    }

    public String supplementaryGsisRadioButton() {
        return "//input[@value='supgsis']";
    }

    public String supplementaryGsisTextfield() {
        return "//input[@id='supgsis']";
    }

    public String subLimitTextfield() {
        return "//input[@name='supcreditlimit[]']";
    }

    //BUTTON

    public String submitFormButton() {
        return "//button[@name='send']";
    }

    public String continueButton() {
        return "//a[contains(text(), 'Continue')]";
    }
}

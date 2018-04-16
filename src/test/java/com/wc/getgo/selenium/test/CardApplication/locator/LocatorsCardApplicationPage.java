package com.wc.getgo.selenium.test.CardApplication.locator;

public class LocatorsCardApplicationPage {

    public static LocatorsCardApplicationPage locatorsCardApplicationPage() {
        return new LocatorsCardApplicationPage();
    }

    //FORM PROGRESS
    public String personalInfoProgress() {
        return "//div[@class='stage']/span";
    }

    public String contactDetailsProgress() {
        return "//div[2][@class='stage']/span";
    }

    public String financialInformationProgress() {
        return "//div[3][@class='stage']/span";
    }

    public String otherInstructionsProgress() {
        return "//div[4][@class='stage']/span";
    }

    //PERSONAL INFORMATION
    public String salutationDropdown() {
        return "//select[@name='title']/following-sibling::div/div";
    }

    public String selectedSalutation() {
        return "//select[@name='title']/following-sibling::div/div/div";
    }

    public String firstNameTextfield() {
        return "//input[@id='fname']";
    }

    public String middleNameTextfield() {
        return "//input[@id='mname']";
    }

    public String lastNameTextfield() {
        return "//input[@id='lname']";
    }

    public String nameToAppearOnCardTextfield() {
        return "//input[@name='embossname1']";
    }

    public String birthdateTextfield() {
        return "//input[@id='bday']";
    }

    public String placeOfBirthTextfield() {
        return "//input[@id='bPlace']";
    }

    public String nationalityOrCitizenshipTextfield() {
        return "//input[@id='nationality']";
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
    public String presentAddressTextfield() {
        return "//input[@name='resadd1']";
    }

    public String presentProvinceDropdown() {
        return "//select[@id='regiResProvince']/following-sibling::div/div";
    }

    public String presentCityDropdown() {
        return "//select[@id='regisResCity']/following-sibling::div/div";
    }

    public String presentPostalCode() {
        return "//input[@name='repostalcode']";
    }

    public String sameAsPresentAddressCheckbox() {
        return "//input[@id='res_same']";
    }

    public String permanentAddressTextfield() {
        return "//input[@id='permanentAddress']";
    }

    public String permanentProvinceDropdown() {
        return "//select[@id='altresprovince']/following-sibling::div/div";
    }

    public String permanentCityDropdown() {
        return "//select[@name='altrescity']/following-sibling::div/div";
    }

    public String permanentPostalCodeTextfield() {
        return "//input[@name='altrepostalcode']";
    }

    public String homeOwnershipDropdown() {
        return "//select[@name='res_ownership']/following-sibling::div/div";
    }

    public String yearsOfStayTextfield() {
        return "//input[@name='lengthofstay_y']";
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
        return "//select[@id='empbizaddprovince']/following-sibling::div/div";
    }

    public String workCityDropdown() {
        return "//select[@id='empbizaddcity']/following-sibling::div/div";
    }

    public String workPostalCodeTextfield() {
        return "//input[@name='empbizaddpostalcode']";
    }

    public String  totalYearsInWorkOrBusinessTextfield() {
        return "//input[@name='empbiz_y']";
    }

    public String workPhoneNumberAreaCodeTextfield() {
        return "//input[@name='wtel_area_code']";
    }

    public String workPhoneNumberTextfield() {
        return "//input[@name='wtel_num']";
    }

    public String tinRadioButton() {
        return "//input[@value='tin']";
    }

    public String tinTextfield() {
        return "//input[@id='tin']";
    }

    public String sssRadioButton() {
        return "//input[@value='sss']";
    }

    public String sssTextfield() {
        return "//input[@id='sss']";
    }

    public String gsisRadioButton() {
        return "//input[@value='gsis']";
    }

    public String gsisTextfield() {
        return "//input[@id='gsis']";
    }

    public String grossAnnualIncomeTextfield() {
        return "//input[@name='empbizannualincome']";
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

    public String existingCreditCardholderYesRadioButton() {
        return "//input[@name='cardholder' and @value='1']";
    }

    public String existingCreditCardholderNoRadioButton() {
        return "//input[@name='cardholder' and @value='0']";
    }

    public String cardBankName1Dropdown() {
        return "//div[@class='row card' and @id='card_0']/div/select";
    }

    public String creditCardNumber1Textfield() {
        return "//div[@class='row card' and @id='card_0']/div/div/input";
    }

    public String cardBankName2Dropdown() {
        return "//div[@class='row card' and @id='card_1']/div/select";
    }

    public String creditCardNumber2Textfield() {
        return "//div[@class='row card' and @id='card_1']/div/div/input";
    }

    public String addCreditCardButton() {
        return "//button[@class='btn btn-primary add_other_card']";
    }

    public String removeCreditCardButton() {
        return "//*[@id=\"card_1\"]/div[3]/button";
    }

    public String requirements() {
        return "//*[@id=\"requirements\"]";
    }

    public String uploadProofIncomeButton() {
        return "//*[@id=\"upload-docs\"]/div/div[2]/div[2]/input";
    }

    public String searchField() {
        return "images/searchField.png";
    }

    public String validID() {
        return "images/validID.png";
    }

    public String proofOfIncome() {
        return "images/proofOfIncome.png";
    }

    //OTHER INSTRUCTIONS
    public String usePresentAddressRadioButton() {
        return "//input[@id='billingaddress1']";
    }

    public String useWorkAddressRadioButton() {
        return "//input[@id='billingaddress2']";
    }

    public String billingAddressUsePresentAddressRadioButton() {
        return "//input[@id='billingaddress1']";
    }

    public String billingAddressUseWorkAddressRadioButton() {
        return "//input[@id='billingaddress2']";
    }

    public String cardDeliveryUsePresentAddressRadioButton() {
        return "//input[@id='deliveryaddress1']";
    }

    public String cardDeliveryUseWorkAddressRadioButton() {
        return "//input[@id='deliveryaddress2']";
    }

    //ADDITIONAL OPTIONS
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

    //
    public String agreementCheckbox() {
        return "//input[@name='agree']";
    }

    public String imNotARobotCheckbox() {
        return "images/imnotarobot.png";
    }

    public String saveForLaterButton() {
        return "//button[@id='saveforlater']";
    }

    public String submitFormButton() {
        return "//button[@name='send']";
    }
}

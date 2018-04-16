package com.wc.getgo.selenium.test.CardApplication.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.test.Banner.method.Banner.banner;
import static com.wc.getgo.selenium.test.CardApplication.locator.LocatorsCardApplicationPage.locatorsCardApplicationPage;
import static com.wc.getgo.selenium.test.CardApplication.method.CardApplication.cardApplication;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static com.wc.getgo.selenium.test.ReviewApplication.locator.LocatorsReviewApplicationPage.locatorsReviewApplicationPage;
import static com.wc.getgo.selenium.test.ReviewApplication.method.ReviewApplication.reviewApplication;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CreditCardApplicationTest_2 extends Seleniumbase {

    /** QA Report URL: https://docs.google.com/spreadsheets/d/1Vg5p_TWKd7y_ddan48A2ZYt_CEP-sXcLzb09NMW0rDg **/

    private String title = generateFakeData().title();
    private String firstName = generateFakeData().firstName();
    private String middleName = "Buena";
    private String lastName = generateFakeData().lastName();
    private String mothersMaidenName = String.format("%s %s %s", generateFakeData().firstName(), "Manalo", generateFakeData().lastName());
    private String placeOfBirth = generateFakeData().placeOfBirth();
    private String nationalityOrCitizenship = generateFakeData().nationality();
    private String civilStatus = generateFakeData().civilStatus();
    private String presentAddress = generateFakeData().address();
    private String presentProvince = "Metro Manila";
    private String presentCity = "Valenzuela";
    private String presentPostalCode = "1440";
    private String permanentAddress = generateFakeData().address();
    private String permanentProvince = "Nueva Ecija";
    private String permanentCity = "Cuyapo";
    private String permanentPostalCode = "3117";
    private String homeOwnership = generateFakeData().homeOwnership();
    private String yearsOfStay = generateFakeData().yearsOfStay();
    private String emailAddress = generateFakeData().email();
    private String mobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String mobileNumber = generateFakeData().mobileNumber();
    private String phoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String phoneNumber = generateFakeData().phoneNumber();
    private String birthDate = "1993-08-30";
    private String supSalutation = generateFakeData().supTitle();
    private String supFirstName = generateFakeData().firstName();
    private String supMiddleName = "Anda";
    private String supLastName = generateFakeData().lastName();
    private String supNameToAppearOnCard = String.format("%s %s %s", supFirstName, supMiddleName.substring(0, 1), supLastName);
    private String supBMonth = "Nov";
    private String supBYear = "2018";
    private String supDay = "23";
    private String supBirthDate = String.format("%s-%s-%s", supBYear, "11", supDay);
    private String relationshipWithThePrincipal = generateFakeData().relationshipWithPrincipal();
    private String supPresentAddress = generateFakeData().address();
    private String supPermanentAddress = generateFakeData().address();
    private String supEmailAddress = generateFakeData().email();
    private String supMobileNumberAreaCode = generateFakeData().mobileAreaCode();
    private String supMobileNumber = generateFakeData().mobileNumber();
    private String supPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String supPhoneNumber = generateFakeData().phoneNumber();
    private String supTIN = generateFakeData().tin();
    private String subLimit = generateFakeData().subLimitAmount();

    private String employmentStatus = generateFakeData().employmentStatus();
    private String employerOrBusinessName = generateFakeData().companyName();
    private String occupationGroup = generateFakeData().occupationGroup();
    private String occupationOrPosition = generateFakeData().occupation();
    private String businessIndustry = generateFakeData().businessIndustry();
    private String businessAddress = generateFakeData().address();
    private String businessProvince = "Metro Manila";
    private String businessCity = "Marikina";
    private String businessPhoneNumberAreaCode = generateFakeData().phoneAreaCode();
    private String businessPhoneNumber = generateFakeData().phoneNumber();
    private String sss = generateFakeData().sssNumber();
    private String sourceOfFunds = "Salary";
    private String sourceOfFunds2 = "Investment";
    private String totalYearsInWorkOrBusiness = generateFakeData().yearsOfStay();
    private String grossAnnualIncome = generateFakeData().grossAnnualIncome();

    private String billingAddress = "Use Present Address";
    private String deliveryAddress = "Use Present Address";
    private String cardBankName1 = "Citibank";
    private String cardBankName2 = "Banco De Oro";
    private String cardBankNumber1 = generateFakeData().creditCardNumber();
    private String cardBankNumber2 = generateFakeData().creditCardNumber();

    @Test
    public void verifyIssueNumber3Test() {
        logData();
        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(banner().clickPlatinum());
        assertTrue(banner().clickApplyForPlatinum());
        assertTrue(banner().clickNo());
        assertTrue(banner().clickNext());

        cardApplication()
                .selectSalutation(title)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .selectBirthDate("Aug", "1993", "30")
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
                .setMobileNumber(mobileNumber);
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().personalInfoProgress(), "class").contains("count pcheck"));
    }

    @Test(dependsOnMethods = "verifyIssueNumber3Test")
    public void verifyIssueNumber31Test() {
        assertTrue(seleniumExtension().getAttribute(locatorsCardApplicationPage().contactDetailsProgress(), "class").contains("count pcheck"));
        cardApplication()
                .setPhoneNumberAreaCode(phoneNumberAreaCode).setPhoneNumber(phoneNumber);
    }

    @Test(dependsOnMethods = "verifyIssueNumber31Test")
    public void verifyIssueNumber4_48Test() throws FindFailed {
        cardApplication()
                .selectEmploymentStatus(employmentStatus)
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
                .clickBillingUseWorkAddress()
                .clickCardDeliveryUseWorkAddress()
                .selectEmploymentStatus("Retired")
                .clickSSS()
                .setSSS(sss)
                .setGrossAnnualIncome(grossAnnualIncome)
                .checkSalary()
                .checkInvestment()
                .clickExistingCreditCardholderYes()
                .selectCardBankName1(cardBankName1)
                .setCreditCardNumber1(cardBankNumber1)
                .clickAdd()
                .selectCardBankName2(cardBankName2)
                .setCreditCardNumber2(cardBankNumber2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        sleep(500);

        cardApplication()
                .clickUploadAcceptableIds().searchFile("validID.jpg").clickFile("images/validID.png");

        cardApplication()
                .clickAvailSupplementaryCardYes()
                .selectSupSalutation(supSalutation)
                .setSupFirstName(supFirstName)
                .setSupMiddleName(supMiddleName)
                .setSupLastName(supLastName)
                .selectSupBirthDate(supBMonth, supBYear, supDay)
                .setRelationshipWithPrincipal(relationshipWithThePrincipal)
                .setSupPresentAddress(supPresentAddress)
                .setSupPermanentAddress(supPermanentAddress)
                .setSupEmailAddress(supEmailAddress)
                .setSupMobileNumberAreaCode(supMobileNumberAreaCode)
                .setSupMobileNumber(supMobileNumber)
                .setSupPhoneNumberAreaCode(supPhoneNumberAreaCode)
                .setSupPhoneNumber(supPhoneNumber)
                .clickSupTIN()
                .setSupTIN(supTIN)
                .setSubLimit(subLimit)
                .checkAgreement();
        cardApplication().checkImNotARobot();
        cardApplication().clickSubmitForm();
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void verifyReviewPersonalInformationTest() {
        String cardHoldersName = String.format("%s %s %s %s", title, firstName.toUpperCase(), middleName.toUpperCase(), lastName.toUpperCase());
        String middleInitial = middleName.substring(0, 1);
        String nameToAppearOnCard = String.format("%s %s %s", firstName, middleInitial, lastName);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().cardHoldersName()), cardHoldersName);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().nameToAppearOnCard()), nameToAppearOnCard.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().birthdate()), birthDate);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().placeOfBirth()), placeOfBirth.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().nationalityOrCitizenship()), nationalityOrCitizenship.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().civilStatus()), civilStatus.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().mothersMaidenName()), mothersMaidenName.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void verifyReviewContactDetailsTest() {
        String presentAddress2 = String.format("%s, %s, %s", presentCity, presentProvince, presentPostalCode);
        String mobile = String.format("+63%s-%s", mobileNumberAreaCode, mobileNumber);
        String phone = String.format("%s-%s", phoneNumberAreaCode, phoneNumber);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentAddress1()), presentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().presentAddress2()), presentAddress2.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentAddress1()), permanentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().homeOwnership()), homeOwnership);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().yearsOfStay()), String.format("%s yr/s", yearsOfStay));
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().emailAddress()), emailAddress);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().mobileNumber()), mobile);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().phoneNumber()), phone);
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void  verifyIssueNumber18Test() {
        String permanentAddress2 = String.format("%s, %s, %s", permanentCity, permanentProvince, permanentPostalCode);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().permanentAddress2()), permanentAddress2.toUpperCase());
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void verifyReviewFinancialInformationRetiredTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employmentStatus()), "RETIRED");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().employerOrBusinessName()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationGroup()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().occupationOrPosition()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessIndustry()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().yearsOfStayWork()), "--- yr/s");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().businessAddress1()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().workPhoneNumber()), "---");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().idPresentedCreditCard()), sss);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().grossAnnualIncome()), grossAnnualIncome);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().sourceOfFunds()), String.format("%s, %s", sourceOfFunds2, sourceOfFunds));
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().existingCreditCardholder()), "Yes");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().creditCardRowNumber1()), "1");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().creditCardRowNumber2()), "2");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().creditCardBankName1()), "CITI");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().creditCardBankName2()), "BDO");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().creditCardNumber1()), cardBankNumber1);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().creditCardNumber2()), cardBankNumber2);
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void verifyReviewUploadDocumentsTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().acceptableID()), "validID.jpg");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().noProofOfIncomeUploaded()), "No FILE UPLOADED");
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void verifyReviewOtherInstructionsTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().billingAddress()), billingAddress);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().deliveryAddress()), deliveryAddress);
    }

    @Test(dependsOnMethods = "verifyIssueNumber4_48Test")
    public void verifyReviewAdditionalOptionsTest() {
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().availSupplementaryCard()), "Yes");
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supSalutation()), supSalutation.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supFirstname()), supFirstName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supMiddlename()), supMiddleName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supLastname()), supLastName.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supNameToAppearOnCard()), supNameToAppearOnCard.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supNameBirthdate()), supBirthDate);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().relationshipWithPrincipal()), relationshipWithThePrincipal.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supPresentAddress()), supPresentAddress.toUpperCase());
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supPermanentAddress()), supPermanentAddress.toUpperCase());

        String mobile = String.format("+63%s-%s", supMobileNumberAreaCode, supMobileNumber);
        String phone = String.format("%s-%s", supPhoneNumberAreaCode, supPhoneNumber);

        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supPhoneNumber()), phone);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supMobileNumber()), mobile);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().supEmailAddress()), supEmailAddress);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().idPresentedCreditCard()), sss);
        assertEquals(seleniumExtension().getText("xpath", locatorsReviewApplicationPage().subCreditLimit()), subLimit);
    }

    @Test(dependsOnMethods = "verifyReviewAdditionalOptionsTest")
    public void submitReviewApplicationTest() {
        assertTrue(reviewApplication().clickSubmitForm());
        assertTrue(reviewApplication().clickContinue());
    }

    private void logData() {
        System.out.println("title: " + title);
        System.out.println("firstName: " + firstName);
        System.out.println("middleName: " + middleName);
        System.out.println("lastName: " + lastName);
        System.out.println("placeOfBirth: " + placeOfBirth);
        System.out.println("nationalityOrCitizenship: " + nationalityOrCitizenship);
        System.out.println("civilStatus: " + civilStatus);
        System.out.println("presentAddress: " + presentAddress);
        System.out.println("presentProvince: " + presentProvince);
        System.out.println("presentCity: " + presentCity);
        System.out.println("presentPostalCode: " + presentPostalCode);
        System.out.println("permanentAddress: " + presentProvince);
        System.out.println("permanentProvince: " + permanentProvince);
        System.out.println("permanentCity: " + permanentCity);
        System.out.println("permanentPostalCode: " + permanentPostalCode);
        System.out.println("homeOwnership: " + homeOwnership);
        System.out.println("yearsOfStay: " + yearsOfStay);
        System.out.println("emailAddress: " + emailAddress);
        System.out.println("mobileNumberAreaCode: " + mobileNumberAreaCode);
        System.out.println("mobileNumber: " + mobileNumber);
        System.out.println("phoneNumberAreaCode: " + phoneNumberAreaCode);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("birthDate: " + birthDate);
        System.out.println("supSalutation: " + supSalutation);
        System.out.println("birthDate: " + birthDate);
        System.out.println("supFirstName: " + supFirstName);
        System.out.println("supMiddleName: " + supMiddleName);
        System.out.println("supLastName: " + supLastName);
        System.out.println("supNameToAppearOnCard: " + supNameToAppearOnCard);
        System.out.println("supBMonth: " + supBMonth);
        System.out.println("supBYear: " + supBYear);
        System.out.println("supDay: " + supDay);
        System.out.println("supBirthDate: " + supBirthDate);
        System.out.println("relationshipWithThePrincipal: " + relationshipWithThePrincipal);
        System.out.println("supPresentAddress: " + supPresentAddress);
        System.out.println("supPermanentAddress: " + supPermanentAddress);
        System.out.println("supEmailAddress: " + supEmailAddress);
        System.out.println("supMobileNumberAreaCode: " + supMobileNumberAreaCode);
        System.out.println("supMobileNumber: " + supMobileNumber);
        System.out.println("supPhoneNumberAreaCode: " + supPhoneNumberAreaCode);
        System.out.println("supPhoneNumber: " + supPhoneNumber);
        System.out.println("supTIN: " + supTIN);
        System.out.println("subLimit: " + subLimit);
        System.out.println("employmentStatus: " + employmentStatus);
        System.out.println("employerOrBusinessName: " + employerOrBusinessName);
        System.out.println("occupationGroup: " + occupationGroup);
        System.out.println("occupationOrPosition: " + occupationOrPosition);
        System.out.println("businessIndustry: " + businessIndustry);
        System.out.println("businessAddress: " + businessAddress);
        System.out.println("businessCity: " + businessCity);
        System.out.println("businessPhoneNumberAreaCode: " + businessPhoneNumberAreaCode);
        System.out.println("businessPhoneNumber: " + businessPhoneNumber);
        System.out.println("sss: " + sss);
        System.out.println("sourceOfFunds: " + sourceOfFunds);
        System.out.println("sourceOfFunds2: " + sourceOfFunds2);
        System.out.println("sourceOfFunds2: " + sourceOfFunds2);
        System.out.println("totalYearsInWorkOrBusiness: " + totalYearsInWorkOrBusiness);
        System.out.println("grossAnnualIncome: " + grossAnnualIncome);
        System.out.println("billingAddress: " + billingAddress);
        System.out.println("deliveryAddress: " + deliveryAddress);
        System.out.println("cardBankName1: " + cardBankName1);
        System.out.println("cardBankName2: " + cardBankName2);
        System.out.println("cardBankNumber1: " + cardBankNumber1);
        System.out.println("cardBankNumber2: " + cardBankNumber2);
    }
}

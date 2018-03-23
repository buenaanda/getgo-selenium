package com.wc.getgo.selenium.test.ContactUs.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.global.GenerateFakeData.generateFakeData;
import static com.wc.getgo.selenium.global.SeleniumExtension.seleniumExtension;
import static com.wc.getgo.selenium.test.ContactUs.locator.LocatorsContactUsPage.locatorsContactUsPage;
import static com.wc.getgo.selenium.test.ContactUs.method.ContactUs.contactUs;
import static com.wc.getgo.selenium.test.Footer.method.Footer.footer;
import static com.wc.getgo.selenium.test.Menu.locator.LocatorsNavigationMenu.locatorsNavigationMenu;
import static com.wc.getgo.selenium.test.Menu.method.NavigationMenu.navigationMenu;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ContactUsTest extends Seleniumbase {

    private String fullname = String.format("%s %s", generateFakeData().firstName(), generateFakeData().lastName());
    private String emailAddress = generateFakeData().email();
    private String contactNumber = String.format("0%s%s", generateFakeData().mobileAreaCode(), generateFakeData().mobileNumber());
    private String subject = "Debit Card Inquiry";
    private String message = "In this tutorial 101, we will learn about different types of alert found in web application Testing and how to handle Alert in Selenium WebDriver. We will also see how do we accept and reject the alert depending upon the alert types.";

    private String alphaNumericalSpecialCharacters = "123qwert!@#$%^&*)()";

    @Test
    public void verifyIssueNumber2Test() {
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));
        assertTrue(footer().clickContactUs());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));

        assertTrue(footer().clickContactUs());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));

        assertTrue(footer().clickFaq());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));

        assertTrue(footer().clickTermsAndConditions());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));

        assertTrue(footer().clickPrivacyAndPolicy());
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));

        assertTrue(navigationMenu().clickCreditCard());
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));

        assertTrue(navigationMenu().clickPromos());
        assertTrue(seleniumExtension().isElementVisible("xpath", locatorsNavigationMenu().howToApplyMenu()));
    }

    @Test(dependsOnMethods = "verifyIssueNumber2Test")
    public void submitWithoutSubjectTest() {
        assertTrue(footer().clickContactUs());
        assertFalse(contactUs()
                .setFullname(fullname)
                .setEmailAddress(emailAddress)
                .setContactNo(contactNumber)
                .setMessage(message)
                .clickSubmit());
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("subject")), "This field is required");
    }

    @Test(dependsOnMethods = "submitWithoutSubjectTest")
    public void submitWithoutFullNameTest() {
        contactUs().setFullname("")
                .selectSubject(subject);
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("fullname")), "This field is required");
        assertTrue(seleniumExtension().xpath(locatorsContactUsPage().submitButton()).isDisabled());
    }

    @Test(dependsOnMethods = "submitWithoutFullNameTest")
    public void submitWithoutEmailAddressTest() {
        contactUs().setFullname(fullname).setEmailAddress("");
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("email")), "This field is required");
        assertTrue(seleniumExtension().xpath(locatorsContactUsPage().submitButton()).isDisabled());
    }

    @Test(dependsOnMethods = "submitWithoutEmailAddressTest")
    public void submitWithoutContactNumberTest() {
        contactUs().setEmailAddress(emailAddress).setContactNo("");
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("contact_no")), "This field is required");
        assertTrue(seleniumExtension().xpath(locatorsContactUsPage().submitButton()).isDisabled());
    }

    @Test(dependsOnMethods = "submitWithoutContactNumberTest")
    public void submitWithoutMessageTest() {
        contactUs().setContactNo(contactNumber).setMessage("");
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("message")), "This field is required");
        assertTrue(seleniumExtension().xpath(locatorsContactUsPage().submitButton()).isDisabled());
    }

    @Test(dependsOnMethods = "submitWithoutMessageTest")
    public void verifyFullNameTextFieldTest() {
        assertFalse(contactUs()
                .setFullname(alphaNumericalSpecialCharacters)
                .setEmailAddress(emailAddress)
                .setContactNo(contactNumber)
                .selectSubject(subject)
                .setMessage(message)
                .clickSubmit());
        assertTrue(seleniumExtension().getValue("xpath", locatorsContactUsPage().fullnameTextfield()).equals(alphaNumericalSpecialCharacters));
    }

    @Test(dependsOnMethods = "verifyFullNameTextFieldTest")
    public void verifyEmailAddressTextFieldTest() {
        contactUs().setEmailAddress(alphaNumericalSpecialCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("email")), "The value is not a valid email address");

        contactUs().setEmailAddress("buena@");
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("email")), "The value is not a valid email address");

        contactUs().setEmailAddress("buena_30@yahoo.com");
        assertFalse(seleniumExtension().isElementVisible("xpath", locatorsContactUsPage().erorrLocator("email")));
    }

    @Test(dependsOnMethods = "verifyEmailAddressTextFieldTest")
    public void verifyContactNoTextFieldTest() {
        contactUs().setContactNo(alphaNumericalSpecialCharacters);
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("contact_no")), "The value is not valid");
    }

    @Test(dependsOnMethods = "verifyContactNoTextFieldTest")
    public void verifySubjectDropdownTest() {
        contactUs().selectSubject("Select a Subject");
        assertEquals(seleniumExtension().getText("xpath", locatorsContactUsPage().erorrLocator("subject")), "This field is required");
    }

    @Test(dependsOnMethods = "verifySubjectDropdownTest")
    public void verifyMessageTextAreaTest() {
        contactUs().setMessage(alphaNumericalSpecialCharacters);
        assertTrue(seleniumExtension().getValue("xpath", locatorsContactUsPage().messageTextarea()).equals(alphaNumericalSpecialCharacters));
    }

    @Test(dependsOnMethods = "verifyMessageTextAreaTest")
    public void verifyIssue1_19_33Test() {
        assertTrue(contactUs()
                .setFullname(fullname)
                .setEmailAddress(emailAddress)
                .setContactNo(contactNumber)
                .selectSubject(subject)
                .setMessage(message)
                .clickSubmit());
    }
}

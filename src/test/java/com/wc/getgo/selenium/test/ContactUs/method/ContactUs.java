package com.wc.getgo.selenium.test.ContactUs.method;

import static com.wc.getgo.selenium.global.Sleep.sleep;
import static com.wc.getgo.selenium.object.ClickButton.clickButton;
import static com.wc.getgo.selenium.object.Dropdown.dropdown;
import static com.wc.getgo.selenium.object.Textfield.textfield;
import static com.wc.getgo.selenium.common.Seleniumbase.driver;
import static com.wc.getgo.selenium.test.ContactUs.locator.LocatorsContactUsPage.locatorsContactUsPage;

public class ContactUs {

    public static ContactUs contactUs() {
        return new ContactUs();
    }

    public ContactUs setFullname(String fullName) {
        textfield(driver).xpath(locatorsContactUsPage().fullnameTextfield()).setText(fullName);
        return this;
    }

    public ContactUs setEmailAddress(String emailAddress) {
        textfield(driver).xpath(locatorsContactUsPage().emailAddressTextfield()).setText(emailAddress);
        return this;
    }

    public ContactUs setContactNo(String contactNo) {
        textfield(driver).xpath(locatorsContactUsPage().contactNoTextfield()).setText(contactNo);
        return this;
    }

    public ContactUs selectSubject(String subject) {
        dropdown(driver).dropdownLocator(locatorsContactUsPage().subjectDropdown()).selectValue(subject).select();
        return this;
    }

    public ContactUs setMessage(String message) {
        textfield(driver).xpath(locatorsContactUsPage().messageTextarea()).setText(message);
        return this;
    }

    public Boolean clickSubmit() {
        clickButton(driver).xpath(locatorsContactUsPage().submitButton()).click();
        sleep(4000);
        try {
            String alertMessage = driver.switchTo().alert().getText();
            return alertMessage.equals("Successfully Sent");
        } catch(Exception e) {
            return false;
        }
    }
}

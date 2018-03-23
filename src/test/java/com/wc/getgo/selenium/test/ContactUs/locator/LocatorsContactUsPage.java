package com.wc.getgo.selenium.test.ContactUs.locator;

public class LocatorsContactUsPage {

    public static LocatorsContactUsPage locatorsContactUsPage() {
        return new LocatorsContactUsPage();
    }

    public String fullnameTextfield() {
        return "//input[@name='fullname']";
    }

    public String emailAddressTextfield() {
        return "//input[@name='email']";
    }

    public String contactNoTextfield() {
        return "//input[@name='contact_no']";
    }

    public String subjectDropdown() {
        return "//select[@name='subject']";
    }

    public String messageTextarea() {
        return "//textarea[@name='message']";
    }

    public String submitButton() {
        return "//input[@name='submit']";
    }

    public String erorrLocator(String element) {
        return String.format("//small[@data-bv-for='%s' and @data-bv-result='INVALID']", element.toLowerCase());
    }
}

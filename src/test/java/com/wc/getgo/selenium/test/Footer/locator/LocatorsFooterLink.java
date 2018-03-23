package com.wc.getgo.selenium.test.Footer.locator;

public class LocatorsFooterLink {

    public static LocatorsFooterLink locatorsFooterLink() {
        return new LocatorsFooterLink();
    }

    public String contactUsLink() {
        return "//*[@id=\"footer\"]/div/div[1]/div[1]/a[contains(text(), 'CONTACT US')]";
    }

    public String faqLink() {
        return "//*[@id=\"footer\"]/div/div[1]/div[1]/a[contains(text(), 'FAQ')]";
    }

    public String termsAndConditionsLink() {
        return "//*[@id=\"footer\"]/div/div[1]/div[1]/a[contains(text(), 'TERMS AND CONDITIONS')]";
    }

    public String privacyPolicyLink() {
        return "//*[@id=\"footer\"]/div/div[1]/div[1]/a[contains(text(), 'PRIVACY POLICY')]";
    }
}

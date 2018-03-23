package com.wc.getgo.selenium.test.Menu.locator;

public class LocatorsNavigationMenu {

    public static LocatorsNavigationMenu locatorsNavigationMenu() {
        return new LocatorsNavigationMenu();
    }

    public String howToApplyMenu() {
        return "//a[contains(text(), 'How to apply')]";
    }

    public String debitCardMenu() {
        return "//a[contains(text(), 'Debit Card')]";
    }

    public String creditCardMenu() {
        return "//a[contains(text(), 'Credit Card')]";
    }

    public String promosMenu() {
        return "//a[contains(text(), 'Promos')]";
    }

}

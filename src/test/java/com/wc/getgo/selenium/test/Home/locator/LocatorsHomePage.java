package com.wc.getgo.selenium.test.Home.locator;

public class LocatorsHomePage {

    public static LocatorsHomePage locatorsHomePage() {
        return new LocatorsHomePage();
    }

    public String compareButton() {
        return "//button[@id='compare']";
    }

    public String compareSection() {
        return "//div[@id='compare-section']";
    }

    public String idDebitHereLink() {
        return "//a[@data-target='#id-debit']";
    }

    public String idDebitModal() {
        return "//div[@id='id-debit' and @style='display: block;']";
    }

    public String idDebitCloseModalButton() {
        return String.format("%s//button[contains(text(), 'Close')]", idDebitModal());
    }

    public String feeDebitHereLink() {
        return "//a[@data-target='#table-of-fees-debit']";
    }

    public String feeDebitModal() {
        return "//div[@id='table-of-fees-debit' and @style='display: block;']";
    }

    public String feeDebitCloseModalButton() {
        return String.format("%s//button[contains(text(), 'Close')]", feeDebitModal());
    }

    public String idCreditHereLink() {
        return "//*[@id=\"compare-section\"]/div/div/div[2]//a[@data-target='#id-credit']";
    }

    public String idCreditModal() {
        return "//*[@id=\"compare-section\"]/div/div/div[2]//div[@id='id-credit' and @style='display: block;']";
    }

    public String idCreditCloseModalButton() {
        return String.format("%s//button[contains(text(), 'Close')]", idCreditModal());
    }

    public String feeCreditHereLink() {
        return "//*[@id=\"compare-section\"]/div/div/div[2]//a[@data-target='#table-of-fees-credit']";
    }

    public String feeCreditModal() {
        return "//*[@id=\"compare-section\"]/div/div/div[2]//div[@id='table-of-fees-credit' and @style='display: block;']";
    }

    public String feeCreditCloseModalButton() {
        return String.format("%s//button[contains(text(), 'Close')]", feeCreditModal());
    }

    public String idPlatCreditHereLink() {
        return "//*[@id=\"compare-section\"]/div/div/div[3]//a[@data-target='#id-credit']";
    }

    public String idPlatCreditModal() {
        return "//*[@id=\"compare-section\"]/div/div/div[2]//div[@id='id-credit' and @style='display: block;']";
    }

    public String idPlatCreditCloseModalButton() {
        return String.format("%s//button[contains(text(), 'Close')]", idPlatCreditModal());
    }

    public String feePlatCreditHereLink() {
        return "//*[@id=\"compare-section\"]/div/div/div[3]//a[@data-target='#table-of-fees-credit']";
    }

    public String feePlatCreditModal() {
        return "//*[@id=\"compare-section\"]/div/div/div[2]//div[@id='table-of-fees-credit' and @style='display: block;']";
    }

    public String feePlatCreditCloseModalButton() {
        return String.format("%s//button[contains(text(), 'Close')]", feePlatCreditModal());
    }
}

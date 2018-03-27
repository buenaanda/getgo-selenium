package com.wc.getgo.selenium.test.Banner.locator;

public class LocatorsBanner {

    public static LocatorsBanner locatorsBanner() {
        return new LocatorsBanner();
    }

    public String applyNowButton() {
        return "//*[@id=\"banner-apply\"]";
    }

    public String debitCardApplyNowButton() {
        return "//*[@id=\"debitcard\"]/div[1]/div/div/div/div[2]/div[2]/a";
    }

    public String applyForGoldButton() {
        return "//*[@id=\"gold-send\"]/a";
    }

    public String creditCardGoldButton() {
        return "//*[@id=\"goldpress\"]";
    }

    public String creditCardPlatinumButton() {
        return "//*[@id=\"platpress\"]";
    }

    public String applyForPlatinumButton() {
        return "//*[@id=\"plat-send\"]/a";
    }

    public String yesRadioButton() {
        return "//div[@style='display: block;']/div/div/form/div/div/div/div/div/input[@id='yes']";
    }

    public String noRadioButton() {
        return "//div[@style='display: block;']/div/div/form/div/div/div/div/div/input[@id='no']";
    }

    public String notSureRadioButton() {
        return "//div[@style='display: block;']/div/div/form/div/div/div/div/div/input[@id='notsure']";
    }

    public String nextButton() {
        return "//div[@style='display: block;']/div/div/form/div/div[2]/div[1]/button";
    }

    public String yesButton() {
        return "//idv[@class='active-review']/form/div/button[@name='forget']";
    }

    public String noButton() {
        return "//idv[@class='active-review']/form/div/button[@name='notForget']";
    }

    public String applyModal() {
        return "//div[@class='modal-content signupbox']";
    }

    public String invalidCreditCardProdIDModal() {
        return "//div[@id='invalidCreditProdID']";
    }

    public String invalidCreditCardProdIDModalCloseButton() {
        return "//*[@id=\"invalidCreditProdID\"]/div[2]/div/div/div[1]/div/button";
    }
}

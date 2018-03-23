package com.wc.getgo.selenium.test.Home.test;

import com.wc.getgo.selenium.common.Seleniumbase;
import org.testng.annotations.Test;

import static com.wc.getgo.selenium.test.Home.method.Home.home;
import static org.testng.Assert.assertTrue;

public class HomeTest extends Seleniumbase {

    @Test
    public void verifyIssueNumber12Test() {
        assertTrue(home().clickCompare());

        assertTrue(home().clickIdDebitHere());
        assertTrue(home().clickCloseIdDebit());

        assertTrue(home().clickFeeDebitHere());
        assertTrue(home().clickCloseFeeDebit());

        assertTrue(home().clickIdCreditHere());
        assertTrue(home().clickCloseIdCredit());

        assertTrue(home().clickFeeCreditHere());
        assertTrue(home().clickCloseFeeCredit());

        assertTrue(home().clickIdPlatCreditHere());
        assertTrue(home().clickCloseIdPlatCredit());

        assertTrue(home().clickFeePlatCreditHere());
        assertTrue(home().clickCloseFeePlatCredit());
    }
}

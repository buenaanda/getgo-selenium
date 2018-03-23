package com.wc.getgo.selenium.global;

public class Sleep {

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch(InterruptedException e) {
        }
    }
}

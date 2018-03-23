package com.wc.getgo.selenium.global;

import java.util.Random;

public class RandomNumber {

    public static RandomNumber randomNumber() {
        return new RandomNumber();
    }

    public int generateRandomRangeNumber(int min, int max) {
        Random rand = new Random();
        int  n = rand.nextInt(max - min + 1) + min;
        return n;
    }
}

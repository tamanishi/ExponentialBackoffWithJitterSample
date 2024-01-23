package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int retryLimit = 10;
        int baseInterval = 1;
        int intervalCap = 32;

        Random random = new Random();

        for (int retryCount = 0; retryCount < retryLimit; retryCount++) {

            int tempInterval = (int)Math.min(intervalCap, Math.pow(baseInterval * 2, retryCount)) * 1000;
            System.out.println("temp : " + tempInterval);
            int interval = tempInterval * 9 / 10 + random.nextInt(0, tempInterval / 10);
            float deviation = (float)Math.abs(tempInterval - interval) / (float)tempInterval * 100;
            System.out.println("interval : " + interval);
            System.out.println("deviation : " + deviation + " %");
        }
    }

}

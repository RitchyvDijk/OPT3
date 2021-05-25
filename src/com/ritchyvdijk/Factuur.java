package com.ritchyvdijk;

import java.util.Date;
import java.util.Random;

public class Factuur {

    private long factuurNummer;
    private int aantUur;
    private double factuurTotaal;
    private Date factuurDatum;

    public Factuur(int aantUur) {
        this.factuurNummer = generateRandomNum(0,2147483647);
        this.aantUur = aantUur;
    }

    public int generateRandomNum(int min, int max) {
        Random r = new Random();
        return r.nextInt(max-min) + min;
    }

    public double getFactuurPrijs() {
        if (aantUur >= 7) {
            return aantUur * 70.0;

        } else if(aantUur >= 3) {
            return aantUur * 75.0;

        } else if(aantUur > 0) {
            return aantUur * 80.0;

        }
        return 0.0;
    }

}

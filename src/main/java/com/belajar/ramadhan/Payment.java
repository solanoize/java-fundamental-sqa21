package com.belajar.ramadhan;

public class Payment {
    private int baseCost = 10000;
    private int bill = 0;

    public void increaseBill() {
        bill += baseCost;
    }

    public int getBill() {
        return bill;
    }
}

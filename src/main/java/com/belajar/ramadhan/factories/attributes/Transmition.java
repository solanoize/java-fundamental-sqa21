package com.belajar.ramadhan.factories.attributes;

public class Transmition {
    private boolean isAT;

    public Transmition() {
        isAT = true;
    }

    public Transmition(boolean isAT) {
        this.isAT = isAT;
    }

    public String getIsAT() {
        if (isAT) {
            return "Automation Transmition";
        }
        return "Manual Transmition";
    }
}

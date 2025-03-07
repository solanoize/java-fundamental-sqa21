package com.belajar.ramadhan.factories.models;

import com.belajar.ramadhan.factories.attributes.Transmition;

public abstract class Vehicle {
    private String name;
    private String machineNumber;
    private Transmition transmition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public Transmition getTransmition() {
        return transmition;
    }

    public void setTransmition(Transmition transmition) {
        this.transmition = transmition;
    }

    public abstract void throttle();
    public abstract void brake();
}
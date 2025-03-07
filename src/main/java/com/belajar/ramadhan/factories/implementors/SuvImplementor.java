package com.belajar.ramadhan.factories.implementors;

import com.belajar.ramadhan.factories.models.Vehicle;

public class SuvImplementor extends Vehicle {
    @Override
    public void throttle() {
        System.out.println("Gas ala-ala suv");
    }

    @Override
    public void brake() {
        System.out.println("Brak ala-ala suv");
    }
}

package com.belajar.ramadhan.factories.implementors;

import com.belajar.ramadhan.factories.models.Vehicle;

public class TruckImplementor extends Vehicle {

    @Override
    public void throttle() {
        System.out.println("Gas ala-ala truk");
    }

    @Override
    public void brake() {
        System.out.println("Brak ala-ala truk");
    }
}

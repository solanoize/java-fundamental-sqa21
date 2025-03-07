package com.belajar.ramadhan.factories.implementors;

import com.belajar.ramadhan.factories.models.Vehicle;

public class MPVImplementor extends Vehicle {
    @Override
    public void throttle() {
        System.out.println("Gas ala-ala MPV");
    }

    @Override
    public void brake() {
        System.out.println("Brak ala-ala MPV");
    }
}

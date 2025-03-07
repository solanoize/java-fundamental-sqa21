package com.belajar.ramadhan;

public class HRD extends Employee {
    private int tunjangan = 1000000;
    private int benefit = 3000000;

    public HRD(String email, String password, String name) {
        super(email, password, name);
    }

    @Override
    public void gajian(int salary) {
        this.setSalary(salary + tunjangan + benefit);
    }
}

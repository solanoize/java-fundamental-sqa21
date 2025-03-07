package com.belajar.ramadhan;

public class Developer extends Employee {
    private int tunjangan = 10000000;
    private int benefit = 5000000;
    protected int x = 30000;

    public Developer(String email, String password, String name) {
        super(email, password, name);
    }

    @Override
    public void gajian(int salary) {
        System.out.println(super.x);
        System.out.println(this.x);
        super.gajian(salary);
        this.setSalary(tunjangan + benefit);
    }
}

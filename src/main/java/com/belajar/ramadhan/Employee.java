package com.belajar.ramadhan;

public class Employee extends User {
    private int salary;
    private String department;
    protected int x = 90;

    public Employee(String email, String password, String name) {
        super(email, password, name);
    }

    public int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = this.salary + salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void gajian(int salary) {
        this.salary = 10000 + salary;
    }
}

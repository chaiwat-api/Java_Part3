package com.company;

public class CEO extends Employee {
    public CEO(String firstNameIn, String lastNameIn, int salaryIn) {
        super(firstNameIn, lastNameIn, salaryIn);
    }

    @Override
    public int getSalary() {
        return super.getSalary() * 2;
    }

    @Override
    public void hello() {
        System.out.println("I am " + this.firstName + " in charge of this company.");
    }

    public void fire(Employee employee) {
        System.out.println(employee.firstName + "has been fired.");

    }

}
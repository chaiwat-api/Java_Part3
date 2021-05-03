package com.company;

public class Programmer extends Employee {
    public Programmer(String firstNameIn, String lastNameIn, int salaryIn) {
        super(firstNameIn, lastNameIn, salaryIn);
    }

    public void hello(String firstName, String lastName) {
        System.out.println("I am " + firstName + " " + lastName + ".");
    }

    public void createWebsite(String template, String titleName) {
        System.out.println("I has been created a " + template + " with " + titleName);
    }

    public void installWindows(String version, String productKey) {
        System.out.println("I also take care for installing Windows " + version + " with " + productKey);

    }
}

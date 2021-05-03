package com.company;

public class Employee {
    public String firstName;
    public String lastName;
    public int salary;

    public Employee(String firstNameIn, String lastNameIn, int salaryIn) {
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.salary = salaryIn;
    }

    public void hello() {
        System.out.println("Hello, my name is " + this.firstName + ".");
    }

    public int getSalary() {
        return salary;
    }
}

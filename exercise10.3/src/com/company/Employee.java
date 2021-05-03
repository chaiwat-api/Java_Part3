package com.company;

public class Employee {
    public String firstName;
    public String lastName;
    public int salary;

    public Employee(String firstNameIn, String lastNameIn, int salaryIn) {
        firstName = firstNameIn;
        lastName = lastNameIn;
        salary = salaryIn;
    }

    public void hello() {
        System.out.println("Hello " + firstName);
    }

    public int getSalary() {
        return salary;
    }
}

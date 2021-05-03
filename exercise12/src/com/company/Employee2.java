package com.company;

public class Employee2 {
    public String firstName;
    public String lastName;
    public int salary;

    public Employee2() {
        this.firstName = "Anonymous";
        this.lastName = "Anonymous";
        this.salary = 9000;
    }

    public Employee2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = 10000;
    }

    public Employee2(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}


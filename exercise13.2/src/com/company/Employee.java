package com.company;

public class Employee {
    public String firstName;
    public String lastName;
    public int salary;
    public String position;

    public Employee(String firstName, String lastName, int salary, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }

    public void hello() {
        System.out.println("Hello " + this.firstName);
    }

    public int getSalary() {
        return salary;
    }

    public void checkPosition() {
        System.out.println("My position is " + this.position);
    }
}

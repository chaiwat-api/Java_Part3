package com.company;

public class Main {

    public static void main(String[] args) {

        Employee Chai = new Employee("Chaiwat", "Apithanawit",12000);
        System.out.println(Chai.firstName);
        System.out.println(Chai.lastName);
        Chai.hello();
        System.out.println(Chai.getSalary());
    }
}

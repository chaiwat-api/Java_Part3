package com.company;

public class Main {

    public static void main(String[] args) {
        Employee Id1 = new Employee("Chaiwat", "Apithanawit", 20000);
        Id1.hello();
        System.out.println(Id1.getSalary());

        CEO ceo1 = new CEO("Somchai", "", 20000);
        ceo1.hello();
        System.out.println(ceo1.getSalary());

        Programmer Id2 = new Programmer("Anunt", "Mak", 20000);
        Id2.hello(Id2.firstName, Id2.lastName);
        Id2.installWindows("10", "1234");
        System.out.println(Id2.getSalary());

        Employee2 Id3 = new Employee2();
        System.out.println(Id3.firstName);
        System.out.println(Id3.lastName);
        System.out.println(Id3.salary);

        Employee2 Id4 = new Employee2("Dang", "Blue");
        System.out.println(Id4.firstName);
        System.out.println(Id4.lastName);
        System.out.println(Id4.salary);

        Employee2 Id5 = new Employee2("Chai", "Wat", 20000);
        System.out.println(Id5.firstName);
        System.out.println(Id5.lastName);
        System.out.println(Id5.salary);
    }
}

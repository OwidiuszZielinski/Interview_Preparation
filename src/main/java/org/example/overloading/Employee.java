package org.example.overloading;

public class Employee extends Person{
    protected int salary;

    public Employee(String name ,int salary) {
        super(name);
        this.salary = salary;
    }

}

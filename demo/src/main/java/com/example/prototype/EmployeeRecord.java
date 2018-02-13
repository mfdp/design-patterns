package com.example.prototype;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name;
    private String lastName;
    private double salary;

    public EmployeeRecord(int id, String name, String lastName, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void showRecord() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, lastName, salary);
    }
}

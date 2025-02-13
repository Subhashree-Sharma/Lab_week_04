package org.example.com.Serialization_SaveAndRetrieveAnObject;
import java.io.*;

//Employee class must implement Serializable
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name, department;
    double salary;

    //Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //display employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Dept: " + department + ", Salary: " + salary);
    }
}
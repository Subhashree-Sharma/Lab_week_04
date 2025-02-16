package org.example.com.BasicLevel.DynamicallyCreateObjects;

//Student class
public class Student {
    private String name;

    //Constructor
    public Student(String name) {
        this.name = name;
    }

    //Using method to display name
    public void display() {
        System.out.println("Student Name: " + name);
    }

    //Getter for testing
    public String getName() {
        return name;
    }
}

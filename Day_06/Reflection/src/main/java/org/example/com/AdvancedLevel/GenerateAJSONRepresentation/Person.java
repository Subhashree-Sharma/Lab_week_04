package org.example.com.AdvancedLevel.GenerateAJSONRepresentation;

//Person class
public class Person {
    private String name;
    private int age;
    private boolean isEmployed;

    //Constructor
    public Person(String name, int age, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    //getters for testing
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isEmployed() { return isEmployed; }
}

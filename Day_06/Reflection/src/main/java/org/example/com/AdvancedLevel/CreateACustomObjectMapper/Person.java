package org.example.com.AdvancedLevel.CreateACustomObjectMapper;

//Person class
public class Person {
    private String name;
    private int age;
    private boolean isEmployed;

    //default constructor -> needed for reflection
    public Person() {}

    //getters for verification in tests
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isEmployed() { return isEmployed; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", isEmployed=" + isEmployed + "}";
    }
}

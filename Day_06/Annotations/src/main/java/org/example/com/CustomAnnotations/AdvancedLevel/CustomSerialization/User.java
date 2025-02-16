package org.example.com.CustomAnnotations.AdvancedLevel.CustomSerialization;

//User class
public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;
    // Not annotated, so it will be ignored
    private String ignoredField;

    //constructor
    public User(String username, int age, String ignoredField) {
        this.username = username;
        this.age = age;
        this.ignoredField = ignoredField;
    }

    //get name and age
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}

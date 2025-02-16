package org.example.com.CustomAnnotations.AdvancedLevel.CustomSerialization;

//main class
public class Main {
    public static void main(String[] args) {
        User user = new User("Subha", 25, "This should not appear");

        String json = JsonSerializer.toJson(user);

        System.out.println("Serialized JSON:");
        System.out.println(json);
    }
}

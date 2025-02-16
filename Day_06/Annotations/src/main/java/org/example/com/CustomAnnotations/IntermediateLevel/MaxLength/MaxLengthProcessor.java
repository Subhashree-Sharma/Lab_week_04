package org.example.com.CustomAnnotations.IntermediateLevel.MaxLength;

//main class
public class MaxLengthProcessor {
    public static void main(String[] args) {
        try {
            //valid username
            User user1 = new User("Priya");
            System.out.println("User created: " + user1.getUsername());

            //should throw an error
            User user2 = new User("VeryLongUsernameExceedingLimit");
            System.out.println("User created: " + user2.getUsername());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

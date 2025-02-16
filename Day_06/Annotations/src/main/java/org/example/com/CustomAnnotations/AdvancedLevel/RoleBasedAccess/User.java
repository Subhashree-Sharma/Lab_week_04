package org.example.com.CustomAnnotations.AdvancedLevel.RoleBasedAccess;

//user class
public class User {
    private String username;
    //role like- "ADMIN", "USER"
    private String role;

    //constructor
    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    //get name and role
    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}

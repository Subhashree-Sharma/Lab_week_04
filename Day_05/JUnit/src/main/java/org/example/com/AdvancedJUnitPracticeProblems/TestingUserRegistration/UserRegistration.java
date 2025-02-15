package org.example.com.AdvancedJUnitPracticeProblems.TestingUserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // Registers a user if all inputs are valid
    public String registerUser(String username, String email, String password) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters with 1 uppercase and 1 digit.");
        }
        return "User registered successfully!";
    }

    // Validates email format
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    // Validates password strength
    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }
        return hasUpperCase && hasDigit;
    }
}

package org.example.com.AdvancedJUnitPracticeProblems.TestingPasswordValidator;

public class PasswordValidator {

    // Validates password strength
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasDigit;
    }
}

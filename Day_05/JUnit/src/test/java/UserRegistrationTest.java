import org.example.com.AdvancedJUnitPracticeProblems.TestingUserRegistration.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class UserRegistrationTest {

    UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!", userRegistration.registerUser("JohnDoe", "john@example.com", "Password1"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("", "user@example.com", "Password1"));
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("User", "invalid-email", "Password1"));
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    void testWeakPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("User", "user@example.com", "weak"));
        assertEquals("Password must be at least 8 characters with 1 uppercase and 1 digit.", exception.getMessage());
    }

    @Test
    void testNullInputs() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser(null, null, null));
        assertEquals("Username cannot be empty.", exception.getMessage());
    }
}

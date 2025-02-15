import org.example.com.AdvancedJUnitPracticeProblems.TestingPasswordValidator.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PasswordValidatorTest {

    PasswordValidator passwordValidator;

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    void testValidPassword() {
        assertTrue(passwordValidator.isValidPassword("StrongPass1"));
        assertTrue(passwordValidator.isValidPassword("Hello123"));
    }

    @Test
    void testShortPassword() {
        assertFalse(passwordValidator.isValidPassword("Short1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(passwordValidator.isValidPassword("lowercase1"));  // No uppercase letter
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(passwordValidator.isValidPassword("NoNumbersHere"));
    }

    @Test
    void testNullPassword() {
        assertFalse(passwordValidator.isValidPassword(null));
    }
}

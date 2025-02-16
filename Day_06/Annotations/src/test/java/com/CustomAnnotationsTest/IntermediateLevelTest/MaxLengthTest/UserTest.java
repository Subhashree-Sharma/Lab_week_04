package com.CustomAnnotationsTest.IntermediateLevelTest.MaxLengthTest;
import org.example.com.CustomAnnotations.IntermediateLevel.MaxLength.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
public class UserTest {

    @Test
    public void testValidUsername() {
        User user = new User("Priya");
        assertEquals("Priya", user.getUsername());
    }

    @Test
    public void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            // Should fail3
            new User("TooLongUsernameHere");
        });

        assertTrue(exception.getMessage().contains("exceeds max length"));
    }
}

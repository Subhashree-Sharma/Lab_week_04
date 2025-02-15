import org.example.com.TestingStringUtilityMethods.StringUtils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Test class for StringUtils
public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("321", stringUtils.reverse("123"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("JAVA", stringUtils.toUpperCase("java"));
    }
}


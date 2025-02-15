import org.example.com.AdvancedJUnitPracticeProblems.TestingDateFormatter.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DateFormatterTest {

    DateFormatter dateFormatter;

    @BeforeEach
    void setUp() {
        dateFormatter = new DateFormatter();
    }

    @Test
    void testValidDateFormat() {
        assertEquals("15-02-2024", dateFormatter.formatDate("2024-02-15"));
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("15-02-2024"));
        assertEquals("Invalid date format. Use yyyy-MM-dd.", exception.getMessage());
    }

    @Test
    void testInvalidCharactersInDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("abcd-ef-gh"));
        assertEquals("Invalid date format. Use yyyy-MM-dd.", exception.getMessage());
    }

    @Test
    void testNullDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate(null));
        assertEquals("Invalid date format. Use yyyy-MM-dd.", exception.getMessage());
    }
}

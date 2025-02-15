import org.example.com.TestingExceptionHandling.MathUtils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Test class for MathUtils
public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testDivide() {
        assertEquals(5, mathUtils.divide(10, 2));
        assertEquals(-3, mathUtils.divide(-9, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> mathUtils.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

import org.example.com.TestingCalculatorClass.Calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    //Created an instance
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(6, 4));
    }


    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(6, 4));
        assertEquals(-4, calculator.subtract(-2, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calculator.multiply(6, 4));
        assertEquals(-10, calculator.multiply(-5, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(8, 4));
        assertEquals(-3, calculator.divide(-9, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}


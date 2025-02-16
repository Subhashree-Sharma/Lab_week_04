package com.BasicLevel.InvokePrivateMethodTest;
import org.example.com.BasicLevel.InvokePrivateMethod.Calculator;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
class CalculatorTest {

    @Test
    void testInvokePrivateMethod() throws Exception {
        //instance of Calculator
        Calculator calculator = new Calculator();

        //using Reflection for private method
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        //invoke the method
        int result = (int) multiplyMethod.invoke(calculator, 6, 3);

        //verify result
        assertEquals(18, result);
    }
}


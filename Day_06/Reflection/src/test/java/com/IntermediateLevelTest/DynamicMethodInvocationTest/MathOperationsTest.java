package com.IntermediateLevelTest.DynamicMethodInvocationTest;

import org.example.com.IntermediateLevel.DynamicMethodInvocation.MathOperations;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

//Testing class
class MathOperationsTest {

    @Test
    void testAddMethod() throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getMethod("add", int.class, int.class);
        int result = (int) method.invoke(mathOperations, 5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtractMethod() throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getMethod("subtract", int.class, int.class);
        int result = (int) method.invoke(mathOperations, 10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiplyMethod() throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getMethod("multiply", int.class, int.class);
        int result = (int) method.invoke(mathOperations, 7, 2);
        assertEquals(14, result);
    }
}

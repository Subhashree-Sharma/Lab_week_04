package org.example.com.TestingExceptionHandling;

public class MathUtils {

    //Divides two numbers, throws an exception if divided by zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

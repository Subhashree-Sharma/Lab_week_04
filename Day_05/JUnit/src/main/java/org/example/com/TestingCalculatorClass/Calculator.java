package org.example.com.TestingCalculatorClass;

//Calculator class
public class Calculator {

    //Using add method
    public int add(int a, int b) {
        return a + b;
    }

    //Using subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //Using multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    //using divide method
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}


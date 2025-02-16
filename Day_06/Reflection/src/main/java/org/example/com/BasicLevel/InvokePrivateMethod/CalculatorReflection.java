package org.example.com.BasicLevel.InvokePrivateMethod;
import java.lang.reflect.Method;

//CalculatorReflection class
public class CalculatorReflection {
    public static void main(String[] args) throws Exception {

            //object of Calculator
            Calculator calculator = new Calculator();

            //get private method -> multiply
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            //make it accessible
            multiplyMethod.setAccessible(true);

            //invoke method dynamically
            int result = (int) multiplyMethod.invoke(calculator, 10, 20);
            System.out.println("Multiplication Result: " + result);

    }
}

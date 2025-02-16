package org.example.com.IntermediateLevel.DynamicMethodInvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

//main class
public class DynamicMethodInvoker {
    public static void main(String[] args) throws Exception{

         Scanner scanner = new Scanner(System.in);
            //Object of MathOperations
            MathOperations mathOperations = new MathOperations();

            //get class object
            Class<?> mathClass = MathOperations.class;

            //get method name & parameters from user
            System.out.print("Enter method name (add/subtract/multiply)-> ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number-> ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number-> ");
            int num2 = scanner.nextInt();

            //get method by name and parameter types
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            //invoke method dynamically
            int result = (int) method.invoke(mathOperations, num1, num2);
            System.out.println("Result -> " + result);
    }
}

package org.example.com.ExceptionPropagationInMethods;
import java.util.Scanner;

//ExceptionPropagation class
public class ExceptionPropagation {
    public static void method1(){
        //Using scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Taking num1 and num2 as input
            System.out.println("Enter any two number one by one -");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            //Dividing num1 with num2
            int division = num1 / num2;
            System.out.println("Division of two numbers : " + division);

    }

    //method2 calling method1 Exception Propagation
    public static void method2(){
            method1();
    }

    //main method
    public static void main(String[] args) {

        //Using try and catch block for handling exception
        try{
            method2();
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is occurred - please enter valid value");
        }
    }
}

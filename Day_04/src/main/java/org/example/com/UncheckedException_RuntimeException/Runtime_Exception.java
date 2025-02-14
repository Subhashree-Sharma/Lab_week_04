package org.example.com.UncheckedException_RuntimeException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Runtime_Exception {
    public static void main(String[] args) {

        //Using scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Using try and catch block for handling exception
        try {
            System.out.println("Enter any two number one by one -");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            //Dividing num1 with num2
            int division = num1/num2;
            System.out.println("Division of two numbers : " + division);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is occurred - please enter valid value");
        }
        catch(InputMismatchException e){
            System.out.println("Input mismatch exception - please enter numeric value");
        }
    }
}

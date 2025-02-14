package org.example.com.Nested_TryCatchBlock;
import java.util.Scanner;

public class Nested_TryCatch{
    public static void main(String[] args) {

        //Using scanner for taking inputs
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        //Taking array elements, divisor and index as input
        System.out.println("Enter the value of 5 elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of divisor and index one by one -");
        int divisor = sc.nextInt();
        int index = sc.nextInt();

        //Using nested try-catch block
        try{
            try{
                //For indexing statement
                int arr2 = arr[index];
                System.out.println("The value of element at index " + index + " is " + arr2);

                //For divisor statement
                int result = arr2 / divisor;
                System.out.println("Result of division: " + result);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception occurred -> Invalid array index!");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occurred -> Cannot divide by zero!");
        }
    }
}

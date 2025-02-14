package org.example.com.MultipleCatchBlocks;
import java.util.Scanner;

//main class
public class MultipleCatchBlocks {
    public static void main(String[] args) {

        //Using try & Catch block to handle exception
        try {
            //Using scanner object for taking inputs
            Scanner sc = new Scanner(System.in);
            int n = 5;
            int[] arr = new int[n];

            //User to enter array elements
            System.out.println("Enter the value of 5 elements -");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //Taking index from user
            System.out.println("Enter index to retrieve value -");
            int index = sc.nextInt();

            System.out.println("Value of index " + index + " is " + arr[index]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index! -> Please Enter valid index");
        }

        //To generate null pointer exception just initialize your array as null
        catch(NullPointerException e){
            System.out.println("NullPointerException -> Array is not initialized!");
        }
    }
}
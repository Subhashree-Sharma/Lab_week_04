package org.example.com.throwVsthrows_ExceptionPropagation;
import java.util.Scanner;

//main class
public class ExceptionPropagation {

    //Using method to calculate interest
    public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{

        //If value is invalid then throw exception
        if(amount < 0 && rate < 0){
                throw new IllegalArgumentException();
        }
        else{
            System.out.println("Simple interest -> " + (amount * rate * years)/100);
        }
    }

    //main method
    public static void main(String[] args) {
        try {
            //Using Scanner object for taking input
            Scanner sc = new Scanner(System.in);

            //Taking input from user
            System.out.println("Enter the value of amount, rate & years one by one -:");
            double amount = sc.nextDouble();
            double rate = sc.nextDouble();
            int years = sc.nextInt();

            calculateInterest(amount, rate, years);
        }
        //Handling exception
        catch(IllegalArgumentException e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}

package org.example.com.AdvancedProblems.ValidateACreditCardNumber;
import java.util.Scanner;

//main class
  public class ValidateCreditCard {
      //Using method to check valid credit card number
        public static boolean isValidCreditCard(String cardNumber) {

            //Regex for Visa -> 16 digits
            String visaRegex = "^4\\d{15}$";

            //Regex for MasterCard
            String masterCardRegex = "^5\\d{15}$";

            //Display result
            if (cardNumber.matches(visaRegex)) {
                System.out.println("Valid Visa Card");
                return true;
            } else if (cardNumber.matches(masterCardRegex)) {
                System.out.println("Valid MasterCard");
                return true;
            } else {
                System.out.println("Invalid Card Number");
                return false;
            }
        }

        //main method
        public static void main(String[] args) {

            //Using scanner for taking inputs
            Scanner sc = new Scanner(System.in);

            //Taking cardNumber as input
            System.out.println("Enter a credit card number -> ");
            //Remove spaces
            String cardNumber = sc.nextLine().replaceAll("\\s", "");
            sc.close();

            //Calling method
            isValidCreditCard(cardNumber);
        }
    }


package org.example.com.CustomException_UserdefinedException;
import java.util.Scanner;

    //custom Exception Class
    class InvalidAgeException extends Exception {
        public InvalidAgeException() {
            super("Age must be 18 or above");
        }
    }

    //UserDefined_Exception class
    public class UserDefined_Exception {

        //method to validate age
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException();
            }
            System.out.println("Access Granted");
        }

        //main method
        public static void main(String[] args) {

            //Using try and catch block for handling exception
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter your age - ");
                int age = sc.nextInt();

                validateAge(age);

            } catch (InvalidAgeException e) {
                //Handle custom exception
                System.out.println("Exception: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input -> Please enter a valid number");
            }
        }
    }

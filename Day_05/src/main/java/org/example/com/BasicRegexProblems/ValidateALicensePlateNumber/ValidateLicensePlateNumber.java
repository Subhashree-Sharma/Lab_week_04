package org.example.com.BasicRegexProblems.ValidateALicensePlateNumber;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

//main class
public class ValidateLicensePlateNumber {
    //Method to check valid license
    public static boolean isLicenseValid(String license){

        //regex for license number
        String regex = "^[A-Z]{2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        //Matching pattern
        Matcher matcher = pattern.matcher(license);

        return matcher.matches();
    }
    public static void main(String[] args) {

        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid License Plate Number ->");
        String license = sc.nextLine();

        //display result
        if(isLicenseValid(license)){
            System.out.println("License Plate number " + license  + " is valid");
        }else{
            System.out.println("License Plate number " + license  + " is Invalid");
        }
    }
}

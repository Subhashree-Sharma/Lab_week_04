package org.example.com.BasicRegexProblems.ValidateAHexColorCode;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
    //Using method to check hex color code
    public static boolean isHexColorValid(String hexColorCode){

        //Regex for color code
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        //Matching pattern
        Matcher matcher = pattern.matcher(hexColorCode);
        return matcher.matches();
    }

    //main method
    public static void main(String[] args) {

        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hex Color Code ->");
        String hexColorCode = sc.nextLine();

        //Display result
        if(isHexColorValid(hexColorCode)){
            System.out.println("Hex color code " + hexColorCode + " is valid");
        }
        else{
            System.out.println("Hex color code " + hexColorCode + " is Invalid");
        }
    }
}

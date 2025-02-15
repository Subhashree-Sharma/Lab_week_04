package org.example.com.BasicRegexProblems.ValidateAUsername;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

//main class
public class ValidateAUsername {
    //Method to check valid username
    public static boolean isUserName(String name){

        //regex for username
        String regex = "^[a-zA-Z][a-zA-Z\\d_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);
        //Matching pattern
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }
    public static void main(String[] args) {
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username -> ");
        String username1 = sc.nextLine();

        //display result
        if(username1.length() < 5 || username1.length() > 15){
            System.out.println("Username length is valid");
        }else if(isUserName(username1)){
            System.out.println("Username is valid");
        }else{
            System.out.println("Invalid -> Please enter correct your username" );
        }
    }
}

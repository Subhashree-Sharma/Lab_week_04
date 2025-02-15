package org.example.com.ExtractionProblems.ExtractDatesInSpecificFormat;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractDatesInSpecificFormat {
    //method to extract dates
    public static void extractDates(String text) {

        //Regex to match dates in this -> dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        //If email is found then true
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        //If no email found return below statement
        if (!found) {
            System.out.println("No valid dates found.");
        }
    }

    //main method
    public static void main(String[] args) {

        //Using scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Taking a string as input
        System.out.println("Enter your text ->");
        String str = sc.nextLine();
        sc.close();

        //calling method
        extractDates(str);
    }
}

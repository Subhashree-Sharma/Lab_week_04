package org.example.com.AdvancedProblems.ExtractCurrencyValuesFromAText;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractCurrencyValues {
    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        sc.close();

        // Regular expression to match currency values (with or without '$')
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            // Print each found currency value
            System.out.println(matcher.group());
        }
    }
}
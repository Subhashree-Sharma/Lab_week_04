package org.example.com.ReplaceAndModifyStrings.ReplaceMultipleSpacesWithASingleSpace;

import java.util.Scanner;
public class ReplaceMultipleSpaces {
    //using method to replace spaces
    public static String replaceSpaces(String text) {

        //Replace multiple spaces with a single space
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {

        //Using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        //Taking text as input
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        sc.close();

        //Storing result
        String result = replaceSpaces(str);

        //Display result
        System.out.println("Formatted text -> " + result);
    }
}

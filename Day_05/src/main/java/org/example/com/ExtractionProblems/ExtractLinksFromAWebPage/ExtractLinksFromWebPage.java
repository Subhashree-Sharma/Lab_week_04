package org.example.com.ExtractionProblems.ExtractLinksFromAWebPage;
import java.util.regex.*;
import java.util.Scanner;
//main class
public class ExtractLinksFromWebPage{

    //Method to extract links
    public static void extractLinks(String str) {
        // Regex pattern
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}\\S*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        boolean found = false;
        //If email is found then true
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        //If no email found return below statement
        if (!found) {
            System.out.println("No valid links found.");
        }
    }

    public static void main(String[] args) {
        //Using scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Taking a string as input
        System.out.println("Enter your text ->");
        String str = sc.nextLine();
        sc.close();

        //calling method
        extractLinks(str);
    }
}
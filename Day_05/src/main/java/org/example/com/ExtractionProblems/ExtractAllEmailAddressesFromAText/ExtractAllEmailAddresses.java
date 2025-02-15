package org.example.com.ExtractionProblems.ExtractAllEmailAddressesFromAText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ExtractAllEmailAddresses {
    //Using method to extract emails
    public static void extractEmail(String text) {

        //Regex for valid email
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

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
            System.out.println("No email addresses found.");
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
        extractEmail(str);
    }
}

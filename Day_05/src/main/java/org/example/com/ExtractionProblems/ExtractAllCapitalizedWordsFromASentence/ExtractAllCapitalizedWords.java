package org.example.com.ExtractionProblems.ExtractAllCapitalizedWordsFromASentence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

//main class
public class ExtractAllCapitalizedWords {

    //Using method to extract Capitalized Words
    public static void extractCapitalizedWords(String str) {

        //Regex for capitalized String ->
        // \\b -> for boundary
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        boolean found = false;
        //If email is found then true
        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
            found = true;
        }

        //If no capitalized word found return below statement
        if (!found) {
            System.out.println("No capitalized words found.");
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
        extractCapitalizedWords(str);
    }
}


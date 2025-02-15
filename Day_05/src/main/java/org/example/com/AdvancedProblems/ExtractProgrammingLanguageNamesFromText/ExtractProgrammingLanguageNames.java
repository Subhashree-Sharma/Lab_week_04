package org.example.com.AdvancedProblems.ExtractProgrammingLanguageNamesFromText;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//main class
public class ExtractProgrammingLanguageNames {
    public static void main(String[] args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        sc.close();

        // Regular expression for common programming languages
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|PHP|Kotlin|TypeScript)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            //print each found programming lang value
            System.out.println(matcher.group());
        }
    }
}


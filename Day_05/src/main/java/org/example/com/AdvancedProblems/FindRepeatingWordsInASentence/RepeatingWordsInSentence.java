package org.example.com.AdvancedProblems.FindRepeatingWordsInASentence;

import java.util.*;

//main class
public class RepeatingWordsInSentence {
        public static void main(String[] args) {

            //Taking input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String text = sc.nextLine();
            sc.close();

            //Split words (ignoring case)
            String[] words = text.toLowerCase().split("\\s+");

            Set<String> seenWords = new HashSet<>();
            Set<String> repeatedWords = new HashSet<>();

            //Iterating
            for (String word : words) {
                //If already seen then it is repeated
                if (!seenWords.add(word)) {
                    repeatedWords.add(word);
                }
            }

            //display result
            System.out.println("Repeated words: " + String.join(", ", repeatedWords));
        }
    }


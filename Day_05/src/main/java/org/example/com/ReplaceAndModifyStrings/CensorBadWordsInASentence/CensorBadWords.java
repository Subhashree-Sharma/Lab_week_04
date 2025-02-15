package org.example.com.ReplaceAndModifyStrings.CensorBadWordsInASentence;
import java.util.Scanner;

    public class CensorBadWords {
        //Using method to censor bad words
        public static String censorBadWords(String str, String[] badWords) {
            for (String word : badWords) {
                String regex =  word;

                //Replace bad words
                str = str.replaceAll(regex, "****");
            }
            return str;
        }

        //main method
        public static void main(String[] args) {

            //Using scanner for taking input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence -> ");
            String str = sc.nextLine();

            //List of bad words to censor
            String[] badWords = {"damn", "stupid"};

            //Storing result
            String result = censorBadWords(str, badWords);
            System.out.println("Censored text -> " + result);

            sc.close();
        }
    }


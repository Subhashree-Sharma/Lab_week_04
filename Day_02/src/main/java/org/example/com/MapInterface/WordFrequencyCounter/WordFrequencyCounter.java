package org.example.com.MapInterface.WordFrequencyCounter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        //change this to your file name
        String fileName = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_02\\src\\main\\java\\org\\example\\com\\MapInterface\\WordFrequencyCounter\\input.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                //convert to lowercase and remove punctuation
                String[] words = line.toLowerCase().replaceAll("\\W+", " ").split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        //display word frequencies
        System.out.println("Word Frequencies: " + wordCount);
    }
}

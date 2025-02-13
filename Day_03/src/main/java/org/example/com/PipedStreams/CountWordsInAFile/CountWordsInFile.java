package org.example.com.PipedStreams.CountWordsInAFile;
import java.io.*;
import java.util.*;

//CountWordsInFile class
public class CountWordsInFile {
        public static void main(String[] args) {
            //filepath
            String filePath = "C:\\Users\\ss587\\Downloads\\Capgemini_files2\\Week04\\Day_03\\src\\main\\java\\org\\example\\com\\PipedStreams\\CountWordsInAFile\\sample";

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                //using hashmap to store word count
                Map<String, Integer> wordCount = new HashMap<>();
                String line;

                while ((line = br.readLine()) != null) {
                    //split words by spaces
                    String[] words = line.toLowerCase().split("\\s+");
                    for (String word : words) {
                        //remove punctuation
                        word = word.replaceAll("[^a-zA-Z]", "");
                        if (!word.isEmpty()) {
                            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        }
                    }
                }

                //convert map to list and sort by word frequency
                List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
                sortedWords.sort((a, b) -> b.getValue() - a.getValue());

                //print top 5 words
                System.out.println("Top 5 Most Frequent Words:");
                for(int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                    System.out.println(sortedWords.get(i).getKey() + " - " + sortedWords.get(i).getValue());
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }

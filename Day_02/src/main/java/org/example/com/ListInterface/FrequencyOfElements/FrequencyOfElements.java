package org.example.com.ListInterface.FrequencyOfElements;
import java.util.*;

public class FrequencyOfElements {
    //counting frequency
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        //iterating to put frequency
        for (String item : list) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }
        return frequencyMap;
    }

    //main
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequency = countFrequency(input);

        //printing frequency
        System.out.println(frequency);
    }
}

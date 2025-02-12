package org.example.com.MapInterface.FindTheKeyWithTheHighestValue;
import java.util.*;

//FindKeyWithHighestValue class
public class FindKeyWithHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        //find the key with the highest value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        //display result
        System.out.println("Key with the highest value: " + maxKey);
    }
}

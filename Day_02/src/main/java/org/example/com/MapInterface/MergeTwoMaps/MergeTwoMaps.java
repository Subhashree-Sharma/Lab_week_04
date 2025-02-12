package org.example.com.MapInterface.MergeTwoMaps;
import java.util.*;

//MergeTwoMaps class
public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Merge map2 into mergedMap
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        //display result
        System.out.println("Merged Map: " + mergedMap);
    }
}

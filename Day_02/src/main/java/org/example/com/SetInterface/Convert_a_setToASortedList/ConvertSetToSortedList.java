package org.example.com.SetInterface.Convert_a_setToASortedList;

import java.util.*;

public class ConvertSetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        //convert Set to List
        List<Integer> sortedList = new ArrayList<>(set);
        //sort the list in ascending order
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(convertToSortedList(set));
    }
}

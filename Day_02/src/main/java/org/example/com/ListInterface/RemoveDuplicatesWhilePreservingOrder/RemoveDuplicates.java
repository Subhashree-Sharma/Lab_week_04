package org.example.com.ListInterface.RemoveDuplicatesWhilePreservingOrder;
import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            boolean isDuplicate = false;
            //check if this element already exists in result
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    isDuplicate = true;
                    break;
                }
            }
            //add only if it is not a duplicate
            if (!isDuplicate) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(input);
        System.out.println(result);
    }
}


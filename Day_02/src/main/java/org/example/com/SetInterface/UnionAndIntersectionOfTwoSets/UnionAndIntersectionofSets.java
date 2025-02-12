package org.example.com.SetInterface.UnionAndIntersectionOfTwoSets;
import java.util.*;

public class UnionAndIntersectionofSets {
    public static <T> Set<T> getUnion(Set<T> set1, Set<T> set2) {
        //copy set1
        Set<T> union = new HashSet<>(set1);
        //add all elements from set2
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> getIntersection(Set<T> set1, Set<T> set2) {
        //copy set1
        Set<T> intersection = new HashSet<>(set1);
        //keep only common elements
        intersection.retainAll(set2);
        return intersection;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        //display result
        System.out.println("Union: " + getUnion(set1, set2));
        System.out.println("Intersection: " + getIntersection(set1, set2));
    }
}

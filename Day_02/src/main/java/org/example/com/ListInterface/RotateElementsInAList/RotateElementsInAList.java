package org.example.com.ListInterface.RotateElementsInAList;
import java.util.*;

public class RotateElementsInAList {
            public static <T> List<T> rotateList(List<T> list, int k) {
                int n = list.size();
                //Handle cases where k > n
                k = k % n;

                //take elements from k to end
                List<T> rotated = new ArrayList<>(list.subList(k, n));
                //add first k elements at the end
                rotated.addAll(list.subList(0, k));

                return rotated;
            }

            public static void main(String[] args) {
                List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
                int k = 2;
                System.out.println(rotateList(input, k));
            }
        }

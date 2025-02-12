package org.example.com.ListInterface.ReverseAList;
import java.util.*;

public class ReverseAList {

    //using method to reverse a arraylist
    public static <T> void reverseArrayList(ArrayList<T> list) {
        ArrayList<T> temp = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            //add elements in reverse order
            temp.add(list.get(i));
        }
        //clear the original list
        list.clear();
        //copy reversed elements back
        list.addAll(temp);
    }

    //using method to reverse a LinkedList
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> temp = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            //add elements in reverse order
            temp.add(list.get(i));
        }
        //clear the original list
        list.clear();
        //copy reversed elements back
        list.addAll(temp);
    }

    public static void main(String[] args) {

        //Arraylist object
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList-> " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList-> " + arrayList);

       //linkedList object
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal LinkedList-> " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList-> " + linkedList);
    }
}

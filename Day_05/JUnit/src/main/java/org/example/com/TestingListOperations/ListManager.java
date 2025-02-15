package org.example.com.TestingListOperations;

import java.util.List;

//ListManager class
public class ListManager {

    //adds an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    //removes an element from the list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    //returns the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}


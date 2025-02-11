package org.example.com.SmartWarehouseManagementSystem;
import java.util.ArrayList;
import java.util.List;

//5
//generics class Storage
public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    //add item
    public void addItem(T item) {
        items.add(item);
    }

    //get item
    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getAllItems() {
        return items;
    }
}

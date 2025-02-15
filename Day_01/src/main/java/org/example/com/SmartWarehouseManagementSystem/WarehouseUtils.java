package org.example.com.SmartWarehouseManagementSystem;
import java.util.List;

//6
public class WarehouseUtils {

    //display items
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
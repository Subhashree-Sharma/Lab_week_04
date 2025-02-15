package org.example.com.SmartWarehouseManagementSystem;
//1

//abstract class warehouseItem
public abstract class WarehouseItem {
    private String name;

    //constructor
    public WarehouseItem(String name) {
        this.name = name;
    }

    //get name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " -: " + name;
    }
}
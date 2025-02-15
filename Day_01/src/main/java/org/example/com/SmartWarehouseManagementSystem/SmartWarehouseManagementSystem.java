package org.example.com.SmartWarehouseManagementSystem;

//7
//main class
public class SmartWarehouseManagementSystem{
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();

        //adding electronics items
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();

        //adding groceries items
        groceriesStorage.addItem(new Groceries("Apple"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        //adding furniture items
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("Chair"));

        //display result
        System.out.println("Electronics in Storage - ");
        WarehouseUtils.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries in Storage - ");
        WarehouseUtils.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture in Storage - ");
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}

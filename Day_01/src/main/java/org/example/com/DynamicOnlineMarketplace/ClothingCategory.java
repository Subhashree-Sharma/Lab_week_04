package org.example.com.DynamicOnlineMarketplace;
//3
//clothing category class
public class ClothingCategory implements Category {
    private String name;

    //constructor
    public ClothingCategory(String name) {
        this.name = name;
    }

    //returns the category name
    @Override
    public String getCategoryName() {
        return name;
    }

    //string representation of the category
    @Override
    public String toString() {
        return name;
    }
}

package org.example.com.DynamicOnlineMarketplace;
//4
//gadgetCategory class
public class GadgetCategory implements Category {
    private String name;

    // Constructor
    public GadgetCategory(String name) {
        this.name = name;
    }

    //returns the category name
    @Override
    public String getCategoryName() {
        return name;
    }

    //string representation of category
    @Override
    public String toString() {
        return name;
    }
}

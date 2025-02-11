package org.example.com.DynamicOnlineMarketplace;

//2
//bookCategory class
public class BookCategory implements Category {
    private String name;

    //constructor
    public BookCategory(String name) {
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


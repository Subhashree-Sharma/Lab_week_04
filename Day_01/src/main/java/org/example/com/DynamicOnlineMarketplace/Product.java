package org.example.com.DynamicOnlineMarketplace;
//5
//generic class for products
public class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    //constructor to initialize the product
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //get product name
    public String getName() {
        return name;
    }

    //get product price
    public double getPrice() {
        return price;
    }

    //set product price
    public void setPrice(double price) {
        this.price = price;
    }

    //get product category
    public T getCategory() {
        return category;
    }

    //string representation of the product
    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Category: " + category;
    }
}


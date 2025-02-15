package org.example.com.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    // List to hold products from any category
    private List<Product<? extends Category>> products;

    //Constructor
    public ProductCatalog() {
        products = new ArrayList<>();
    }

    //adds a product to the catalog.
    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    //displays all products in the catalog
    public void displayCatalog() {
        for (Product<? extends Category> product : products) {
            System.out.println(product);
        }
    }
}

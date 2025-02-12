package org.example.com.ShoppingCart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//ShoppingCart class
class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cartItems = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedItems = new TreeMap<>();

    //add product with price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    //add item to cart
    public void addItemToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            sortedItems.put(productPrices.get(product), product);
        } else {
            System.out.println("Product not found!");
        }
    }

    //display cart items in order of addition
    public void displayCartInOrder() {
        System.out.println("Items in cart - order added:");
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
        }
    }

    //display cart items sorted by price
    public void displayCartSortedByPrice() {
        System.out.println("Items in cart ->sorted by price:");
        for (Map.Entry<Double, String> entry : sortedItems.entrySet()) {
            System.out.println(entry.getValue() + " - Price: " + entry.getKey());
        }
    }
}
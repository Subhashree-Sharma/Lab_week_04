package org.example.com.ShoppingCart;

//main class
public class Shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        //adding products
        cart.addProduct("Laptop", 1500.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Tablet", 500.00);

        //adding items to cart
        cart.addItemToCart("Laptop", 1);
        cart.addItemToCart("Phone", 2);
        cart.addItemToCart("Tablet", 1);

        //display items in order added
        cart.displayCartInOrder();

        //display items sorted by price
        cart.displayCartSortedByPrice();
    }
}
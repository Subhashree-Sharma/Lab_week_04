package org.example.com.DynamicOnlineMarketplace;
public class DynamicOnlineMarketplace {

    //main class
    public static void main(String[] args) {

        //create a new product catalog
        ProductCatalog catalog = new ProductCatalog();

        //create products
        Product<BookCategory> book = new Product<>("The life of pie", 100.0, new BookCategory("Fiction"));
        Product<ClothingCategory> shirt = new Product<>("T-shirt", 50.0, new ClothingCategory("Men's Wear"));
        Product<GadgetCategory> smartphone = new Product<>("Iphone", 100000.0, new GadgetCategory("Mobile"));

        //add the products to the catalog
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(smartphone);

        //display before discount
        System.out.println("Catalog before discount -");
        catalog.displayCatalog();

        //Applying discounts using generic method from MarketplaceUtils
        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 20);
        MarketplaceUtils.applyDiscount(smartphone, 15);

        //display catalog after discount
        System.out.println("\nCatalog after discount - ");
        catalog.displayCatalog();
    }
}

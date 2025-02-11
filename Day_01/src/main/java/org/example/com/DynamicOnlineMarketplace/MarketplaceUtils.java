package org.example.com.DynamicOnlineMarketplace;
//6
//utility class with a generic method
// to apply discounts to products
public class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double newPrice = product.getPrice() * (1 - percentage / 100.0);
        //update product price
        product.setPrice(newPrice);
    }
}

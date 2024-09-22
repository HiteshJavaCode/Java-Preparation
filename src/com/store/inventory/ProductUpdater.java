package com.store.inventory;

import com.statinstance.Product;

public class ProductUpdater {
    public void updateProductPrice(Product product, double newPrice) {
        product.updatePrice(newPrice);
        System.out.println("Updated price for " + product.getProductDetails());
    }

    public void restockProduct(Product product, int additionalQuantity) {
        product.restock(additionalQuantity);
        System.out.println("Restocked " + additionalQuantity + " units for " + product.getProductDetails());
    }
}

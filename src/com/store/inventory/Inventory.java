package com.store.inventory;

import com.statinstance.Product;
import java.util.ArrayList;


public class Inventory {
    private ArrayList<Product> productList;
    public Inventory() {
        this.productList = new ArrayList<>();
    }
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product.getProductDetails());
        }
    }
    public void findProduct(String name) {
        for (Product product : productList) {
            if (product.getProductDetails().contains(name)) {
                System.out.println("Found: " + product.getProductDetails());
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    public void resetInventory() {
        Product.resetInventory();
        productList.clear(); // Clear the product list as well
    }
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("Laptop", 1000.0, 5);
        Product product2 = new Product("Phone", 500.0, 10);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.displayAllProducts();
        inventory.findProduct("Phone");
        ProductUpdater updater = new ProductUpdater();
        updater.updateProductPrice(product1, 950.0);
        updater.restockProduct(product2, 5);
        inventory.displayAllProducts();
        inventory.resetInventory();
        System.out.println("Total products after reset: " + Product.getTotalProducts());
    }
}

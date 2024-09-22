package com.statinstance;

//This complete implementation includes:
//
//        A Product class with static and instance methods.
//        An Inventory class that manages products in a separate package.
//        A ProductUpdater class that updates product details.
//        A main method to test the functionality and demonstrate the interactions.


public class Product {
    public static int totalProducts=0;
    public String productName;
    public double price;
    public int quantity;
    public static void resetInventory()
    {
        totalProducts=0;
    }
    public static int getTotalProducts()
    {
        return totalProducts;
    }
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }
    public void updatePrice(double newPrice)
    {
    price = newPrice;
    }
    public void restock(int additionalQuantity)
    {
    quantity += additionalQuantity;
    }
    public String getProductDetails() {
        return "Product Name: " + productName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

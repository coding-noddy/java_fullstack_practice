package com.inventory.product;

public class GroceryProduct extends Product {
    private int expiryDays;

    public int getExpiryDays() {
        return this.expiryDays;
    }

    public GroceryProduct(int id, String name, double price, int expiryDays) {
        super(id, name, price);
        this.expiryDays = expiryDays;
    }
 
    @Override
    public double getDiscountedPrice() {
        return this.expiryDays < 3 ? getPrice() * 0.8: getPrice() * 0.95; 
    }

    public String toString() {
        return super.toString() + String.format("%15.2f%8d", getDiscountedPrice(), expiryDays);
    }
}
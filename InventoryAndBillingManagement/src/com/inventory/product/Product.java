package com.inventory.product;

public abstract class Product {
    private int id;
    private String name;
    private double price;
    private static int PRODUCT_ID = 1;

    public int getId() { return this.id; }

    public String getName() { return this.name; }

    public double getPrice() { return this.price; }

    public abstract double getDiscountedPrice();

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("%4d%15s%15.2f", this.id, this.name, this.price);
    }
}
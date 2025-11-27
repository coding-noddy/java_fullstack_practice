package com.inventory.product;

public class ElectronicProduct extends Product {
    private int warrantyYears;

    public ElectronicProduct(int id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return this.warrantyYears;
    }
 
    @Override
    public double getDiscountedPrice() {
        return warrantyYears > 2 ? getPrice() * 0.9 : getPrice() * 0.97;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%15.2f%8d", getDiscountedPrice(), warrantyYears);
    }
}
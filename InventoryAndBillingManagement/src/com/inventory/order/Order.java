package com.inventory.order;

import com.inventory.product.Product;
import com.inventory.customer.Customer;

public class Order implements Billable {
    protected Customer customer;
    protected Product[] items;
    private int countOfProducts;

    public Order(Customer customer) {
        this.customer = customer;
        items = new Product[Billable.MAX_ITEMS];
    }

    public void addItem(Product product) {
        if (countOfProducts < 10) {
            items[countOfProducts++] = product;
        } else {
            System.out.println("Maximum items in one order reached. Please create another order!");
        }
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for(int i = 0; i < countOfProducts; i++) {
            total += items[i].getDiscountedPrice();
        }
        return total;
    }

    public void printItems() {
        System.out.printf("%4s%15s%15s%15s%15s\n", "ID", "Name", "Price", "Discounted Price", "Days/Year");
        
        for(int i = 0; i < countOfProducts; i++) {
            System.out.println(items[i]);
        }
    }

    @Override
    public void printBill() {
        System.out.println("--- Customer Bill ---");
        System.out.println(customer);
        System.out.println("Items Purchased: ");
        printItems();
    }
}
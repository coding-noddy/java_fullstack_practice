package com.inventory.order;

public interface Billable {
    int MAX_ITEMS = 10;
    double calculateTotal();
    void printBill();
}
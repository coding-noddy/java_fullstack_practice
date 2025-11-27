package com.inventory.customer;

public class Customer {
    protected int id;
    protected String name;
    protected String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer: " + name + "(ID: " + id + ")\n" +
                "Email: " + email;
    }
}
package com.example.demo.customerorder;

import com.example.demo.customer.Customer;
import com.example.demo.product.Product;

public class Order {
    private final int orderNu;
    private final String productName;
    private final int count;
    private final String customerName;

    public Order(int orderNu, String productName, int count, String customerName) {
        this.orderNu = orderNu;
        this.productName = productName;
        this.count = count;
        this.customerName = customerName;
    }

    public int getOrderNu() {
        return orderNu;
    }

    public String getProductName() {
        return productName;
    }

    public int getCount() {
        return count;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNu=" + orderNu +
                ", productName='" + productName + '\'' +
                ", count=" + count +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

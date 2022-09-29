package com.example.demo.product;

import org.springframework.stereotype.Component;

public class Product {
    private final String productName;
    private final String manufacturer;
    private final int price;
    private final int inStockNumber;

    public Product(String productName, String manufacturer, int price, int inStockNumber) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.inStockNumber = inStockNumber;
    }
}

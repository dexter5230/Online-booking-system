package com.example.demo.customerorder;

import com.example.demo.customer.Customer;
import com.example.demo.product.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class OrderRepository implements OrderRepo{
    @Override
    public List<Order> getCustomerOrders() {
        return Arrays.asList(
                new Order(4112, "Toy plane",10, "Sam"),
                new Order(4113, "toy babie", 1, "Tina"));
    }
}

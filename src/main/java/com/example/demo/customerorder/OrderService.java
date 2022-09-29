package com.example.demo.customerorder;

import com.example.demo.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrderService {
    private final OrderRepo orderRepo;
    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public List<Order> getCustomerOrders(){
        return orderRepo.getCustomerOrders();
    }
}

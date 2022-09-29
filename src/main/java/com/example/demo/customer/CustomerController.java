package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api/v1/customer")

@RestController
@Deprecated
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(value = "all")
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST REQUEST.....");
        System.out.println(customer);
    }
    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("UPDATE REQUEST.....");
        System.out.println(customer);
    }
    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("Delete request for customer with ID " + id);
    }

}

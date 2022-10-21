package com.example.demo;

import com.example.demo.customer.CustomerController;
import com.example.demo.customerorder.OrderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private final CustomerController customerController;
	private final OrderController orderController;
	@Autowired
	public DemoApplication(CustomerController customerController, OrderController orderController) {
		this.customerController = customerController;
		this.orderController = orderController;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@GetMapping
//	List<Customer> getCustomer(){
//		return customerController.getCustomer();
//	}
//	@GetMapping
//	List<Order> getOrder() {
//		return orderController.getCustomerOrders();
//	}

}

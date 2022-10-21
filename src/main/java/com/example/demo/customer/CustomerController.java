package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(path = "api/v1/customer")

@RestController
@Deprecated
public class CustomerController {
    private final StudentService studentService;

    @Autowired
    public CustomerController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(value = "all")
    public List<Student> getCustomer(){
        return studentService.getCustomer();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Student student) {
        System.out.println("POST REQUEST.....");
        System.out.println(student);
    }
    @PutMapping
    void updateCustomer(@RequestBody Student student) {
        System.out.println("UPDATE REQUEST.....");
        System.out.println(student);
    }
    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("Delete request for customer with ID " + id);
    }

}

package com.example.demo.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    List<Student> getCustomer(){
        return studentRepo.findAll();
    }
}

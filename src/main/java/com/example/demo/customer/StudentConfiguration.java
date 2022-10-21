package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner() {
        return arg -> {
            System.out.println("Command line runner hooray");
        };
    }

}

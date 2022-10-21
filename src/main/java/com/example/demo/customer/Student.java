package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table

public class Student {
        @Id
        @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
        @GeneratedValue(strategy = SEQUENCE, generator = "student_sequence")
        private  Long id;
        @Column(name = "student_name",nullable = false, columnDefinition = "TEXT")
        private  String name;
        @Column(name = "password",nullable = false, columnDefinition = "TEXT")
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private  String password;

        public Student(Long id, String name, String password) {
            this.id = id;
            this.name = name;
            this.password = password;
        }
        public Student(String name, String password) {
            this.name = name;
            this.password = password;
        }

    public Student() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        @JsonIgnore
        public String  getPassword(){
            return password;
        }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

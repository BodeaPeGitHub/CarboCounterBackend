package com.example.carbcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarbCounterApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarbCounterApplication.class, args);
        System.out.println("Application started..");
    }
}

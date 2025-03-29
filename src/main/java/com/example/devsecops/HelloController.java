package com.example.devsecops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from DevSecOps POC!";
    }
    
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}

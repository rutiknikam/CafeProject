package com.example.CafeProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColdCofee {
    @GetMapping  ("/mycoldcoffee")
    public String getData() {
        return "Order Your coldcoffee online";
    }
    }

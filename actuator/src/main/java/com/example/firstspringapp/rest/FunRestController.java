package com.example.firstspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //creating a / route

    @GetMapping("/")
    public String sayHello(){
        return "Hello there!";
    }
}

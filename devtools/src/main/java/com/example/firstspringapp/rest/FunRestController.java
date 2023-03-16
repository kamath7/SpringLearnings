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

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "10k completed!";
    }

    @GetMapping("/fortuneCookie")
    public String fortuneCookie(){
        return "You have hit the jackpot!";
    }
}

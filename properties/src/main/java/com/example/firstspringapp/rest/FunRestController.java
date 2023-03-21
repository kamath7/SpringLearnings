package com.example.firstspringapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //creating a / route

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return coachName+ " -> "+teamName;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello there!";
    }
}

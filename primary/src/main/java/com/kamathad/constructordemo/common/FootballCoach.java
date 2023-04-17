package com.kamathad.constructordemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice running drills by sprinting!";
    }
}

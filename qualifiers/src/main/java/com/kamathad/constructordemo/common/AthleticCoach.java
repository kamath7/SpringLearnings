package com.kamathad.constructordemo.common;

import org.springframework.stereotype.Component;

@Component
public class AthleticCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice 5k";
    }
}

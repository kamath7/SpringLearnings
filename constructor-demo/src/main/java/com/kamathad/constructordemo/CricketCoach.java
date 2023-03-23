package com.kamathad.constructordemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "{ractoce strokes for 25 minutes";
    }
}

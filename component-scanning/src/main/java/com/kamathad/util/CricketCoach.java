package com.kamathad.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice strokes for 25 minutes";
    }
}

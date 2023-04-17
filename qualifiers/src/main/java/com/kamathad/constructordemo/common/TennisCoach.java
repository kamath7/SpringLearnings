package com.kamathad.constructordemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Daily workout by practicing smashes!";
    }
}

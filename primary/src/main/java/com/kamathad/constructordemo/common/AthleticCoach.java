package com.kamathad.constructordemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AthleticCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice 5k";
    }
}

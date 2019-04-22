package com.spencer.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice putting for 2 hours";
    }
}

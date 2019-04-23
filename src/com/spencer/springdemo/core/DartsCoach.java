package com.spencer.springdemo.core;

import com.spencer.springdemo.service.FortuneService;
import com.spencer.springdemo.service.LoveFortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DartsCoach implements Coach {

    FortuneService fortuneService;

    public DartsCoach(@Qualifier("loveFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice doubles for one hour and drink 10 pints of ale";
    }

    @Override
    public String getDailyfortune() {
        return fortuneService.getFortune();
    }
}

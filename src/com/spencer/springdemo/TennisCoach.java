package com.spencer.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside default tennisCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast serves and backhand volley";
    }

    @Override
    public String getDailyfortune() {
        return fortuneService.getFortune();
    }

}

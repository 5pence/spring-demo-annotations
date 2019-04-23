package com.spencer.springdemo;

import com.spencer.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside default tennisCoach constructor");
    }

    @PostConstruct
    void init() {
        System.out.println("inside do my startup stuff");
    }

    @PreDestroy
    void preDestroy() {
        System.out.println("inside preDestroy");
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

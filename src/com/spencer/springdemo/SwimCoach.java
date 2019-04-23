package com.spencer.springdemo;

import com.spencer.springdemo.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice butterfly stroke for 20 lengths";
    }

    @Override
    public String getDailyfortune() {
        return fortuneService.getFortune();
    }

}

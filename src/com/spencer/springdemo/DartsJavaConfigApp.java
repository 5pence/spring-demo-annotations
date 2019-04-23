package com.spencer.springdemo;

import com.spencer.springdemo.config.DartsConfig;
import com.spencer.springdemo.core.Coach;
import com.spencer.springdemo.core.DartsCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DartsJavaConfigApp {

    public static void main(String[] args) {
        // read spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DartsConfig.class);

        // get bean from container
        Coach coach = context.getBean("dartsCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyfortune());
        System.out.println(coach.getDailyWorkout());

        // close the bean
        context.close();
    }


}


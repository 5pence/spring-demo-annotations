package com.spencer.springdemo;

import com.spencer.springdemo.config.SportConfig;
import com.spencer.springdemo.core.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean from container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyfortune());
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());

        // close the bean
        context.close();
    }
}
